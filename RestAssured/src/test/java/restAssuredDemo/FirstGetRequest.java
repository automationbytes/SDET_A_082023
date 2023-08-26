package restAssuredDemo;

import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matcher.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class FirstGetRequest {



    @Test
    public void getReq() {
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer 18e32203-34cc-469e-9ee2-d262da5eb4fa")
                .when()
                .get("/api/Coffees_V2")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());

    }
        @Test
        public void validateStatusCde(){
            RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
            Response response = RestAssured.given()
                    .header("Authorization", "Bearer 18e32203-34cc-469e-9ee2-d262da5eb4fa")
                    .when()
                    .get("/api/Coffees_V2")
                    .then()
                    .extract().response();

            System.out.println(response.statusCode());
            Assert.assertEquals(response.statusCode(),200);
            System.out.println(response.asPrettyString());

    }


    @Test
    public void usingAssertThat(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        RestAssured.given()
                .header("Authorization", "Bearer 18e32203-34cc-469e-9ee2-d262da5eb4fa")
                .when()
                .get("/api/Coffees_V2")
                .then()
                .assertThat()
                .statusCode(200)
                .body("Id",hasItem(110));
    }



    @Test
    public void getRequsingJsonPath() {
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer 18e32203-34cc-469e-9ee2-d262da5eb4fa")
                .when()
                .get("/api/Coffees_V2")
                .then()
                .extract().response();

       // System.out.println(response.asPrettyString());

        //json path - jayway
        String description = JsonPath.read(response.asString(),"$..[?(@.Id==19)].Description").toString();
        System.out.println(description);
        Assert.assertTrue(description.contains(""));

        //restassured itself
        String desc = response.path("find { it.Id == 19 }.Description");
        System.out.println(desc);

        //assertThat(description,containsString("The Tase is Different"));
      //  assertThat(response.body().path(),);
    }
}

package restAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DeleteReq {
    @Test
    public void DeleteReq(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer 18e32203-34cc-469e-9ee2-d262da5eb4fa")
                .when()
                .delete("/api/Coffees_V2/29")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());

    }

    @Test(dependsOnMethods = "DeleteReq")
    public void GetReq(){
        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .header("Authorization", "Bearer 18e32203-34cc-469e-9ee2-d262da5eb4fa")
                .when()
                .get("/api/Coffees_V2/29")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());

    }
}

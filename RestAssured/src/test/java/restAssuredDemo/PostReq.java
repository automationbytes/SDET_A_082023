package restAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.annotations.Test;

public class PostReq {

    @Test
    public void firstPostReq(){
       String reqbody = "{\n" +
               "  \"Description\": \"DevLabs Filter Coffee\",\n" +
               "  \"Name\": \"DevLabs Cafe\"\n" +
               "}";

        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 18e32203-34cc-469e-9ee2-d262da5eb4fa")
                .and()
                .body(reqbody)
                .when()
                .post("/api/Coffees_V2")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());
    }
}

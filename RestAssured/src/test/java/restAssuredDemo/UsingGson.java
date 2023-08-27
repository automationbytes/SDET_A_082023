package restAssuredDemo;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UsingGson {
    public static void main(String[] args) {

        Gson gson = new Gson();
        PostPOJOResponse pojoResponse = new PostPOJOResponse();
        pojoResponse.setName("GSON Coffee Shop");
        pojoResponse.setDescription("GSON Coffee Shop");

        String postReqBody = gson.toJson(pojoResponse);

        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 18e32203-34cc-469e-9ee2-d262da5eb4fa")
                .and()
                .body(postReqBody)
                .when()
                .post("/api/Coffees_V2")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());

    }
}

package restAssuredDemo;

import com.google.gson.Gson;
import com.jayway.jsonpath.JsonPath;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Reusable_PostReq {


    public static Response performPostRequest(String baseURI, String accessToken, String endPoint,Object requestBody){
        return RestAssured.given()
                .baseUri(baseURI)
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer "+accessToken)
                .and()
                .body(requestBody)
                .when()
                .post(endPoint)
                .then()
                .extract().response();

    }

    public static void main(String[] args) {
        String baseURI = "http://webservice.toscacloud.com/rest";
        String endPoint = "/api/Coffees_V2";
        String accessToken = "18e32203-34cc-469e-9ee2-d262da5eb4fa";
        Gson gson = new Gson();
        PostPOJOResponse pojoResponse = new PostPOJOResponse();
        pojoResponse.setName("GSON Coffee Shop");
        pojoResponse.setDescription("GSON Coffee Shop");

        String postReqBody = gson.toJson(pojoResponse);

        Response response = performPostRequest(baseURI,accessToken,endPoint,postReqBody);
        System.out.println(response.asPrettyString());

        int Id = JsonPath.read(response.asString(),"$.Id");
        System.out.println(Id);
    }
}

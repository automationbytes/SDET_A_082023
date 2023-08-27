package restAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

public class PostRequsingJsonObj {
    public static void main(String[] args) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("Description","ABytes Coffee");
        jsonObject.put("Name","Hello A-Bytes");



//        JSONObject params = new JSONObject();
//        params.put("name","name1");
//        params.put("value","value1");
//        JSONArray jsonArray = new JSONArray();
//      jsonArray.put("params");

        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 18e32203-34cc-469e-9ee2-d262da5eb4fa")
                .and()
                .body(jsonObject.toString())
                .when()
                .post("/api/Coffees_V2")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());



    }
}

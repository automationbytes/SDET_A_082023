package restAssuredDemo;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class PostRequsingMap {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("Description","Indian Traditional Delight Filter Coffee");
        map.put("Name", "Indian Filter Coffee");
        JSONObject jsonObject = new JSONObject(map);

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

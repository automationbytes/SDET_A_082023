package restAssuredDemo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequsingPojo {
    public static void main(String[] args) throws JsonProcessingException {

      //  PostPOJOResponse pojoResponse = new PostPOJOResponse("Coffee Delight",24,"Coffee Delight");

        ObjectMapper objectMapper = new ObjectMapper();

        PostPOJOResponse pojoResponse = new PostPOJOResponse();
       // pojoResponse.setId(null);
        pojoResponse.setDescription("DevLabs Cafe");
        pojoResponse.setName("DevLabs Cafe");

        String postreqBdy = objectMapper.writeValueAsString(pojoResponse);





        RestAssured.baseURI = "http://webservice.toscacloud.com/rest";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 18e32203-34cc-469e-9ee2-d262da5eb4fa")
                .and()
                .body(postreqBdy)
                .when()
                .post("/api/Coffees_V2")
                .then()
                .extract().response();

        System.out.println(response.asPrettyString());


    }
}

package apiController;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;


public class  PostLogin {

    public void postLogin(){

        RestAssured.baseURI = "https://api-dev.jejak.in/guardian/login";
        RestAssured.basePath="user";

        File json = new File("C:\\Users\\Lenovo\\IdeaProjects\\ApiRestAssured\\postlogin.json");

        Response response = given().contentType(ContentType.JSON).log().all().body(json).post();

        response.prettyPrint();


    }
}

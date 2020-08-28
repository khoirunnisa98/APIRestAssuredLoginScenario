package apiController;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.given;


public class GetUsers {

    public void getusers(){

        RestAssured.baseURI = "https://api-dev.jejak.in/guardian";
        RestAssured.basePath="user";


        RequestSpecification req = given();

        req.given();
        req.contentType(ContentType.JSON);
        req.header("X-TOKEN-JEJAKIN", "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJuYmYiOjE1OTg2MDIyNTUsImlkIjoiMDdhYmMyZTMtNzdhMi00ZDczLTg2OGUtNjkxMDI0NTI3YjNkIiwiZXhwIjoxNjAxMjgwNjU1LCJ0eXBlIjoiUEVSU09OQUwiLCJpYXQiOjE1OTg2MDIyNTUsInVzZXJuYW1lIjoiZmF0aG1haHN1dGF3YXRpQGdtYWlsLmNvbSJ9.dfbbKEPlrNCM7Rvd5Z3GqC7yr1LKwtmax_dXw26qUBM");
        req.log();

        Response response = req.get("/");
        response.prettyPrint();


    }
}

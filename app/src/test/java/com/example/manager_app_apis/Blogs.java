package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.hamcrest.core.IsEqual.equalTo;

public class Blogs {
    @Before
    public void BaseURL(){
        RestAssured.baseURI="https://api.sheba.xyz";
    }
    @Test
    public void sManager_blogs_status_code_200(){

        when().get("v1/blogs?offset=0&limit=3").then().statusCode(200).log().all();
    }
    @Test
    public void response_200(){


        when().get("v1/blogs?offset=0&limit=3").then().
                body("code",equalTo(200)).
                body("message", equalTo("Successful"));
    }
   // https://api.dev-sheba.xyz/v1/blogs?offset=0&limit=3
}

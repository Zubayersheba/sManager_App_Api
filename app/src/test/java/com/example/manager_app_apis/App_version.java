package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

public class App_version {

    @Before
    public void setBaseURL(){
        RestAssured.baseURI = "https://api.sheba.xyz";
    }
    @Test
    public void sManager_Version_Check_StatusCode_200()
    {
        given().header("version-code","212009"). when().

                get("v1/versions?app=manager_app_android&version=212009")
                .then().statusCode(200).log().all();
    }

   /* https://api.dev-sheba.xyz/v1/versions?app=manager_app_android&version=212009
    version-code: 212009
    {"code":200,"message":"Successful","data":{"title":null,"body":null,"height":null,"width":null,"image_link":null,"has_update":0,"is_critical":0}}
*/

}

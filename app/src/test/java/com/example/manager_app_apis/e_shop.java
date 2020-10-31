package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class e_shop {
    @Before
    public void baseURL(){
        RestAssured.baseURI="https://api.dev-sheba.xyz";
    }
    @Test
    public void services_response(){
        when().get("v2/services?is_business=1&lat=23.798260083979695&lng=90.40489386767149").then()
                .statusCode(200)
                .body("code",equalTo(200))
                .body("message",equalTo("Successful"));
    }
    @Test
    public void locations_response(){
        when().get("v2/locations/current?lat=23.798260083979695&lng=90.40489386767149").then()
                .statusCode(200)
                .body("code",equalTo(200))
                .body("message",equalTo("Successful"));
    }

    @Test
    public void customerInfo_response(){
        when().get("v2/partners/37732/my-customer-info?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep").then()
                .statusCode(200)
                .body("code",equalTo(200))
                .body("message",equalTo("Successful"));
    }
   /* https://api.dev-sheba.xyz/v2/services?is_business=1&lat=23.798260083979695&lng=90.40489386767149
    https://api.dev-sheba.xyz/v2/locations/current?lat=23.798260083979695&lng=90.40489386767149
    https://api.dev-sheba.xyz/v2/partners/37732/my-customer-info?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep
*/
}

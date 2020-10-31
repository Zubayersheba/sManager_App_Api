package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class Emi {

@Before
    public void baseURL(){
        RestAssured.baseURI="https://api.dev-sheba.xyz";
    }
    @Test
    public void emiHome_response(){
        when().get("v2/partners/37732/emi/home?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep").then()
                .statusCode(200)
                .body("code",equalTo(200))
                .body("message",equalTo("Successful"));
    }
    @Test
    public void emi_response(){
        when().get("v2/partners/37732/emi?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&recent=1").then()
                .statusCode(200)
                .body("code",equalTo(200))
                .body("message",equalTo("Successful"));
    }

    //https://api.dev-sheba.xyz/v2/partners/37732/emi/home?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep
    //https://api.dev-sheba.xyz/v2/partners/37732/emi?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&recent=1
}

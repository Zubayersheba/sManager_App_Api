package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class Gift_shop {

    @Before
    public void baseUrl(){
        RestAssured.baseURI="https://api.dev-sheba.xyz";
    }
    @Test
    public void response_200(){
        when().get("v2/partners/37732/rewards/shop?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep").then()
                .statusCode(200).body("code",equalTo(200))
                .body("message",equalTo("Successful")).log().all();
    }

    //https://api.dev-sheba.xyz/v2/partners/37732/rewards/shop?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep
}

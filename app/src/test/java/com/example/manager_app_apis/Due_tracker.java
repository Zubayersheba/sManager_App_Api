package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class Due_tracker {

    @Before
    public void baseURL(){
        RestAssured.baseURI="https://api.dev-sheba.xyz";
    }
    @Test
    public void status_code_200(){
        when().get("v2/partners/37732/due-tracker/due-list?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&order_by=name&order=asc&balance_type=&q=&limit=20&offset=0").then().
                statusCode(200).log().all();
    }
    @Test
    public void response_200(){
        when().get("v2/partners/37732/due-tracker/due-list?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&order_by=name&order=asc&balance_type=&q=&limit=20&offset=0")
                .then().body("code", equalTo(200)).body("message", equalTo("Successful"));

    }

    //https://api.dev-sheba.xyz/v2/partners/37732/due-tracker/due-list?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&order_by=name&order=asc&balance_type=&q=&limit=20&offset=0
}

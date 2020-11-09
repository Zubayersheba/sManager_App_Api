package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class Expense_tracker {
    @Before
    public void baseurl()
    {
        RestAssured.baseURI="https://api.dev-sheba.xyz";
    }
    @Test
    public  void response_200(){
        when().get("v2/partners/37732/income-expense?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&frequency=month&month=10&year=2020").then()
                .statusCode(200).body("code",equalTo(200)).log().all();

    }


    //https://api.dev-sheba.xyz/v2/partners/37732/income-expense?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&frequency=month&month=10&year=2020
}

package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static org.hamcrest.CoreMatchers.equalTo;

public class Topup {
    @Before
    public void baseURL(){
        RestAssured.baseURI="https://api.dev-sheba.xyz";
    }
    //Topup success without password
    //Expected : Recharge Request Successful
    @Test
    public void top_up_success()
    {
        RequestSpecification request = RestAssured.given();
        String body= "{\"mobile\": \"01678242967\",   \"vendor_id\": \"2\", \"connection_type\": \"postpaid\", \"remember_token\": \"naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep\",  \"amount\": \"10\" }";
        request.header("Content-Type", "application/json");
        request.body(body);
        request.post("/v2/partners/37732/top-up").
                then().statusCode(200).log().all().assertThat().body("message", equalTo("Recharge Request Successful"));
    }
    //Test case 2: password is required in body
    //Expected : Recharge Request Successful
    @Test
    public void top_up_success_with_password(){
        RequestSpecification request = RestAssured.given();
        String body= "{\"mobile\": \"01678242967\",   \"vendor_id\": \"2\", \"connection_type\": \"postpaid\", \"remember_token\": \"naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep\",  \"amount\": \"10\",\"password\":\"12345\" }";
        request.header("Content-Type", "application/json");
        request.body(body);
        request.post("/v2/partners/37732/top-up").
                then().statusCode(200).log().all().assertThat().body("message", equalTo("Recharge Request Successful"));
    }

    //Test case 2: password is wrong in body
    //expected result : Recharge Request unSuccessful / wrong pin

    @Test
    public void top_up_success_with_wrong_password(){
        RequestSpecification request = RestAssured.given();
        String body= "{\"mobile\": \"01678242967\",   \"vendor_id\": \"2\", \"connection_type\": \"postpaid\", \"remember_token\": \"naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep\",  \"amount\": \"10\",\"password\":\"54321\" }";
        request.header("Content-Type", "application/json");
        request.body(body);
        request.post("/v2/partners/37732/top-up").
                then().statusCode(200).log().all().assertThat().body("message", equalTo("Recharge Request unSuccessful / wrong pin"));
    }
    //https://api.dev-sheba.xyz/v2/partners/37732/wallet-balance?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep
    //Topup success without password
    //Expected : Recharge Request unSuccessful / pin required
    @Test
    public void top_up_success_v3_without_password()
    {
        RequestSpecification request = RestAssured.given();
        String body= "{\"mobile\": \"01678242967\",   \"vendor_id\": \"2\", \"connection_type\": \"postpaid\", \"remember_token\": \"naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep\",  \"amount\": \"10\" }";
        request.header("Content-Type", "application/json");
        request.body(body);
        request.post("/v3/partners/37732/top-up").
                then().statusCode(200).log().all().assertThat().body("code", equalTo(400)).body("message", equalTo("The password field is required."));
    }
    //Test case 2: password is required in body
    //Expected : Recharge Request Successful
    @Test
    public void top_up_success_with_password_v3(){
        RequestSpecification request = RestAssured.given();
        String body= "{\"mobile\": \"01678242967\",   \"vendor_id\": \"2\", \"connection_type\": \"postpaid\", \"remember_token\": \"naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep\",  \"amount\": \"10\",\"password\":\"12345\" }";
        request.header("Content-Type", "application/json");
        request.body(body);
        request.post("/v3/partners/37732/top-up").
                then().statusCode(200).log().all().assertThat().body("message", equalTo("Recharge Request Successful"));
    }

    //Test case 2: password is wrong in body
    //expected result : Recharge Request unSuccessful / wrong pin

    @Test
    public void top_up_success_with_wrong_password_v3(){
        RequestSpecification request = RestAssured.given();
        String body= "{\"mobile\": \"01678242967\",   \"vendor_id\": \"2\", \"connection_type\": \"postpaid\", \"remember_token\": \"naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep\",  \"amount\": \"10\",\"password\":\"54321\" }";
        request.header("Content-Type", "application/json");
        request.body(body);
        request.post("/v3/partners/37732/top-up").
                then().statusCode(200).log().all().assertThat().body("code", equalTo(403)).body("message", equalTo("Pin Mismatch"));
    }
}

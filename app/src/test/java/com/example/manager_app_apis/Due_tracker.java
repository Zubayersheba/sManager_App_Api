package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class Due_tracker {

    public int partner_id=38450;
    public String remember_token="hVASpzMaSWYsSLuI1lZ4zxlUdVFdifG8iCCbui4N4lXzX105Lj4a4LLApBbR";
    public String remember_token_invalid="hVASpzMaSWYsSLuI1lZ4zxlUdVFdifG8iCCbui4N4lXzX105Lj4a4";

    @Before
    public void baseURL(){
        RestAssured.baseURI="https://api.dev-sheba.xyz";
    }
    //Test case: Go to Due tracker landing page-> check server response code-> server response code is 200
    @Test
    public void status_code_200(){
        when().get("v2/partners/"+partner_id+"/due-tracker/due-list?remember_token="+remember_token+"&order_by=name&order=asc&balance_type=&q=&limit=20&offset=0").then().
                statusCode(200).log().all();
    }
    //Test case: Go to Due tracker landing page-> check api response code & message-> api response code is 200 and message is Successful
    @Test
    public void response_200(){
        when().get("v2/partners/"+partner_id+"/due-tracker/due-list?remember_token="+remember_token+"&order_by=name&order=asc&balance_type=&q=&limit=20&offset=0")
                .then().body("code", equalTo(200)).body("message", equalTo("Successful")).log().all();

    }
    //Test case: Go to Due tracker landing page-> check api response with wrong partner remember token-> api response code is 404 and message will be Authentication token is missing from the request
    @Test
    public void response_400(){
        when().get("v2/partners/"+partner_id+"/due-tracker/due-list?remember_token_invalid="+remember_token+"&order_by=name&order=asc&balance_type=&q=&limit=20&offset=0")
                .then().body("code", equalTo(400)).body("message", equalTo("Authentication token is missing from the request.")).log().all();

    }
    //Test case: Go to Due tracker Add customer-> check api response with customer create-> api response code is 200 and message will be Authentication token is missing from the request
    @Test
    public void create_pos_customer(){
       // https://api.dev-sheba.xyz/v2/partners/38450/pos/customers
        //remember_token=hVASpzMaSWYsSLuI1lZ4zxlUdVFdifG8iCCbui4N4lXzX105Lj4a4LLApBbR
                //name=awesome zubayer offg
        //mobile=01678242967


        RequestSpecification request = RestAssured.given();

        String body= "{\"name\":\"awesome zubayer\", \"mobile\":\"01678242968\", \"remember_token\":\"hVASpzMaSWYsSLuI1lZ4zxlUdVFdifG8iCCbui4N4lXzX105Lj4a4LLApBbR\"}";
        request.body(body);
        request.post("https://api.dev-sheba.xyz/v2/partners/38450/pos/customers").then()
        .statusCode(200).log().all().assertThat().body("code",equalTo(200));



    }

    //https://api.dev-sheba.xyz/v2/partners/37732/due-tracker/due-list?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&order_by=name&order=asc&balance_type=&q=&limit=20&offset=0
}

package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class KYC_Information {

    @Before
    public void baseURl(){
        RestAssured.baseURI="https://api.dev-sheba.xyz";

    }
    @Test
    public void kyc_verification_statuscode_200(){
        when().get("v2/partners/37732/kyc/check-verification?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep").
                then().statusCode(200).body("code",equalTo(200)).log().all();
    }


   // https://api.dev-sheba.xyz/v2/partners/37732/kyc/check-verification?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep
    //{"code":200,"message":"Successful","data":{"message":{"en":"Profile verified","bn":"Profile \u09ad\u09c7\u09b0\u09bf\u09ab\u09be\u0987\u09a1"},"status":"verified","message_seen":1,"nid_verification_request_count":5}}

}

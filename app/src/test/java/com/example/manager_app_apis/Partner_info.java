package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;

public class Partner_info {

    @Before
    public void baseURL(){
        RestAssured.baseURI="https://api.dev-sheba.xyz";
    }
    @Test
    public void partner_info_statuscode_200(){
        when().get("v1/partners/37732/info?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep").then().statusCode(200).log().all();
    }

    //https://api.dev-sheba.xyz/v1/partners/37732/info?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep
   // {"code":200,"message":"Successful","info":{"id":37732,"name":"Erp Enterprise","mobile":null,"email":null,"address":"Rfghh","verified_at":null,"status":"Verified","logo":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/images\/partners\/logos\/1591184213_erpenterprise.png","wallet":125221.6,"created_at":"2020-09-10 16:39:30","total_rating":1,"avg_rating":4,"working_days":["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"],"working_hour_starts":"7:00 AM","working_hour_ends":"9:00 PM","locations":[],"subscription":{"id":4,"name":"ESP","show_name":"Advance","show_name_bn":"\u098f\u09a1\u09ad\u09be\u09a8\u09cd\u09b8","badge":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebaxyz\/images\/partners\/package\/1563212340_tiwnn.png"},"total_locations":0,"total_services":14,"total_resources":11,"leave_status":{"status":false,"on_leave_from":null}}}

}

package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.equalTo;

public class Notification_List {

    @Before
    public void baseURL(){
        RestAssured.baseURI="https://api.dev-sheba.xyz";
    }
    @Test
    public void notification_list_statuscode_200(){
        when().get("v1/partners/37732/notifications?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&offset=0&limit=10")
                .then().statusCode(200).
                body("code",equalTo(200)).body("message",equalTo("Successful")).log().all();
    }
    //https://api.dev-sheba.xyz/v1/partners/37732/notifications?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&offset=0&limit=10
    //{"code":200,"message":"Successful","notifications":[{"id":6745843,"title":"Order: D-169529-37732 Served Successfully","event_type":"PartnerOrder","event_id":184190,"type":"Success","is_seen":0,"created_at":"2020-10-13 15:34:09","time":"13 Oct at 03:34 PM","icon":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/sheba_xyz\/png\/notification\/success.png"},{"id":6745841,"title":"Order: D-169529-37732 has been started","event_type":"PartnerOrder","event_id":184190,"type":"Info","is_seen":0,"created_at":"2020-10-13 15:33:47","time":"13 Oct at 03:33 PM","icon":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/sheba_xyz\/png\/notification\/info.png"},{"id":6745839,"title":"Order: D-169596-37732 Served Successfully","event_type":"PartnerOrder","event_id":184258,"type":"Success","is_seen":0,"created_at":"2020-10-13 15:33:29","time":"13 Oct at 03:33 PM","icon":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/sheba_xyz\/png\/notification\/success.png"},{"id":6745837,"title":"750.0 BDT collected for order: D-169596 by awesome zubayer","event_type":"PartnerOrder","event_id":184258,"type":"Info","is_seen":0,"created_at":"2020-10-13 15:33:23","time":"13 Oct at 03:33 PM","icon":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/sheba_xyz\/png\/notification\/info.png"},{"id":6745836,"title":"Order: D-169596-37732 has been started","event_type":"PartnerOrder","event_id":184258,"type":"Info","is_seen":0,"created_at":"2020-10-13 15:33:11","time":"13 Oct at 03:33 PM","icon":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/sheba_xyz\/png\/notification\/info.png"},{"id":6745833,"title":"Order: D-170296-37732 Served Successfully","event_type":"PartnerOrder","event_id":184960,"type":"Success","is_seen":0,"created_at":"2020-10-13 15:29:23","time":"13 Oct at 03:29 PM","icon":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/sheba_xyz\/png\/notification\/success.png"},{"id":6745831,"title":"2100.0 BDT collected for order: D-170296 by awesome zubayer","event_type":"PartnerOrder","event_id":184960,"type":"Info","is_seen":0,"created_at":"2020-10-13 15:29:17","time":"13 Oct at 03:29 PM","icon":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/sheba_xyz\/png\/notification\/info.png"},{"id":6745830,"title":"Order: D-170296-37732 has been started","event_type":"PartnerOrder","event_id":184960,"type":"Info","is_seen":0,"created_at":"2020-10-13 15:29:04","time":"13 Oct at 03:29 PM","icon":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/sheba_xyz\/png\/notification\/info.png"},{"id":6626462,"title":"Tender by Quavy 1","event_type":"NEW_PROCUREMENT","event_id":null,"type":"Info","is_seen":0,"created_at":"2020-10-09 19:22:29","time":"9 Oct at 07:22 PM","icon":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/sheba_xyz\/png\/notification\/info.png"},{"id":6541274,"title":"New Order Placed ID D-170314-37732","event_type":"PartnerOrder","event_id":184978,"type":"Info","is_seen":0,"created_at":"2020-10-06 20:50:35","time":"6 Oct at 08:50 PM","icon":"https:\/\/s3.ap-south-1.amazonaws.com\/cdn-shebadev\/sheba_xyz\/png\/notification\/info.png"}],"unseen":275}

}

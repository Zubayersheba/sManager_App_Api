package com.example.manager_app_apis;

import org.junit.Before;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;

public class Is_Updated_Home_Settings {

    public int partner_id=37732;
    public String remeber_token="aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4";

    @Before
    public void baseURL(){
        RestAssured.baseURI="https://api.sheba.xyz";
    }
    @Test
    public void is_Updated_Home_Settings_statuscode_200(){
        when().get("/v3/partners/"+ partner_id+"/is-updated-home-setting?aCwLKJ3zd4qcKdUfD6IqxAKFmEYz9nZDuxfZllQijcxzCNBZxfhpX6DkfH63NHxJgEgiyyACtyJHb3KzV9cxaxWEynqHUMocc0dLIrqr3EaHGzATXq3IhdrMFc8ZlbOPiTwTSnfqFzwHlhllnGk09uzNUaT5bHSOAB6GTkSnooqJInJxG3NF96McopCGsdVxqJWdtjEuPlqn3zmzdT5WIXCNd4tvefCtgXPbOng4O73ufyDGSv3ivfAUWEZtXt4&last_updated=2020-10-13").then().
                statusCode(200).log().all();
    }
    @Test
    public void is_Updated_Home_Settings_statuscode_200_dev(){
        when().get("https://api.dev-sheba.xyz/v3/partners/"+partner_id+"/is-updated-home-setting?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&last_updated=2020-10-13").then().
                statusCode(200).log().all();
    }

    //https://api.dev-sheba.xyz/v3/partners/37732/is-updated-home-setting?remember_token=naQWZPwPCMQ7iuKL1pMQ7tsKlLMmF39f4XEiBwyF4AShSgvwejSjI0Wdo8ep&last_updated=2020-10-13
   // {"code":200,"message":"Successful","data":{"is_updated":0,"last_updated":"2020-08-23"}}
}

package com.example.manager_app_apis;

import org.junit.Before;

import io.restassured.RestAssured;

public class BaseUrl {
    @Before
    public void baseUrl()
    {
        RestAssured.baseURI="https://api.dev-sheba.xyz";
    }
}

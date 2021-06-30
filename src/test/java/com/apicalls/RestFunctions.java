package com.apicalls;

import com.api_engines.AuthorizationPojo;
import com.dataproviderUtilities.ConfigFileReader;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RestFunctions {
    private static final String BASE_URL = "https://bookstore.toolsqa.com";
    public static String token;
    public static Response response;
    public  ConfigFileReader configFileReader;


    public RestFunctions()
    {
        configFileReader = new ConfigFileReader();
    }
    /**
     * Used to authenticate user
     */

    public  Response authenticateUser(String username,String password,String path) {
        AuthorizationPojo authorizationPojo = new AuthorizationPojo(username,password);
        RestAssured.baseURI = configFileReader.getProperties().getProperty("BASE_URL");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        response = request.body(authorizationPojo).post(path);
        String jsonString = response.asString();
        token = JsonPath.from(jsonString).get("token");
        return response;
    }


    /**
     * Used to call API using GET Method with base URI and path
     */
    public  Response getMethodRESTAPIWithPath(String path) {
        RestAssured.baseURI = configFileReader.getProperties().getProperty("BASE_URL");
        RequestSpecification httpRequest = RestAssured.given();
        response = httpRequest.request(Method.GET, path);
        return response;

    }

    /**
     * Used to call API using GET Method with api URL
     */
    public  Response getMethodRESTAPIWithUri(String uri) {
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, uri);
        return response;
    }

    /**
     * Used to call API using POST Method with base URI, path, headers and input request
     */
    public  Response postMethodRESTAPI(String baseURI, String path, Map<String, String> headers, String body) {
        RestAssured.baseURI = baseURI;
        RequestSpecification request = RestAssured.given();
        if (headers != null) {
            request.headers(headers);
        }
        if (body != null) {
            request.body(body);
        }
        Response response = request.request(Method.POST, path);
        return response;
    }

    /**
     * Used to call API using PUT Method with base URI, path, headers and input request
     */
    public  Response putMethodRESTAPI(String baseURI, String path, Map<String, String> headers, String body) {
        RestAssured.baseURI = baseURI;
        RequestSpecification request = RestAssured.given();
        if (headers != null) {
            request.headers(headers);
        }
        if (body != null) {
            request.body(body);
        }
        Response response = request.request(Method.PUT, path);
        return response;
    }

}


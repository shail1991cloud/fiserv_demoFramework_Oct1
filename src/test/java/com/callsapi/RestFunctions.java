package com.callsapi;

import com.dataproviderUtilities.ConfigFileReader;
import com.enginesApi.AuthorizationPojo;
import com.enginesApi.ProjectsAuthorizationPojo;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.Map;

/**
 * @author Shailendra PS Parihar
 */

public class RestFunctions {
    public static String token;
    public static  Response response;
    public ConfigFileReader configFileReader;


    public RestFunctions() {
        configFileReader = new ConfigFileReader();
    }

    /**
     * Used to authenticate user and generate bearer token
     */

    public Response authenticateUser(String username, String password, String path) {
        AuthorizationPojo authorizationPojo = new AuthorizationPojo(username, password);
        RestAssured.baseURI = configFileReader.getProperties().getProperty("BASE_URL");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        response = request.body(authorizationPojo).post(path);
        String jsonString = response.asString();
        token = JsonPath.from(jsonString).get("token");
        return response;
    }

    /**
     * Used to validate created Project in dil-core backend api
     */
    public Response authenticateProject(String Query, String ProjectName, String path) {
        RestAssured.baseURI = configFileReader.getProperties().getProperty("URI");
        RequestSpecification request = RestAssured.given();
        response = request.queryParam(Query, ProjectName).get(path);
        String jsonString = response.asString();
        System.out.println(response.getStatusCode());
        Assert.assertEquals(jsonString.contains(ProjectName), true);
        Assert.assertEquals(200, (response.getStatusCode()));
        return response;
    }


    /**
     * Used to call API using GET Method with base URI and path
     */
    public Response getMethodRESTAPIWithPath(String path) {
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

    public Response authenticateUserForDIL() {
        ProjectsAuthorizationPojo authorizationPojo = new ProjectsAuthorizationPojo("dil-ui","ovrzCm54Zu+q2SuJIhaOnA==","Lp4,mLd:","parihars");
        RestAssured.baseURI = configFileReader.getProperties().getProperty("BASE_URL");
        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        response = request.body(authorizationPojo).post("/authservice/login");
        String jsonString = response.asString();
        token = JsonPath.from(jsonString).get("access_token");
        return response;
    }

}


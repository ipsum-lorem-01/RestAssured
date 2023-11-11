

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;



public class Activity {
    @Test
    public void getRequest() {
        RestAssured.baseURI= "https://content-qkart-qa-backend.azurewebsites.net";
        RestAssured.basePath = "/api/v1/products";
        RequestSpecification requestSpecification = RestAssured.given();
        requestSpecification.queryParam("value", "key");
        Response response = requestSpecification.request(Method.GET);
        System.out.println(response.getStatusCode());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getBody().asString());

    }

    // @Test
    public void getRequestWithParams() {

    }

    // @Test
    public void basicAuth() {
        RequestSpecification httpRequest = RestAssured.given();

        Response res = httpRequest.get("https://postman-echo.com/basic-auth");
        String rbdy = res.body().asString();
        System.out.println("Data from the GET API- " + rbdy);

    }

    // @Test
    public void bearerToken() {

    }

    // @Test
    public void validateJSONSchema() {

    }

    // @Test
    public void validateWithHamcrestProductName() {

    }

}


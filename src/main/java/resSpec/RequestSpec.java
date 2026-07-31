package resSpec;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    public RequestSpecification resSpecAuth(String baseUrl, Object obj){

        RequestSpecification request = RestAssured.given();
        request.spec(new RequestSpecBuilder().setContentType(ContentType.JSON).build().log().all());
        request.baseUri(baseUrl);
        request.body(obj);

        return request;

    }


    public RequestSpecification resSpecGet(String baseUrl){

        RequestSpecification request = RestAssured.given();
        request.spec(new RequestSpecBuilder().setContentType(ContentType.JSON).build().log().all());
        request.baseUri(baseUrl);

        return request;

    }
}

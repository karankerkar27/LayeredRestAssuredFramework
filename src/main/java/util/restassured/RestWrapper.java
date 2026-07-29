package util.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestWrapper {

    public Response post(RequestSpecification obj){
        return obj.post();
    }

    public Response get(RequestSpecification obj){
        return obj.get();
    }

    public Response delete(RequestSpecification obj){
        return obj.delete();
    }

    public Response put(RequestSpecification obj){
        return obj.put();
    }

    public Response patch(RequestSpecification obj){
        return obj.patch();
    }
}

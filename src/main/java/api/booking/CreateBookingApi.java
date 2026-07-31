package api.booking;

import data.CreateBookingData;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.CreateBookingPojo;
import resSpec.RequestSpec;
import util.config.ConfigFileReader;
import util.restassured.RestWrapper;

public class CreateBookingApi {
    Response response;

    RestWrapper rest = new RestWrapper();

    RequestSpec requestSpec = new RequestSpec();

    ConfigFileReader reader = new ConfigFileReader();

    public Response createBookingApi(String to, String from, String firstName, String lastName, String depositPaid, String additionalNeeds, String totalPrice){

        String baseUrl = reader.getProperty("baseUri") + reader.getProperty("booking");

        CreateBookingData data = new CreateBookingData();

        CreateBookingPojo pojo = data.setCreateBookingData(to, from, firstName, lastName, depositPaid, additionalNeeds, totalPrice);

        RequestSpecification res = requestSpec.resSpecPost(baseUrl, pojo);

        response = rest.post(res);

        return response;


    }
}

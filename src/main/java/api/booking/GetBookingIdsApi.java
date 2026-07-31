package api.booking;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import resSpec.RequestSpec;
import util.config.ConfigFileReader;
import util.restassured.RestWrapper;

public class GetBookingIdsApi {

    Response response;

    ConfigFileReader configFileReader = new ConfigFileReader();

    RestWrapper rest = new RestWrapper();

    RequestSpec requestSpec = new RequestSpec();

    /**
     * Return booking details based on ids
     * @param id
     */
    public Response getBookingIds(int id){

        String baseUrl = configFileReader.getProperty("baseUri") + configFileReader.getProperty("booking") + "/" + id;

        RequestSpecification res = requestSpec.resSpecGet(baseUrl);

        response = rest.post(res);

        return response;

    }


}

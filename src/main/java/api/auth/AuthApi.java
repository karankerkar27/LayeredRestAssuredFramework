package api.auth;

import data.AuthData;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pojo.AuthPojo;
import resSpec.RequestSpec;
import util.config.ConfigFileReader;
import util.restassured.RestWrapper;


public class AuthApi {

    Response response;

    ConfigFileReader configFileReader = new ConfigFileReader();

    RestWrapper rest = new RestWrapper();

    RequestSpec requestSpec = new RequestSpec();

    /**
     * This api returns a token in the form of String
     * @return String
     */
    public String authorizationApi(){

        String baseUrl = configFileReader.getProperty("baseUri") + configFileReader.getProperty("auth");

        AuthPojo authPojo = new AuthPojo();
        AuthData authData = new AuthData();

        //Sending default username and password for now. no need for generating token for all users
        authPojo = authData.setAuthData(authPojo, "admin","password123");


        RequestSpecification res = requestSpec.resSpecAuth(baseUrl, authPojo);

        response = rest.post(res);

        return response.asString();

    }


}

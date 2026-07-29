package steps;

import api.auth.AuthApi;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;

public class authSteps {

    Response response;

    @Given("All details for authorization api is correct")
    public void allDetailsForAuthorizationApiIsCorrect(){
        AuthApi authApi = new AuthApi();
        System.out.println(authApi.authorizationApi());

    }
}

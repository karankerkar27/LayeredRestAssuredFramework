package steps;

import api.booking.CreateBookingApi;
import api.booking.GetBookingIdsApi;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojo.CreateBookingPojo;

public class BookingSteps {

    Response response;

    @When("User wants to retrieve booking using booking id")
    public void userWantsToRetrieveBookingUsingBookingId() {
        GetBookingIdsApi getBookingDetails = new GetBookingIdsApi();
        response = getBookingDetails.getBookingIds(155);
        String x = response.asString();
        System.out.println(x);

    }


    @When("User select {string} and {string} and enters {string} , {string} , {string} and {string} and {string}")
    public void userSelectAndAndEntersAnd(String to, String from, String firstname, String lastname, String depositPaid, String additionalneeds, String totalPrice) {

        CreateBookingApi createBooking = new CreateBookingApi();
        response = createBooking.createBookingApi(to, from, firstname, lastname, depositPaid, additionalneeds, totalPrice);
        JsonPath jsp = response.jsonPath();
        String x = jsp.getString("bookingid");
        System.out.println(x);

    }
}

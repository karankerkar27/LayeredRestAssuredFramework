package steps;

import api.booking.GetBookingIdsApi;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class BookingSteps {

    Response response;

    @When("User wants to retrieve booking using booking id")
    public void userWantsToRetrieveBookingUsingBookingId() {
        GetBookingIdsApi getBookingDetails = new GetBookingIdsApi();
        response = getBookingDetails.getBookingIds(155);
        String x = response.asString();
        System.out.println(x);

    }


}

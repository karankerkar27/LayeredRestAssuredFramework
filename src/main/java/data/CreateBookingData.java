package data;

import pojo.CreateBookingPojo;
import pojo.bookingdates;

public class CreateBookingData {

    public CreateBookingPojo setCreateBookingData(String to, String from, String firstName, String lastName, String depositPaid, String additionalNeeds, String totalPrice){
        //Set the dates class first
        bookingdates dates = new bookingdates();
        dates.setCheckin(to);
        dates.setCheckout(from);

        //Set the main pojo for booking
        CreateBookingPojo bookingPojo = new CreateBookingPojo();
        bookingPojo.setFirstname(firstName);
        bookingPojo.setLastname(lastName);
        bookingPojo.setDepositpaid(Boolean.parseBoolean(depositPaid));
        bookingPojo.setTotalprice(Integer.parseInt(totalPrice));
        bookingPojo.setbookingdates(dates);
        bookingPojo.setAdditionalneeds(additionalNeeds);

        return bookingPojo;
    }
}

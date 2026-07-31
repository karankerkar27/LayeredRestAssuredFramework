@BookingFeature
Feature: Authorization Feature

  Background:
    Given All details for authorization api is correct


  @Booking
  Scenario: Get Booking using booking id
    When User wants to retrieve booking using booking id
    #Then Verify booking details are return successfully


  @Booking
  Scenario Outline: Create a bookng
    When User select "<to>" and "<from>" and enters "<fisrtname>" , "<lastname>" , "<depositPaid>" and "<additionalneeds>" and "<totalprice>"
    #Then confirm booking is created
    Examples:
      | to         | from       | fisrtname | lastname | depositPaid | additionalneeds | totalprice |
      | 2018-01-01 | 2019-01-01 | Karan     | K        | true        | Breakfast       | 12000      |

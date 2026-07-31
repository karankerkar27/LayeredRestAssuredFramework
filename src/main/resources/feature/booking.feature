@BookingFeature
Feature: Authorization Feature

  Background:
    Given All details for authorization api is correct


  @Auth
  Scenario: Creating Auth token
    When User wants to retrieve booking using booking id
    #Then Verify booking details are return successfully
#Author: your.email@your.domain.com
Feature: Book flight ticket in Singapore Airlines

  Scenario: To book a flight ticket in Singapore Airlines
    Given User launches Singapore Airlines application
    And User logins using credentials
    When User navigates into the page and choose ticket as per the requirement
    And Book the flight ticket & proceed to payment option
    Then Message to be displayed as ticket has been booked
    And Receive confirmation regarding booking to mail address

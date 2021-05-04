Feature: Add Offer Feature in Admin Page

  Background:
    Given The Admin Page is Open after demo authentication
    And Offers DropDown Menu is Clicked
    And Manage Offers panel is Clicked
    And Add Button is Clicked

    Scenario Outline:
      Given '<offerTitleField>' is filled with '<offerTitle>'
      When Offer Submit Button is Clicked
      Then The Offer '<errorMessage>' is Shown
      And Logout Button is Clicked
      Examples:
      |offerTitleField|offerTitle|errorMessage                                                                |
      |offertitle     |New Offer |The Offer Description field is required.                                    |
      |offertitle     |          |The Offer Title field is required.\nThe Offer Description field is required.|

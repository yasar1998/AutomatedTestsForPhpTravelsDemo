Feature: Rentals Menu Feature in Admin Page

  Background:
    Given The Admin Page is Open after demo authentication

  Scenario Outline:
    Given Rentals DropDown Menu is Clicked
    When '<accountTypePath>' is Clicked
    Then Title '<pageTitle>' is Shown
    And Logout Button is Clicked
    Examples:
      |accountTypePath                                  |pageTitle             |
      |/html/body/div[3]/nav/div[2]/ul/li[10]/ul/li[1]/a|Rentals Management\n  |
      |/html/body/div[3]/nav/div[2]/ul/li[10]/ul/li[2]/a|Extras Management\n   |
      |/html/body/div[3]/nav/div[2]/ul/li[10]/ul/li[3]/a|Reviews Management\n  |
      |/html/body/div[3]/nav/div[2]/ul/li[10]/ul/li[4]/a|Rentals Settings\n    |
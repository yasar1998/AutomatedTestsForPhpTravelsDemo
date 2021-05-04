Feature: Hotels Menu Feature in Admin Page

  Background:
    Given The Admin Page is Open after demo authentication

  Scenario Outline:
    Given General DropDown Menu is Clicked
    When '<accountTypePath>' is Clicked
    Then Title '<pageTitle>' is Shown
    And Logout Button is Clicked
    Examples:
      |accountTypePath                                 |pageTitle                      |
      |/html/body/div[3]/nav/div[2]/ul/li[4]/ul/li[1]/a|Application Settings\n         |
      |/html/body/div[3]/nav/div[2]/ul/li[4]/ul/li[2]/a|Currencies Management\n        |
      |/html/body/div[3]/nav/div[2]/ul/li[4]/ul/li[3]/a|Payment Gateways\n             |
      |/html/body/div[3]/nav/div[2]/ul/li[4]/ul/li[4]/a|Social Connections Management\n|
      |/html/body/div[3]/nav/div[2]/ul/li[4]/ul/li[5]/a|Widgets Management\n           |
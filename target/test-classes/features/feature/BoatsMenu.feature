Feature: Boats Menu Feature in Admin Page

  Background:
    Given The Admin Page is Open after demo authentication

  Scenario Outline:
    Given Boats DropDown Menu is Clicked
    When '<accountTypePath>' is Clicked
    Then Title '<pageTitle>' is Shown
    And Logout Button is Clicked
    Examples:
      |accountTypePath                                 |pageTitle             |
      |/html/body/div[3]/nav/div[2]/ul/li[9]/ul/li[1]/a|boats Management      |
      |/html/body/div[3]/nav/div[2]/ul/li[9]/ul/li[2]/a|Add boat              |
      |/html/body/div[3]/nav/div[2]/ul/li[9]/ul/li[3]/a|Extras Management     |
      |/html/body/div[3]/nav/div[2]/ul/li[9]/ul/li[4]/a|Reviews Management    |
      |/html/body/div[3]/nav/div[2]/ul/li[9]/ul/li[5]/a|Boats Settings        |
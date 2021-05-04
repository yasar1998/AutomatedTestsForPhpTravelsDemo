Feature: Accounts Menu Feature in Admin Page

  Background:
    Given The Admin Page is Open after demo authentication

    Scenario Outline:
      Given Accounts DropDown Menu is Clicked
      When '<accountTypePath>' is Clicked
      Then Title '<pageTitle>' is Shown
      And Logout Button is Clicked
      Examples:
        |accountTypePath                                 |pageTitle             |
        |/html/body/div[3]/nav/div[2]/ul/li[5]/ul/li[1]/a|Admins Management\n   |
        |/html/body/div[3]/nav/div[2]/ul/li[5]/ul/li[2]/a|Suppliers Management\n|
        |/html/body/div[3]/nav/div[2]/ul/li[5]/ul/li[3]/a|Customers Management\n|
        |/html/body/div[3]/nav/div[2]/ul/li[5]/ul/li[4]/a|Guest Management\n    |
Feature: Add CMS Feature in Admin Page

  Background:
    Given The Admin Page is Open after demo authentication
    And CMS DropDown Menu is Clicked
    And Pages panel is Clicked
    And Add Button is Clicked

    Scenario Outline:
      Given CMS '<pageTitleField>' is filled with '<value>'
      When The CMS Submit Button is Clicked
      Then CMS '<errorExist>' is Shown
      And Logout Button is Clicked
      Examples:
      |pageTitleField|value       |errorExist|
      |pagetitle     |            |true      |
      |pagetitle     |Heading     |false     |
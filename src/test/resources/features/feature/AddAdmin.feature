Feature: Add Admin Feature in Admin Page

  Background:
    Given The Admin Page is Open after demo authentication
    And Accounts DropDown Menu is Clicked
    And Admins panel is Clicked
    And Add Button is Clicked

    Scenario Outline:
      Given '<firstNameField>' is filled with '<parameter1>' and '<lastNameField>' is filled with '<parameter2>'
      When The Submit Button is Clicked
      Then The '<errorMessage>' is Shown
      And Logout Button is Clicked
      Examples:
        | firstNameField | parameter1         | lastNameField              | parameter2 | errorMessage                                                                                                                                                        |
        | fname          |                    | lname                      |            | The Email field is required.\nThe Password field is required.\nThe Country field is required.\nThe First Name field is required.\nThe Last Name field is required.\n|
        | fname          | Mike               | lname                      |            | The Email field is required.\nThe Password field is required.\nThe Country field is required.\nThe Last Name field is required.\n                                   |
        | fname          |                    | lname                      |  Johnson   | The Email field is required.\nThe Password field is required.\nThe Country field is required.\nThe First Name field is required.\n                                  |
        | fname          | Mike               | lname                      |  Johnson   | The Email field is required.\nThe Password field is required.\nThe Country field is required.\n                                                                     |
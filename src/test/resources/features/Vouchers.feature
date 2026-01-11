Feature: Testing voucher page
@Ramona
  Scenario: Creation of a voucher with all fields correctly filled in
    Given User navigates to login page
    When User logs in with valid credentials
    Then I click on attractions sidebar
    Then I click on Vouchers
    And I click on Create voucher button
    Then I insert the Name of the voucher "Ramona"
    And I input voucher's discount of "15"
    Then I input the discount code of "zxcv"
    And Click on Add button Dicount
    And I click on Save button
#    Then I check if the voucher "Ramona" appears in list

  Scenario: Delete a voucher from the list
    Given User navigates to login page
    When User logs in with valid credentials
    Then I click on attractions sidebar
    Then I click on Vouchers
    And Delete a voucher from the list


  Scenario: Create a voucher without a discount
    Given User navigates to login page
    When User logs in with valid credentials
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I input voucher's name of "WithoutDiscount"
    And I want this voucher to be applicable for the selected attraction "Ramona_Test2"
    Then I input a "CodDiscount" manually
    And I click on Save button
#    Then I check if mandatory fields error appears


  Scenario: Create a voucher with the same Discount code to see if the error appears
    Given User navigates to login page
    When User logs in with valid credentials
    When I click on attractions sidebar
    When I click on Vouchers
    And I click on Create voucher button
    Then I input voucher's name of "WithoutDiscount"
    Then I input a "code" manually
    And I click on Save button



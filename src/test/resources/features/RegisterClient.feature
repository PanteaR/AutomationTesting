#Tags for grouping and running tests(can be as many as you want/need)
@All
@Regression

Feature: Client registration

  Scenario: Successful client registration
    Given i am on the client registration page
    When i fill all necessary information and click register
    Then i should be successfully registered
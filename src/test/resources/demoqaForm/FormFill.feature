@Positive
Feature: Filling form on demoqa.com

  Scenario: Successfully filling out the form with valid inputs
    Given I am on the "Form Page" page
    When I fill the form with the following details:
      | Field Name    | Value                       |
      | First Name    | ilkin                       |
      | Last Name     | adilzada                    |
      | Email         | adilzadeilkin@gmail.com     |
      | Phone Number  | 0505555555                  |
      | Subject       | QA Automation               |
      | Image Path    | C:\Users\pc\Desktop\testqa.jpg |
      | Address       | Baku city                   |
    Then I should see the submitted email as "adilzadeilkin@gmail.com"

Feature: Filling form on demoqa.com

  Scenario: Successfully filling out the form with valid inputs
    Given I am on the "Form Page" page
    When I fill the form with the following details:
      | First Name  | Last Name | Email                     | Phone Number | Subject        | Image Path                       | Address   |
      | ilkin       | adilzada  | adilzadeilkin@gmail.com   | 0505555555   | QA Automation | C:\Users\pc\Desktop\testqa.jpg  | Baku city |
    Then I should see the submitted email as "adilzadeilkin@gmail.com"

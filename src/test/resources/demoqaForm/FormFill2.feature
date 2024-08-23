@Negative
Feature: Filling form on demoqa.com

  Scenario Outline: Successfully filling out the form with valid inputs2
    Given I am on the Form Page page2
    When I fill the form with the following details2:
      | Field Name    | Value                       |
      | First Name    | <First Name>                |
      | Last Name     | <Last Name>                 |
      | Email         | <Email>                     |
      | Phone Number  | <Phone Number>              |
      | Subject       | <Subject>                   |
      | Image Path    | <Image Path>                |
      | Address       | <Address>                   |
    Then I should see the submitted email2 as "<Email>"

    Examples:
      | First Name | Last Name | Email                   | Phone Number | Subject        | Image Path                       | Address   |
      | Ilkin      | Adilzade  | adilzadeilkin@gmail.com | 0505555555   | QA Automation | C:\Users\pc\Desktop\testqa.jpg  | Baku city |
      | Sabir      | Tahirli  | adilzadeilkin@gmail.com | 0505555555   | QA Automation | C:\Users\pc\Desktop\testqa.jpg  | Baku city |
      | Fuad      | Gulmammad  | adilzadeilkin@gmail.com | 0505555555   | QA Automation | C:\Users\pc\Desktop\testqa.jpg  | Baku city |

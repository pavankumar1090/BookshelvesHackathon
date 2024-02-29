Feature: Regression

  Scenario: print top three elements
    Given User is on the Home page
    When User gives required specifications
    Then User prints top three elements

  Scenario: print dropdown elements
    Then user prints elements under Seating&Chair

  Scenario: customize the gift card
    Given user is on the customize Giftcard page
    Then user customize the gift card

  Scenario: Customize the luckyperson form
    Then user customizes the luckypersonform
    And user prints error message

  Scenario: Takes screenshot and enter valid input
    Then user takes Scrrenshot
    And user provides valid input

  Scenario: Validation of Confirm details page
    Given user is on confirm details page
    Then user validates the confirm details page
    And user takes screenshot of Confirm details page
    And User return to Homepage

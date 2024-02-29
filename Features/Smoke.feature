
Feature: Smoke

  Scenario: BookShelfes
    Given User is on the UrbanLadder site
    When checks wether search box is enabled
    Then checks weather page navigates to Bookshelves

  Scenario: Bookshelves specifications
    Given User is on the Bookshelvess site
    Then checks specifications availability

  Scenario: Dropdown
    Given User is on the Bookshelves site
    When Living is enabled

  Scenario: Giftcards check
    Given User is on the Giftcar site
    When Giftcard icon is enabled

  Scenario: Giftcard title
    Given User is on the Giftcard site
    When user clicks on the Giftcard option
    Then Birthday/Annivarsary is available

  Scenario: Giftcard specifications
    Given user is on the Giftcard site
    When Checks wether Amount text box is enabled

  Scenario: Luckyperson Specifications
    Given user is on the Giftcard site
    Then checks all textboxes are enabled
    Then navigate to homepage
Feature: UrbanLadder

  Scenario: BookShelve
    Given User is on the urbanLadder site
    When User provides input in searchbox field(Input: "Bookshelves")
    And User selects the preferred options
    Then User Prints top Three items

  Scenario: Seating and Chairs
    When User clicks on Living Title on header menu
    Then User Prints the sub menu items of Seating & Chairs

  Scenario: Capture Invalid input
    Given User is on the Bookshelves page
    When User clicks on the Giftcard option
    And User Choose BirthdayAnniversay occasion
    Then User customise the Giftcard
    And User fills the lucky person form
    And User prints the Invalid message
    And User Enter valid email
    And User  validates the Confirm details

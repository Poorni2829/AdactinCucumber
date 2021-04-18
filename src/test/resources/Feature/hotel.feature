Feature: Booking room functionality
@smoke
  Scenario Outline: Login in Adactin
    Given user in AdactinHotel page
    When user login with valid "<username>" and"<password>" and user navigate to searchHOtel page
    And user choosing "<hotel location>","<hotel name>","<Room Type>"."<number of room>", "<check in date>" ,"<check out date>","<Adults>","<children>"
    And user click search button and user go to select hotel page
    And user choose a hotel in the list and click continue button and user should be in payment page
    And user enter "<firstname>" ,"<lastname>" and "<billing address>" "<credit card num>", "<credit card type>","<Expiry month>" ,"<expiry year>" and "<cvv number>"
    And user click book now button and user get the booked room details
    Then user click search hotel then moved to home page of search hotel

    Examples: 
      | username  | password   | hotel location | hotel name  | Room Type | number of room | check in date | check out date | Adults | children | firstname | lastname | billing address    | credit card num  | credit card type | Expiry month | expiry year | cvv number |
      | Priya3110 | Priya@3110 | Sydney         | Hotel creek | standard  | one            | 15/04/21      | 16/04/21       | one    | one      | poorni    | shuruthi | abc street chennai | 1234567890123456 | american express | jun          |        2021 |        521 |

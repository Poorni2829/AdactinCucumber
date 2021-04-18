$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/hotel.feature");
formatter.feature({
  "name": "Booking room functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login in Adactin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user in AdactinHotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "user login with valid \"\u003cusername\u003e\" and\"\u003cpassword\u003e\" and user navigate to searchHOtel page",
  "keyword": "When "
});
formatter.step({
  "name": "user choosing \"\u003chotel location\u003e\",\"\u003chotel name\u003e\",\"\u003cRoom Type\u003e\".\"\u003cnumber of room\u003e\", \"\u003ccheck in date\u003e\" ,\"\u003ccheck out date\u003e\",\"\u003cAdults\u003e\",\"\u003cchildren\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click search button and user go to select hotel page",
  "keyword": "And "
});
formatter.step({
  "name": "user choose a hotel in the list and click continue button and user should be in payment page",
  "keyword": "And "
});
formatter.step({
  "name": "user enter \"\u003cfirstname\u003e\" ,\"\u003clastname\u003e\" and \"\u003cbilling address\u003e\" \"\u003ccredit card num\u003e\", \"\u003ccredit card type\u003e\",\"\u003cExpiry month\u003e\" ,\"\u003cexpiry year\u003e\" and \"\u003ccvv number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user click book now button and user get the booked room details",
  "keyword": "And "
});
formatter.step({
  "name": "user click search hotel then moved to home page of search hotel",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "hotel location",
        "hotel name",
        "Room Type",
        "number of room",
        "check in date",
        "check out date",
        "Adults",
        "children",
        "firstname",
        "lastname",
        "billing address",
        "credit card num",
        "credit card type",
        "Expiry month",
        "expiry year",
        "cvv number"
      ]
    },
    {
      "cells": [
        "Priya3110",
        "Priya@3110",
        "Sydney",
        "Hotel creek",
        "standard",
        "one",
        "15/04/21",
        "16/04/21",
        "one",
        "one",
        "poorni",
        "shuruthi",
        "abc street chennai",
        "1234567890123456",
        "american express",
        "jun",
        "2021",
        "521"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login in Adactin",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user in AdactinHotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "Executable.user_in_AdactinHotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user login with valid \"Priya3110\" and\"Priya@3110\" and user navigate to searchHOtel page",
  "keyword": "When "
});
formatter.match({
  "location": "Executable.user_login_with_valid_and_and_user_navigate_to_searchHOtel_page(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choosing \"Sydney\",\"Hotel creek\",\"standard\".\"one\", \"15/04/21\" ,\"16/04/21\",\"one\",\"one\"",
  "keyword": "And "
});
formatter.match({
  "location": "Executable.user_choosing(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search button and user go to select hotel page",
  "keyword": "And "
});
formatter.match({
  "location": "Executable.user_click_search_button_and_user_go_to_select_hotel_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose a hotel in the list and click continue button and user should be in payment page",
  "keyword": "And "
});
formatter.match({
  "location": "Executable.user_choose_a_hotel_in_the_list_and_click_continue_button_and_user_should_be_in_payment_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter \"poorni\" ,\"shuruthi\" and \"abc street chennai\" \"1234567890123456\", \"american express\",\"jun\" ,\"2021\" and \"521\"",
  "keyword": "And "
});
formatter.match({
  "location": "Executable.user_enter_and_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click book now button and user get the booked room details",
  "keyword": "And "
});
formatter.match({
  "location": "Executable.user_click_book_now_button_and_user_get_the_booked_room_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click search hotel then moved to home page of search hotel",
  "keyword": "Then "
});
formatter.match({
  "location": "Executable.user_click_search_hotel_then_moved_to_home_page_of_search_hotel()"
});
formatter.result({
  "status": "passed"
});
});
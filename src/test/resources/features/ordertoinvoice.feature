@BRIT-4043
Feature: As I user, I should be able to get data from "Order to invoice"

  Background:
    Given Go to URL
#    Then Click on BriteErpDemo
    And Enter valid credentials & click login button
    And Navigate and click on Sales module
    When click on Order to Invoice

  Scenario: verify that user should be able to select different order number from the list in Order to invoice
    When click checkbox next to the Order Number
    Then click any Order Number


  Scenario: verify that user should be able to get customers email
    When click on seventh raw on Order Date
    Then click on the customer name
    And get customer's email


  Scenario Outline: verify that user should be able to see all the Customers' list
    Then get all customer <names> From the list


    Examples:
      | names    |
      | Jay Z    |
      | Cybertek |
      | Sani     |

#  Scenario: verify that user should not be able to get customers email
#    When click on second link on Order Date
#    Then click on the customer name
#    And get customer's email
#
#  Scenario: verify that user should be able to open any total price and get all related information.
#    When click any of customers Total
#    Then get the total value of the invoice
#
#  Scenario: verify that user should be able to get the same value with the Unit Price when the user clicks an option in the Product list
#    When click one of the order number
#    Then click on Gap Analysis Service under Product
#    And get the Unit Price
#    Then click close button
#    And get the Gap Analysis Service value from Unit Price list
#
#  Scenario: verify that user should be able to access data on the calendar
#    When click on Calendar button
#
#  Scenario: verify that user should be able to reach order invoice through the Kanban and get Products
#    When click on Kanban.
#    Then click on one of the order
#    And get the product name
#
#  Scenario: verify that customer can select an Action from the drop-down list
#    When click on Kanban.
#    Then click on one of the order
#    And click on Send a Card Recovery Email.
#
#
  @wip
  Scenario Outline: verify that user should be able to access data in the pivot
    When click on Pivot
    Then Get list of information

      | month1 | <November_2018> |
      | month2 | <December_2018> |
      | month3 | <January_2018>  |

    Examples:
      | November_2018 | December_2018    | January_2018     |
      | Campaign      | Incoterms        | Created by       |
      | Company       | Salesperson      | Invoice Address  |
      | Customer      | Delivery Address | Last Transaction |
      | Medium        | Expiration Date  | Source           |
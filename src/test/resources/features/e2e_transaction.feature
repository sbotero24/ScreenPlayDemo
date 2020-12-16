Feature: i as a user
  wants to login into SwagLabs app
  to buy some item

  Scenario Outline: login into SwagLabs and buy an item
    Given that loggin into swagLabs with <username>, <password>
    When I add <item1>, <item2> to the cart
    Then I shold see that the purchase was successfuly
    Examples:
      | username      | password     | item1                   | item2               |
      | standard_user | secret_sauce | Sauce Labs Bolt T-Shirt | Sauce Labs Backpack |
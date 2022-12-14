Feature: As a user I want to add product to checkout

  @smoke
  Scenario: Checkout should contains product
    Given User open the chosen internet shop in Chrome browser
    When User accept Cookie
    And Search for "camileo"
    And Click on product "The Manager`s Path" on search result page
    And On product details page select Add to basket
    And Select Basket-Checkout in cart pop-up
    And Check Order Total price on the Basket page is "122,63 zł"
    And User click on the Checkout button
    And Set "test@user.com" as e-mail address
    Then Total and Subtotal price are "122,63 zł" on the Checkout page


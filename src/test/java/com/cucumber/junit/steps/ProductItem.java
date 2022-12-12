package com.cucumber.junit.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import java.util.Objects;

public class ProductItem {

    private final HomePage homePg = new HomePage();
    private SearchResultPage searchPg = new SearchResultPage();
    private ProductPage productPg = new ProductPage();
    private BasketPage basketPg = new BasketPage();
    private CheckoutPage checkoutPg = new CheckoutPage();

    @When("User open the chosen internet shop in Chrome browser")
    public void OpenHomePage() {
        homePg.OpenHomePage();
    }

    @When("User accept Cookie")
    public void acceptCookie() {
        homePg.Accept_Cookies_Action();
    }

    @And("Search for {string}")
    public void searchFor(String keyword) {
        homePg.Search_Action(keyword);
    }

    @And("Click on product {string} on search result page")
    public void clickOnProduct(String bookName) {
        WebElement myBook = searchPg.Get_Book_Action(bookName);
        searchPg.Open_Book_Action(myBook);
    }

    @And("On product details page select Add to basket")
    public void selectAddToBasket() {
        productPg.Add_To_Basket_Action();
    }

    @And("Select Basket-Checkout in cart pop-up")
    public void clickBasketChekoutButton() {
        productPg.Redirect_Basket_Action();

    }

    @And("Check Order Total price on the Basket page is {string}")
    public void checkTotalPrice(String bookPrice) {
        String basketPrice = basketPg.Get_Total_Price_Action();
        assert Objects.equals(bookPrice, basketPrice);
    }

    @And("User click on the Checkout button")
    public void goToCheckout() {
        basketPg.Go_To_Checkout_Action();
    }

    @And("Set {string} as e-mail address")
    public void setAsEMailAddress(String email) {
        checkoutPg.Set_Email_Action(email);
    }

    @Then("Total and Subtotal price are {string} on the Checkout page")
    public void verifyTotalAndSubtotalPrice(String bookPrice) {
        String SubPrice = checkoutPg.Get_SubTotal_Price_Action();
        assert Objects.equals(bookPrice, SubPrice);
        String TotalPrice = checkoutPg.Get_Total_Price_Action();
        assert Objects.equals(bookPrice, TotalPrice);
    }

}

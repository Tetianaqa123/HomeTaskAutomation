package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends BasePage {

    //Locating the book title item
    @FindBy(xpath="//h1[contains(@itemprop, 'name')]")
    WebElement titleBook;

    @FindBy(xpath="//div[contains(@class, 'item-tools')]//a[contains(@class, 'add-to-basket')]")
    WebElement addToBasket;

    @FindBy(className="continue-to-basket")
    WebElement continueToBasket;

    @FindBy(css="div.item-price-wrap > span")
    WebElement bookPrice;



    //Method that performs book list action using the web elements
    public String Get_Book_Title_Action(){

        return titleBook.getText();

    }

    // Method that add to basket using the web element
    public void Add_To_Basket_Action(){
        addToBasket.isEnabled();
        addToBasket.click();
    }

    // Method that redirected to basket using the web element
    public void Redirect_Basket_Action(){
        continueToBasket.isEnabled();
        continueToBasket.click();
    }

    public String Get_Book_Price_Action(){

        return bookPrice.getText();

    }




}



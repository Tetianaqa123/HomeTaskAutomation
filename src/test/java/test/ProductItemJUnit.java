package test;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.*;


public class ProductItemJUnit {

    static WebDriver driver;

    @Before
    public void SetupDriver() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void TestAddToBasketFromPdP() {

        //Instantiating HomePage & SearchResultPage using initElements()
        HomePage homePg = PageFactory.initElements(driver, HomePage.class);
        SearchResultPage searchPg = PageFactory.initElements(driver, SearchResultPage.class);
        ProductPage productPg = PageFactory.initElements(driver, ProductPage.class);
        BasketPage basketPg = PageFactory.initElements(driver, BasketPage.class);
        CheckoutPage checkoutPg = PageFactory.initElements(driver, CheckoutPage.class);


        String MY_SEARCH_KEYWORD = "camileo";
        String MY_BOOK_NAME = "The Manager`s Path";
        String MY_USER_EMAIL = "test@user.com";

        //Using the methods created in pages class to perform actions
        homePg.OpenHomePage();
        homePg.Accept_Cookies_Action();
        homePg.Search_Action(MY_SEARCH_KEYWORD);
        WebElement myBook = searchPg.Get_Book_Action(MY_BOOK_NAME);
        searchPg.Open_Book_Action(myBook);
        String bookPrice = productPg.Get_Book_Price_Action();
        productPg.Add_To_Basket_Action();
        productPg.Redirect_Basket_Action();
        String basketPrice = basketPg.Get_Total_Price_Action();
//        assert Objects.equals(bookPrice, basketPrice);
        basketPg.Go_To_Checkout_Action();
        checkoutPg.Set_Email_Action(MY_USER_EMAIL);
        String SubPrice = checkoutPg.Get_SubTotal_Price_Action();
//        assert Objects.equals(bookPrice, SubPrice);
        String TotalPrice = checkoutPg.Get_Total_Price_Action();
//        assert Objects.equals(bookPrice, TotalPrice);
    }
    @After
    public void CleanDriver() {
        driver.quit();
    }
}

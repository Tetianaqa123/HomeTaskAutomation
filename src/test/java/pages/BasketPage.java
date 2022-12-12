package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BasketPage extends BasePage {

    //Locating item
    @FindBy(css="dl.total > dd")
    WebElement totalPriceBook;
    @FindBy(className="checkout-btn")
    WebElement addToCheckout;


    // Method that check Order Total using the web element
    public String Get_Total_Price_Action(){

        String bookPrice = totalPriceBook.getText();
        return bookPrice;

    }


    // Method that go to checkout using the web element
    public void Go_To_Checkout_Action(){
        addToCheckout.isEnabled();
        addToCheckout.click();
    }








}

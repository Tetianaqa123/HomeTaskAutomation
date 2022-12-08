package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CheckoutPage {

    final WebDriver driver;

    public CheckoutPage(WebDriver driver) {

        this.driver = driver;
    }

    //Locating item
    @FindBy(css="div.mini-basket > div.wrapper > div:nth-child(2) > dl > dd")
    WebElement subtotalPrice;

    @FindBy(className="total-price")
    WebElement totalPrice;

    @FindBy(xpath="//input[@name='emailAddress']")
    WebElement emailAddress;



    public void Set_Email_Action(String email) {
        emailAddress.isEnabled();
        emailAddress.clear();
        emailAddress.sendKeys(email);
    }

    public String Get_Total_Price_Action(){

        String checkoutTotal = totalPrice.getText();
        return checkoutTotal;
    }

    public String Get_SubTotal_Price_Action(){

        String checkoutSubTotal = subtotalPrice.getText();
        return checkoutSubTotal;
    }



}


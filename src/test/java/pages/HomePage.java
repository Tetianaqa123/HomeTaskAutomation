package pages;

import com.cucumber.junit.driver.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    // On the Home page locate logo, Sign in Register, icon, search field, navigation menu, banner

    //Locating the search field
    @FindBy(name="searchTerm")
    WebElement searchInput;

    //Locating the search button
    @FindBy(className="header-search-btn")
    WebElement searchBtn;

    //Locating the logo
    @FindBy(css="img[alt='Bookdepository.com']")
    WebElement logo;

    //Locating the Sign in/Join
    @FindBy(linkText="Sign in/Join")
    WebElement signInLink;

    //Locating the navigation
    @FindBy(css=".secondary-header > .page-links.mobile-nav-content")
    WebElement navigation;

    //Locating the search banner
    @FindBy(className="promotion-block")
    WebElement banner;

    //
    @FindBy(className="btn-yes")
    WebElement acceptCookiesBtn;

    String URL = "https://www.bookdepository.com/";

    public void OpenHomePage(){
        DriverManager.getDriver().get(URL);
    }

    //Method that performs search action using the web elements
    public void Search_Action(String keyword){
        searchInput.sendKeys(keyword);
        searchBtn.click();
    }

    public void Accept_Cookies_Action(){
        acceptCookiesBtn.click();
    }

}

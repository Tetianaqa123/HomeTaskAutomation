package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage {

    final WebDriver driver;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
    }


    //Locating the book title item
    @FindBy(xpath="//h1[contains(@itemprop, 'name')]")
    WebElement titleBook;


    //Method that performs book list action using the web elements
    public String Get_Book_Title_Action(){

        String bookName = titleBook.getText();
        return bookName;

    }

}



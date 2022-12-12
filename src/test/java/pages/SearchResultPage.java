package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {

    //Locating the book item
    @FindBy(className="book-item")
    List<WebElement> bookItems;

    @FindBy(className="close")
    WebElement closeBasketButton;

    //Method that performs book list action using the web elements
    public List<WebElement> Book_List_Action(){
        return bookItems;

    }

    //
    public WebElement Get_Book_Action(String bookName){
        List<WebElement> booksList = Book_List_Action();
        // filter books list by name of expected book
        List<WebElement> filteredBook = booksList.stream()
                .filter(item -> item.findElement(By.cssSelector("div.item-info > h3 > a"))
                        .getText().equals(bookName))
                .limit(1).toList();;

        return filteredBook.get(0);
    }

    //
    public void Add_To_Basket_Action(WebElement book){
        WebElement addToBasketButton = book.findElement(By.className("add-to-basket"));
        addToBasketButton.click();
    }

    public void Close_Basket_Action(){
        closeBasketButton.click();
    }

    public void Open_Book_Action(WebElement book){
        book.findElement(By.cssSelector("div.item-info > h3 > a")).click();

    }

    public String Get_Book_Title_Action(WebElement book){
        return book.findElement(By.cssSelector("div.item-info > h3 > a")).getText();
    }


}
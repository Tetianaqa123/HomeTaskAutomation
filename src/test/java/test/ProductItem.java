package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.ProductPage;
import pages.SearchResultPage;

import java.util.Objects;
import java.util.concurrent.TimeUnit;



    public class ProductItem {
        static WebDriver driver;

        @BeforeMethod
        public static void SetupDriver() {
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }


        @Test
        public static void TestSearchItem() {

            //Instantiating HomePage & SearchResultPage using initElements()
            HomePage homePg = PageFactory.initElements(driver, HomePage.class);
            SearchResultPage searchPg = PageFactory.initElements(driver, SearchResultPage.class);

            String MY_BOOK_NAME = "The Manager`s Path";

            //Using the methods created in pages class to perform actions
            homePg.OpenHomePage();
            homePg.Accept_Cookies_Action();
            homePg.Search_Action("camileo");
            WebElement myBook = searchPg.Get_Book_Action(MY_BOOK_NAME);
            String bookName = searchPg.Get_Book_Title_Action(myBook);
            assert Objects.equals(bookName, MY_BOOK_NAME);
        }

        @Test
        public static void TestAddToBasket() {

            //Instantiating HomePage & SearchResultPage using initElements()
            HomePage homePg = PageFactory.initElements(driver, HomePage.class);
            SearchResultPage searchPg = PageFactory.initElements(driver, SearchResultPage.class);

            String MY_BOOK_NAME = "The Manager`s Path";

            //Using the methods created in pages class to perform actions
            homePg.OpenHomePage();
            homePg.Accept_Cookies_Action();
            homePg.Search_Action("camileo");
            WebElement myBook = searchPg.Get_Book_Action(MY_BOOK_NAME);
            searchPg.Add_To_Basket_Action(myBook);
            searchPg.Close_Basket_Action();
        }

        @Test
        public static void TestOpenItem() {

            //Instantiating HomePage & SearchResultPage using initElements()
            HomePage homePg = PageFactory.initElements(driver, HomePage.class);
            SearchResultPage searchPg = PageFactory.initElements(driver, SearchResultPage.class);
            ProductPage productPg = PageFactory.initElements(driver, ProductPage.class);

            String MY_BOOK_NAME = "The Manager`s Path";

            //Using the methods created in pages class to perform actions
            homePg.OpenHomePage();
            homePg.Accept_Cookies_Action();
            homePg.Search_Action("camileo");
            WebElement myBook = searchPg.Get_Book_Action(MY_BOOK_NAME);
            searchPg.Open_Book_Action(myBook);
            productPg.Get_Book_Title_Action();
            String bookName = productPg.Get_Book_Title_Action();
            assert Objects.equals(bookName, MY_BOOK_NAME);
        }

        @AfterMethod
        public static void CleanDriver() {
            driver.quit();
        }


    }















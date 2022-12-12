package com.cucumber.junit.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Optional;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.openqa.selenium.chrome.ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY;

public class DriverManager {

    private final static String CHROME_DRIVER_PATH = "./src/main/resources/chromedriver.exe";
    private static final int IMPLICIT_WAIT_TIMEOUT = 5;
    private static final int PAGE_LOAD_TIMEOUT = 20;
    public static ThreadLocal<WebDriver> webDriverThreadLocal = new ThreadLocal<>();
    private DriverManager(){

    }

    public static void setupDriver(){
        System.setProperty(CHROME_DRIVER_EXE_PROPERTY,CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT_TIMEOUT,SECONDS);
        driver.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,SECONDS);
        webDriverThreadLocal.set(driver);
    }

    public static WebDriver getDriver(){

        return webDriverThreadLocal.get();
    }

    public static void quitDriver(){
        Optional.ofNullable(getDriver()).ifPresent(WebDriver ->{
            WebDriver.quit();
            webDriverThreadLocal.remove();
        });

    }

}

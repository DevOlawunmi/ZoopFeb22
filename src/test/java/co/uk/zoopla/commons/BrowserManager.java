package co.uk.zoopla.commons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends DriverManager{

    private WebDriver initChrome(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();

    }

    private WebDriver initFireFox(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();

    }

    private WebDriver initHeadlessChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-gpu","--headless");
        return new ChromeDriver(options);
    }


    private WebDriver initHeadlessFireFox(){
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-gpu","--headless");
        return new FirefoxDriver(options);
    }


    public void launchBrowser(String browser){
        switch (browser){
            case "chrome":
                driver = initChrome();
                break;
            case "firefox":
                driver = initFireFox();
                break;
            case "chromeHeadless":
                driver = initHeadlessChrome();
                break;
            case "firefoxHeadless":
                driver = initHeadlessFireFox();
                break;
            default:
                driver = initChrome();
            break;
        }
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }


}

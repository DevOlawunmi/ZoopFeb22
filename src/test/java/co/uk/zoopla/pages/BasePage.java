package co.uk.zoopla.pages;

import co.uk.zoopla.commons.DriverManager;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage extends DriverManager {
    public String BASE_URL = "https://www.zoopla.co.uk/";


    public void launchURL(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.navigate().to(BASE_URL);
    }


}

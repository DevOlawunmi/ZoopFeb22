package co.uk.zoopla.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

   //@FindBy(css = ".mat-focus-indicator.solo-button.mat-button.mat-button-base.mat-raised-button")
    //
    @FindBy(xpath = "//span[text()='Accept all cookies']")
    private WebElement acceptCookiesButton;


    public void clickAcceptCookies(){
        driver.switchTo().frame("gdpr-consent-notice");
        System.out.println("********We are switching to the iframe*******");

        acceptCookiesButton.click();
        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());
    }







}

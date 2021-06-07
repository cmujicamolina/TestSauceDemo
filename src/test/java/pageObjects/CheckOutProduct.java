package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutProduct {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public CheckOutProduct(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,20);
    }

    //Locators
    @FindBy(id = "checkout")
    private WebElement botonCheckout;

    //Actions
    public void clickBotonCheckout(){
        wait.until(ExpectedConditions.elementToBeClickable(botonCheckout));
        botonCheckout.click();
    }

}

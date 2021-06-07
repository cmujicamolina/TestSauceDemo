package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InformationCustomer {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public InformationCustomer(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,20);
    }

    @FindBy(id = "first-name")
    private WebElement campoFirstName;

    @FindBy(id = "last-name")
    private WebElement campoLastName;

    @FindBy(id = "postal-code")
    private WebElement campoPostal;

    @FindBy(id = "continue")
    private WebElement botonContinue;

    @FindBy(id = "finish")
    private WebElement botonFinish;

    public void setFirstName(String text){
        wait.until(ExpectedConditions.elementToBeClickable(campoFirstName));
        campoFirstName.sendKeys(text);
    }

    public void setLastName(String text){
        wait.until(ExpectedConditions.elementToBeClickable(botonFinish));
        botonFinish.sendKeys(text);
    }

    public void setPostal(String text){
        wait.until(ExpectedConditions.elementToBeClickable(campoPostal));
        campoPostal.sendKeys(text);
    }

    public void clickBotonContinue(){
        wait.until(ExpectedConditions.elementToBeClickable(botonContinue));
        botonContinue.click();
    }

    public void clickBotonFinish(){
        wait.until(ExpectedConditions.elementToBeClickable(botonContinue));
        botonContinue.click();
    }
}

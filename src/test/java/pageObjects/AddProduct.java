package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddProduct {
    private WebDriver driver;
    private WebDriverWait wait;

    //Constructor
    public AddProduct(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver,this);
        wait = new WebDriverWait(driver,20);
    }

    //Locators
    @FindBy(id = "user-name")
    private WebElement campoUsuario;

    @FindBy(id = "password")
    private WebElement campoPassword;

    @FindBy(id = "login-button")
    private WebElement botonLogin;

    @FindBy(id  = "add-to-cart-sauce-labs-backpack")
    private WebElement botonAddBackPack;

    @FindBy(id  = "add-to-cart-sauce-labs-bike-light")
    private WebElement botonAddBikeLight;

    @FindBy(id = "shopping_cart_container")
    private WebElement botonShoppingCart;

    //Actions
    public void setCampoUsuario(String text){
        wait.until(ExpectedConditions.elementToBeClickable(campoUsuario));
        campoUsuario.sendKeys(text);
    }

    public void setCampoPassword(String text) {
        wait.until(ExpectedConditions.elementToBeClickable(campoPassword));
        campoPassword.sendKeys(text);
    }

    public void clickBotonLogin(){
        wait.until(ExpectedConditions.elementToBeClickable(botonLogin));
        botonLogin.click();
    }

    public void clickBotonAddBackPack(){
        wait.until(ExpectedConditions.elementToBeClickable(botonAddBackPack));
        botonAddBackPack.click();
    }

    public void clickBotonAddBikeLight(){
        wait.until(ExpectedConditions.elementToBeClickable(botonAddBikeLight));
        botonAddBikeLight.click();
    }

    public void clickBotonShoppingCart(){
        wait.until(ExpectedConditions.elementToBeClickable(botonShoppingCart));
        botonShoppingCart.click();
    }

}

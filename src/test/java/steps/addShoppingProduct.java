package steps;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.ca.I;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.AddProduct;
import pageObjects.CheckOutProduct;
import pageObjects.InformationCustomer;
import pageObjects.LogueoSauce;

import java.net.MalformedURLException;
import java.net.URL;

public class addShoppingProduct {
    private WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
    }

    @Given("^El usuario se loguea a la plataforma Saucedemo$")
    public void elUsuarioSeLogueaALaPlataformaSaucedemo() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("^ingresa a la plataforma su usuario \"([^\"]*)\"$")
    public void ingresaALaPlataformaSuUsuario(String usuario) throws Throwable {
        AddProduct addproduct = new AddProduct(driver);
        addproduct.setCampoUsuario(usuario);
    }

    @Then("^ingresa a la plataforma su passord \"([^\"]*)\"$")
    public void ingresaALaPlataformaSuPassord(String password) throws Throwable {
        AddProduct addproduct = new AddProduct(driver);
        addproduct.setCampoUsuario(password);
    }

    @Then("^selecciona backpack$")
    public void seleccionaBackpack() {
        AddProduct addproduct = new AddProduct(driver);
        addproduct.clickBotonAddBackPack();
    }

    @Then("^selecciona bikelight$")
    public void seleccionaBikelight() {
        AddProduct addproduct = new AddProduct(driver);
        addproduct.clickBotonAddBikeLight();
    }


    @Then("^hace checkout$")
    public void haceCheckout() {
        CheckOutProduct hacecheckout = new CheckOutProduct(driver);
        hacecheckout.clickBotonCheckout();
    }

    @Then("^escribe el nombre del comprador \"([^\"]*)\" al formulario$")
    public void escribeElNombreDelCompradorAlFormulario(String firstname) throws Throwable {
        InformationCustomer infor = new InformationCustomer(driver);
        infor.setFirstName(firstname);
    }

    @Then("^escribe el apellido del comprador \"([^\"]*)\" al formulario$")
    public void escribeElApellidoDelCompradorAlFormulario(String lastname) throws Throwable {
        InformationCustomer infor = new InformationCustomer(driver);
        infor.setLastName(lastname);
    }

    @Then("^escribe el postal \"([^\"]*)\" al formulario$")
    public void escribeElPostalAlFormulario(String postal) throws Throwable {
        InformationCustomer infor = new InformationCustomer(driver);
        infor.setPostal(postal);
    }

    @Then("^hace click en el boton continue$")
    public void haceClickEnElBotonContinue() {
        InformationCustomer infor = new InformationCustomer(driver);
        infor.clickBotonContinue();
    }

    @And("^hace click en el boton finish para terminar la compra$")
    public void haceClickEnElBotonFinishParaTerminarLaCompra() {
        InformationCustomer infor = new InformationCustomer(driver);
        infor.clickBotonFinish();
    }

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot,"image/png");
        driver.quit();
    }
}
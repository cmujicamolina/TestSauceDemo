package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import pageObjects.LogueoSauce;

import java.net.MalformedURLException;
import java.net.URL;

public class logueoValidoSteps {

    private WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
    }
/*    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }*/


    @Given("^El usuario se encuentra en la pagina de Saucedemo$")
    public void elUsuarioSeEncuentraEnLaPaginaDeSaucedemo() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("^ingresa su nombre de usuario \"([^\"]*)\" al campo Username$")
    public void ingresaSuNombreDeUsuarioAlCampoUsername(String usuario) throws Throwable {
        LogueoSauce logueo = new LogueoSauce(driver);
        logueo.setCampoUsuario(usuario);
    }

    @And("^ingresa su password \"([^\"]*)\" al campo Password$")
    public void ingresaSuPasswordAlCampoPassword(String password) throws Throwable {
        LogueoSauce logueo = new LogueoSauce(driver);
        logueo.setCampoPassword(password);
    }

    @Then("^ingresa al portal de Saucedemo$")
    public void ingresaAlPortalDeSaucedemo() {
        LogueoSauce logueo = new LogueoSauce(driver);
        logueo.clickBotonLogin();
    }

    @Then("^no ingresa al portal de Saucedimo, se visualiza mensaje de error$")
    public void noIngresaAlPortalDeSaucedimoSeVisualizaMensajeDeError() {
        LogueoSauce logueo = new LogueoSauce(driver);
        logueo.clickBotonLogin();
    }

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot,"image/png");
        driver.quit();
    }



}

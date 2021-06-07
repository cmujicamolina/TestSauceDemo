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
import pageObjects.SortProduct;
import pageObjects.LogueoSauce;

import java.net.MalformedURLException;
import java.net.URL;

public class sortProduct {

    private WebDriver driver;

/*    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }*/
    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
    }

    @Given("^El usuario se encuentra en la pagina de Saucedemo para hacer la compra$")
    public void elUsuarioSeEncuentraEnLaPaginaDeSaucedemoParaHacerLaCompra() {
        driver.get("https://www.saucedemo.com/");
    }

    @When("^ingresa su usuario \"([^\"]*)\"$")
    public void ingresaSuUsuario(String usuario) throws Throwable {
        LogueoSauce logueo = new LogueoSauce(driver);
        logueo.setCampoUsuario(usuario);
    }

    @Then("^ingresa su passord \"([^\"]*)\"$")
    public void ingresaSuPassord(String password) throws Throwable {
        LogueoSauce logueo = new LogueoSauce(driver);
        logueo.setCampoPassword(password);
    }

    @Then("^hace click en el boton de logueo$")
    public void haceClickEnElBotonDeLogueo() {
        LogueoSauce logueo = new LogueoSauce(driver);
        logueo.clickBotonLogin();
    }

    @And("^ordena los productos por \"([^\"]*)\"$")
    public void ordenaLosProductosPor(String orden) throws Throwable {
        SortProduct addproduct = new SortProduct(driver);
        addproduct.selectSort(orden);
    }

    @After
    public void tearDown(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.embed(screenshot,"image/png");
        driver.quit();
    }


}

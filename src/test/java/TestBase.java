import org.example.CheckoutPage;
import org.example.FilterAndAddCartPage;
import org.example.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestBase {

    private WebDriver driver;
    protected LoginPage loginPage;
    protected FilterAndAddCartPage filterAndAddCartPage;
    protected CheckoutPage checkoutPage;


    @BeforeClass
    public void setUp()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        loginPage = new LoginPage(driver);
        filterAndAddCartPage = new FilterAndAddCartPage(driver);
        checkoutPage = new CheckoutPage(driver);

    }


     @AfterClass
    public void tearDown()
    {
        driver.quit();
    }
}

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;


public class BrowserManager {

    public static WebDriver browser;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.gecko.driver", "C:/drivers/geckodriver/geckodriver.exe");
        browser = new FirefoxDriver();
        browser.manage().window().maximize();
        browser.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown(){
        browser.quit();
    }

}

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver browser){
        super(browser);
    }

    String usenameId = "//form[@id=\"login_form\"]//input[@name=\"email\"]";
    String passwordId = "//form[@id=\"login_form\"]//input[@name=\"pass\"]";
    String loginButtonRecentLogins = "label[id*='loginbutton']";
    String loginButtonSignIn = "button[id*='loginbutton']";
    String homeLink = "._3qcu._cy7";

    public void loginAsRegistratedUser(String username, String password) {
        click(By.cssSelector(loginButtonRecentLogins));
        writeText(By.xpath(usenameId),username);
        //Enter Password
        writeText(By.xpath(passwordId), password);
        //Click Login Button
        click(By.cssSelector(loginButtonSignIn));
    }
    public void verifyUserIsLoggedIn (String expectedText) {
        Assert.assertEquals(readText(By.cssSelector(homeLink)), expectedText);
    }
}

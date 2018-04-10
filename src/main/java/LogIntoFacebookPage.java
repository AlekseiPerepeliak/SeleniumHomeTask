import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIntoFacebookPage {

    public static String usenameId = "//form[@id=\"login_form\"]//input[@name=\"email\"]";
    public static String passwordId = "//form[@id=\"login_form\"]//input[@name=\"pass\"]";
    public String loginButtonSignIn = "button[id*='loginbutton']";

    public static LogIntoFacebookPage enterUsersCredentials(String username, String password) {
        BrowserManager.browser.findElement(By.xpath(usenameId)).sendKeys(username);
        BrowserManager.browser.findElement(By.xpath(passwordId)).sendKeys(password);
        return new LogIntoFacebookPage();
    }

    public void clickLoginButton() {
        BrowserManager.browser.findElement(By.cssSelector(loginButtonSignIn)).click();

    }
}


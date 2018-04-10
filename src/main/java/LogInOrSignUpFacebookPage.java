import org.openqa.selenium.By;

public class LogInOrSignUpFacebookPage {

    public static String loginButtonRecentLogins = "label[id*='loginbutton']";

    public static void clickLoginButton(){
        BrowserManager.browser.findElement(By.cssSelector(loginButtonRecentLogins)).click();
    }
}

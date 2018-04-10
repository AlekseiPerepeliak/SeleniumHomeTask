import org.openqa.selenium.By;

public class FacebookUsersHomePage {
    static String homeLink = "._3qcu._cy7";

    public static String usersHomeLinkText(){
        String text = BrowserManager.browser.findElement(By.cssSelector(homeLink)).getText();
        return String.valueOf(text);
    }
}
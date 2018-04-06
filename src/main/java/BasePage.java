import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    public WebDriver browser;

    public BasePage(WebDriver browser) {
        this.browser = browser;
    }

    public void click (By elementLocation) {
        browser.findElement(elementLocation).click();
    }

    public void writeText (By elementLocation, String text) {
        browser.findElement(elementLocation).sendKeys(text);
    }

    public String readText(By elementLocation) {
        return browser.findElement(elementLocation).getText();
    }
}

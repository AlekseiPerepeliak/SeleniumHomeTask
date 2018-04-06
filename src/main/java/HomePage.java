import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

    public HomePage (WebDriver browser) {
        super(browser);
    }


    String baseURL = "https://www.facebook.com/";

    public void goToFacebook (){
        browser.get(baseURL);

    }

}
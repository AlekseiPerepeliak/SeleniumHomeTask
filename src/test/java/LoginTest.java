import org.junit.Test;

public class LoginTest extends BrowserManager {

    @Test
    public void loginFacebook() throws InterruptedException {

        LoginPage loginPage = new LoginPage(browser);
        HomePage homePage = new HomePage(browser);

        homePage.goToFacebook();
        loginPage.loginAsRegistratedUser("fupxzqr_carrieroman_1517492731@tfbnw.net", "Gwqipuo015c");
        loginPage.verifyUserIsLoggedIn("Home");
    }
}
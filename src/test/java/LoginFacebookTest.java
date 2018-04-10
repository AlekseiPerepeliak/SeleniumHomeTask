import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterTest;

public class LoginFacebookTest {

    @BeforeClass
    public static void browser() {
        BrowserManager.openBrowser();
    }

    @Test
    public void loginFacebook() throws InterruptedException {
        Navigation.goToFacebook();
        LogInOrSignUpFacebookPage.clickLoginButton();
        LogIntoFacebookPage.enterUsersCredentials("", "")
                .clickLoginButton();
        Assert.assertEquals("Cannot find Home link, user was not logged in!", "Home", FacebookUsersHomePage.usersHomeLinkText());

    }

    @AfterTest
    public void closeBrowser() {
        BrowserManager.closeBrowser();
    }
}



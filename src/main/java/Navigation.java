public class Navigation {

    public static String baseURL = "https://www.facebook.com/";

    public static LogInOrSignUpFacebookPage goToFacebook() {
        BrowserManager.browser.get(baseURL);
        return new LogInOrSignUpFacebookPage();
    }

}

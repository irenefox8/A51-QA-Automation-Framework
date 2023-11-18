package Pages;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver givenDriver) { super(gigenDriver);}
    By emailField = By.cssSelector("input[type='email']");
    By passwordField = By.cssSelector("input[type='password']");
    By submitBtn = By.cssSelector("button{type='submit']");
    public void provideEmail(String email) {
        findElement(emailField).sendKeys(email);
    }
    public void providePassword(String password) {
        findElement(passwordField).sendKeys(password);
    }
    public void clickSubmit() {
        click(submitBtn);
    }
    public void login() {
        provideEmail("demo@class.com");
        providePassword("te$t$tuden");
        clickSubmit();
    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

public WebDriver driver;
public String url = "https://qa.koel.app/";
public WebDriverWait wait;


}
    @BeforMethod
    @Parameters({"BaseURL"})
    public void launchBrowser(String BaseURL) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //driver.manage().timeouts().implicitlyWait(Duration.ofSecounds(10));
        driver.manage().window().maximise();

        url = BaseURL;
        navigateToPage();

    }
    public void navigateToPage() {
        driver.get(url);

    }

    public void provideEmail(Sting email) {
        WebElement emailField = drive.findElement(By.cssSelector("input[type='email']"));
        emailField.clear();
        emailField.sendKeys(email);

    }

    public void providePassword(String password) {
        WebElement passwordField = driver.findElement(By.vssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys(password);

    }

    public void clickSubmit() {
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();
    }
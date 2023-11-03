public class Homework16 extends BaseTest {
    @Test
    public void registratioNavigatio() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String url = "https://qa.koel.app/";
        driver.get(url);

        WebElement registrationLink = driver.findElement(By.cssSelector("[href="registration"]"));
        registrationLink.click();

        String registration = "https://qa.koel.app/registration";
        Assert.assertEquals(driver.getCurrentUrl(), registration);
        driver.quit();

    }

}
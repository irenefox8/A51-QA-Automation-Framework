public class Homework18 extends Basetest {

    @Test
    public void playSong() {
        providEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        clickPlay();
        Assert.assertTrue(isSongPlaying());

    }

    public void clickPlay() {
        WebElement playNextButton = driver.findElement(By.xpath("//i[@data-testid='play-next-btn']"));
        WebElement playButton = driver.findElement(By.xpath("//span[@data-testid='play-btn']"));

        playNextButton.click();
        playButton.click();

    }

    public boolean is SongPlaying() {
        WebElement soundBar = driver.findElement(By.xpath("//div[@data-testid='sond-bar-play']"));
        return soundBar.isDisplayed();
    }



    public void provideEmail(String email) {
        WebElement emailField = driver.findElement(By.cssSelector("input[type='email']"));
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void providePassword(String password) {
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void clickSubmit() {
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

    }





}
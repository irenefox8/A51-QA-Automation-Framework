public class Homework17 extends BaseTest {
    @Test
    public void addSongToPlaylist() throws InterruptedException {
        String expectedSongAddedMessage = "Added 1 song into \"Test Pro Playlust.\"";

        navigateToPage();
        provideEmail("demo@class.com");
        providePassword("te$t$tident");
        clickSubmit();
        Thread.sleep(2000);
        searchSong("Ketsa");
        clickViewAllBtn();
        selectFirstSongResult();
        clickAddToBtn();
        choosePlayList();
        Assert.assertEquals(getAddPlaylistSucessMsg(), expectedSongAddedMessage);

    }


    public void search(String name) throws InterruptedException {
        WebElement viewAll = driver.findElement(By.cssSelector("div#searchForm input[type='search']));
                searchField.sendKeys(name);
        Thread.sleep(2000);
    }

    public void clickViewAllBtn() throws InterruptedException {
        WebElement viewAll - driver.findElement(By.xpath("//button[@data-test='view-all-songs-btn']"));
        viewAll.click();
        Thread.sleep(2000);

    }

    public void selectFirstSongResult() throws InterruptedException {
        WebElement firstSong = drive.findElement(By.xpath("//section[@id='songResultsWrapper']//tr[@class='song-item'][1]"));
        first.click();
        Thread.sleep(2000);
    }

    public void clickAddToBtn() throws InterruptedException {
        WebElement addToButton = driver.findElement(By.xpath("//section[@id='songResulsWraper']//button[@data-test='add-to=btn']"));
        addToButton.click();
        Thread.sleep(2000);
    }

    public void choosePlayList() throws InterruptedException {
        WebElement playlist = driver.findElement(By.xpath("//section[@iod='songResultsWrapper']//li[contains(text(),'New Play')]"));
        playlist.click();
        Thread.sleep(2000);

    }

    public String getAddPlaylistSucessMsg() {
        WebElement notification = driver.findElement(By.cssSelector("div.success.show"));
        return notification.getText();
    }

    public void navigateToPage() {
        driver.get(url);
    }

    public void provideEmail(String email) {
        WebElement mailField = driver.findElement(By.cssSelector("input[type='email']"));
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

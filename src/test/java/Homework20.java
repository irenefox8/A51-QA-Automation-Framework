public class Homework-20 extends BaseTest {


@Test
public void deletePlaylist() throws InterruptedException {
        String exeptedPlaylistDeletedMessage = "Deleted playlist\"1 Playlist.\"";

        privideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        openPlaylist();
        clickDeletePlaylistBtn();
        Assert.assertEquals(getDeletedPlaylistMsg(), expextedPlaylistDeletedMessage);

        }

public void openPlaylist(){
        WebElement emptyPlaylist = driver.findElement(By.cssSelector(".playlist:nth-child(3)"));
        emptyPlaylist.click();

        }

public void clickDeletedPlaylistBtn() throws InterruptedException {
        WebElement deletedPlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
        deletePlaylist.click();
        Thread.sleep(2000);
        }

public String getDeletedPlaylistMsg(){
        WebElement notificationMsg = drive.findElement(By.cssSelector("div.success.show"));
        return notificationMsg.getText();
        }

        }
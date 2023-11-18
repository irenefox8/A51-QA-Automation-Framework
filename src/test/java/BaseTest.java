import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;


String newPlaylistName = "Sample Edited Playlist";

@Test
public void renamePlaylist() {
    String updatePlaylistMsg = "Updated playlist \"Sample Edited Playlist.\"";
    provideEmail("demo@class.com");
    providePassword("te$t$tudent");
    clickSubmit();
    doubleClickPlaylist();
    enterNewPlaylist();
    Assert.assertEquals(getRenamePlaylistSuccessMSG(), updatedPlaylistMsg);
}

public void doubleClickPlaylist() {
    WebElement playlistElement = wait.until(ExpectedConditions.visibilityofElementLocated(By.cssSelector("playlist:nth-child(3"));
    actions.doubleClick(playlistElement).perform();

}

public void enterNewPlaylistName() {
    WebElement playlistInputField = wait.until(ExpectedConditions.visibilityofElementLocated(By.cssSelector("[name='name']")));
    playlistInputField.sendKeys(Key.schord(Keys.control,"A", Keys.BACK_SPACE));
    playlistInputField.sendKeys(newPlaylistName);
    playlistInputField.sendKeys(Keys.ENTER);

}

public String getRenamePlaylistSuccessMsg(){
    WebElement notification=wait.until(ExpectedCondotions.visibilityofElementLocated(By.cssSelector("div.success.show")));
    return notification.getText();
}


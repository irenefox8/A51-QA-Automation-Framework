import org.junit.Test;

public class Homework22 extends BaseTest {

    @Test
    public void renamePlaylist() {
        String newPlylistName = "Test Pro Edited Playlist";
        String updatePlaylistMsg = "Updated playlist \"Test Pro Edited Playlist.\"";
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.login();
        homePage.doubleClickPlaylist();
        homePage.enterNewPlaylistName(newPlaylistName);
        Assert.assertEquals(homePage.getRenamePlaylistSuccessMsg(), updatePlaylistMsg);

    }
}

package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){

        var uploadPage = homePage.clickFileUpload();
        uploadPage.uploadFile("/Users/Ilya/IdeaProjects/webDriverTAU/resources/chromedriver");

        assertEquals(uploadPage.getUploadedFiles(), "chromedriver", "Uploaded files incorrect");
    }
}

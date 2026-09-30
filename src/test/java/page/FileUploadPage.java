package page;

import org.openqa.selenium.WebDriver;

import uiStore.FileUploadLocator;
import utils.WebdriverHelper;

public class FileUploadPage {

    WebDriver driver;
    WebdriverHelper helper = new WebdriverHelper();
    FileUploadLocator loc = new FileUploadLocator();

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadfile() {

        String filePath = System.getProperty("user.dir")
                + "\\testdata\\Bishnu_Rayaguru_SDET_QA_Automation.pdf";

        helper.sendKeys(loc.choosefile, filePath, driver);

        helper.clickOnElement(loc.uploadbtn, driver);

        helper.assertPartialText(
                loc.uploadconfirmation,
                "Uploaded!",
                driver
        );
    }
}
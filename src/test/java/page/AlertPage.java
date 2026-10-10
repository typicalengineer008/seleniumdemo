package page;

import org.openqa.selenium.WebDriver;

import uiStore.Alert;
import utils.WebdriverHelper;

public class AlertPage {
Alert loc=new Alert();
WebDriver driver;
WebdriverHelper helper=new WebdriverHelper();

public void acceptAlert(WebDriver driver) {
	helper.clickOnElement(loc.jsAlrt, driver);
	helper.AccceptAlert(driver);
	helper.clickOnElement(loc.jsAlrt, driver);
	helper.dismissAlert(driver);
}
public void dismissAlert(WebDriver driver) {
	
	helper.clickOnElement(loc.jsAlrt, driver);
	helper.dismissAlert(driver);
	}

}

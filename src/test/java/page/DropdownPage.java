package page;

import org.openqa.selenium.WebDriver;

import uiStore.DropdownLocators;
import utils.WebdriverHelper;

public class DropdownPage {
	WebdriverHelper helper=new WebdriverHelper();
	WebDriver driver;
	DropdownLocators loc=new DropdownLocators();
	public void selectOption(WebDriver driver,String value) {
		
		helper.selectByValue(loc.dropdown, value, driver);
	    String option=helper.getText(loc.selection, driver);
	    System.out.println(option);
	}
}

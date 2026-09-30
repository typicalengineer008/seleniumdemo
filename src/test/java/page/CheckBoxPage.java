package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import uiStore.CheckBoxLocator;
import utils.WebdriverHelper;

public class CheckBoxPage {
WebDriver driver;
WebdriverHelper helper=new WebdriverHelper();
CheckBoxLocator loc=new CheckBoxLocator();
 public void selecctCheckbox1( WebDriver driver) {
	 helper.clickOnElement(loc.checkbox1, driver);
 }
 public void isCheckedch1( WebDriver driver) {
	 WebElement checkbox1=driver.findElement(loc.checkbox1);
	 boolean selected=checkbox1.isSelected();
	 System.out.println("The Checkbox1 Selection is "+selected);  
	 
 }
 public void isCheckedch2( WebDriver driver) {
	 WebElement checkbox2=driver.findElement(loc.checkbox2);
	 boolean selected=checkbox2.isSelected();
	 System.out.println("The Checkbox2 Selection is "+selected);  
	 
 }
}

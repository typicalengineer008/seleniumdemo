package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.AlertPage;
import page.CheckBoxPage;
import page.DropdownPage;
import page.FileUploadPage;
import page.LoginPage;
import utils.Base;



public class TestRunner {
	Base base=new Base();
	WebDriver driver;
	CheckBoxPage checkbox=new CheckBoxPage();
	LoginPage login=new LoginPage();
	DropdownPage dropdown=new DropdownPage();
	FileUploadPage fileupload;
	AlertPage alert=new AlertPage();
 @BeforeMethod
 public void startBrowser() {
	driver= base.openBrowser();
	fileupload=new FileUploadPage(driver);
	 
 }
 
 @Test(enabled=true)
 public void logintc1() {
	 base.openUrl(driver, "login");
	 login.enterUserID(driver,"tomsmith");
	 login.enterPassword(driver,"SuperSecretPassword!");
	 login.enterLogin(driver);
	 login.nextPageConformation(driver);
	 
 }
 @Test (enabled=true)
 public void invalidlogintc2() {
	 base.openUrl(driver, "login");
	 login.enterUserID(driver,"tomsknmith");
	 login.enterPassword(driver,"SuperSecrnbetPassword!");
	 login.enterLogin(driver);
	 login.loginError(driver);
	 
 }
 @Test (enabled=true)
 public void dropdowntc3(){
	 base.openUrl(driver, "dropdown");
	 dropdown.selectOption(driver, "2");
	 
 }
 @Test(enabled=true)
 public void checkboxtc4(){
	 base.openUrl(driver, "checkbox");
	 checkbox.isCheckedch1(driver);
	 checkbox.isCheckedch1(driver);
	 checkbox.selecctCheckbox1(driver);
	 checkbox.isCheckedch1(driver);
	 
 }
 @Test(enabled=true)
 public void fileupload5() {
	 base.openUrl(driver, "upload");
	 fileupload.uploadfile();
 }
 @Test(enabled=true)
 public void alertactiontc6()
 {
	 base.openUrl(driver, "alert");
	 alert.acceptAlert(driver);
	 
	 
 }
 @AfterMethod
 public void browserColose() {
	 driver.quit();
	 
 }
}

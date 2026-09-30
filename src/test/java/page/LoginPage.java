package page;

import org.openqa.selenium.WebDriver;

import uiStore.LoginPageLocators;

import utils.WebdriverHelper;


public class LoginPage {
LoginPageLocators loc=new LoginPageLocators();
WebdriverHelper helper=new WebdriverHelper();
WebDriver driver;
public void enterUserID(WebDriver driver,String id) {
	
	helper.sendKeys(loc.username, id, driver);
	
}
public void enterPassword(WebDriver driver,String pw) {
	
	helper.sendKeys(loc.password, pw, driver);
	
}
public void enterLogin(WebDriver driver) {
	
	helper.clickOnElement(loc.loginBTN, driver);
	
}
public void nextPageConformation(WebDriver driver) {
	helper.assertText(loc.nextpageText, "Welcome to the Secure Area. When you are done click logout below.", driver);
}
public void loginError(WebDriver driver) {
	helper.assertPartialText(loc.loginErrorText, "Your username is invalid!", driver);
}
}

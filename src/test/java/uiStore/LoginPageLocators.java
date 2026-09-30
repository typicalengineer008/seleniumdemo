package uiStore;

import org.openqa.selenium.By;

public class LoginPageLocators {
public By username=By.id("username");
public By password=By.id("password");
public By loginBTN=By.xpath("//button[@type='submit']");
public By nextpageText=By.xpath("//h4[text()='Welcome to the Secure Area. When you are done click logout below.']");
public By loginErrorText=By.xpath("//div[@id='flash']");
}

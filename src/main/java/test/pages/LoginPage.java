package test.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="login-username")
	WebElement username;
	
	@FindBy(id="login-password")
	WebElement password;
	
	@FindBy(id="b2b_login")
	WebElement loginButton;
			
	@FindBy(xpath="//strong[text()='Oops! Speedbreaker']")
	WebElement errorMessage;
	
	
	public Homepage logintoB2B(String url, String un, String pwd)
	{
		driver.get(url);
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		return new Homepage(driver);
	}
	
	public String getInvalidErrorMessage(String url, CharSequence un, CharSequence pwd)
	{
		driver.get(url);
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
		String error = errorMessage.getText();
		return error;
	}

}

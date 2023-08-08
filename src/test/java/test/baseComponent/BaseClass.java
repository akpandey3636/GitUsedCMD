package test.baseComponent;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import test.pages.LoginPage;

public class BaseClass {
	
	public WebDriver driver;
	public LoginPage loginpage;
	public WebDriver getInitializeDriver() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+
				                "//src//main//java//test//resouces//browserInfo.properties");
		Properties property=new Properties();
		property.load(fis);
		String browsername = property.getProperty("browser");
		if(browsername.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		else if(browsername.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		return driver;
	}
	
	@BeforeTest
	public LoginPage loginpage() throws IOException
	{
		driver=getInitializeDriver();
		loginpage=new LoginPage(driver);
		return loginpage;
	}
	
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}

}

package test.runMe;

import java.io.IOException;

import org.testng.annotations.Test;

import test.baseComponent.BaseClass;
import test.pages.Homepage;

public class LoginProcess_Valid extends BaseClass{
	
	@Test
	public void checkLogin() throws IOException, InterruptedException
	{
		Homepage hm=loginpage.logintoB2B("https://b2b.getpitstop.com/","autoverse_test", "Pitstop@123");
		Thread.sleep(5000);
		
		hm.clickOnManageSpare();
		hm.clickonSpareRequest();
		
	}

}

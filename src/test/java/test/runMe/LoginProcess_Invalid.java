package test.runMe;


import org.testng.Assert;
import org.testng.annotations.Test;

import test.baseComponent.BaseClass;

public class LoginProcess_Invalid extends BaseClass{
	@Test
	public void verifyInvalidErrorMessage()
	{	 
		String error_message = loginpage.getInvalidErrorMessage("https://b2b.testpitstop.com/","ashishkumar.pandey", "Otp@2345");
		Assert.assertEquals(error_message, "Oops! Speedbreaker");
		
	}

}

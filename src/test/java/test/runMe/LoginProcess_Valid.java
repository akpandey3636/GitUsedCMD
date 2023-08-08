package test.runMe;

import java.io.IOException;

import org.testng.annotations.Test;

import test.baseComponent.BaseClass;

public class LoginProcess_Valid extends BaseClass{
	
	@Test
	public void checkLogin() throws IOException
	{
		loginpage.logintoB2B("https://b2b.testpitstop.com/","ashishkumar.pandey", "Otp@23456");
	}

}

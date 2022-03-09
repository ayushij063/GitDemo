package test;

import org.testng.annotations.Test;

public class day4 {

	@Test
	public void Weblogin()
	{
		//selenium code
	System.out.println("selenium");
	}
	
	@Test(groups= {"smoke"})
	public void mobileLogin()
	{
		//appium code
		System.out.println("appium");
	}
	
	@Test
	public void APILogin()
	{
		//api code
		System.out.println("api");
	}
	
}

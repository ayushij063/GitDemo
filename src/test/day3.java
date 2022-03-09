package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {

	@Parameters({"URL"})
	@Test()
	public void WebloginURL(String urlname)
	{
		System.out.println("URL");
		System.out.println(urlname);
	}
	
	@Test(enabled=false)
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
	
	@Test(dependsOnMethods= {"AWeblogin"})
	public void APIcarloan()
	{
		//api code
		System.out.println("api");
	}
	
	@Test(dataProvider= "getData")
	public void Mobilesignout(String username, String password)
	{
		//api code
		System.out.println("mobile sogn out");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@DataProvider
	public Object[][] getData()
	{
		//1st combination-username ,password
		//2nd - username ,password
		//3rd -fraudelent
		
		//--define multi dimemtional array
		Object[][] data=new Object[3][2]; // 3 rows and 2 colums (username/pw)
		data[0][0]="firstsetusername";
		data[0][1]="password";
				
		//couloumns are nothing but values for that particular combination
		
		//2nd set
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
	
	return data;
	}
	@Test
	public void AWeblogin()
	{
		//selenium code
	System.out.println("AWeblogin");
	}
	
}

package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

		// TODO Auto-generated method stub

		//testng need method to execute cases
	
		@Test(groups= {"smoke"})
		public void ploan()
		{
			System.out.println("good");
		}
		
		@BeforeTest
		public void prerequiste()
		{
			System.out.println("pre");
		}
		
	

}

package test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {

		// TODO Auto-generated method stub

		//testng need method to execute cases
	
	@Test
	public void lasTTest()
	{
		
		System.out.println("last");
		Assert.assertTrue(false);
	}
	
		@AfterTest
		public void Demo()
		{
			System.out.println("hello");
		}
		

		@Test
		public void secondTest()
		{
			System.out.println("hi");
		}

	

}

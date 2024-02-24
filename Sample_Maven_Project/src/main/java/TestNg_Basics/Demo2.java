package TestNg_Basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	
	  @Test
	   	public void LoginPage()
	   	{
	   		System.out.println("Click on Login link in home page");
	   	}
	  
    @Test
	public void HomePage()
	{
		String expectedPagetitle="Facebook";
		String actualPagetitle="FaceBook";
		
		
		Assert.assertEquals(actualPagetitle, expectedPagetitle);
		
		System.out.println("Karimulla");
		System.out.println("Infosys");
		System.out.println("Mysore");
	
	}
    
    
    @Test
   	public void LogOutPage()
   	{
   		System.out.println("Click on LogOut link in home page");
   	}
    
 

}

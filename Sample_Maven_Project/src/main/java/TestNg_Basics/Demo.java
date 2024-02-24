package TestNg_Basics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	
    @Test(dataProvider="Data")
	public void Login(String Username,String Password)
	{
		System.out.println(Username);
		System.out.println(Password);
	}
    
    @DataProvider(name="TestData")
    public Object[][] testData()
    {
    	Object[][] data= new Object[1][2];
    	data[0][0]="Karimulla";
    	data[0][1]="Infosys123";
    	return data;
    }
    
    @DataProvider(name="Data")
    public Object[][] testData1()
    {
    	Object[][] data= new Object[1][2];
    	data[0][0]="Kavya";
    	data[0][1]="Infosys123";
    	return data;
    }
}

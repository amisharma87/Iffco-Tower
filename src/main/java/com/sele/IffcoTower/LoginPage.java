package com.sele.IffcoTower;
 import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import com.utility.Constant;
import com.utility.ExcelUtility;
import com.utility.GMethods;



public class LoginPage {

	public void browse()
	{
		
		GMethods.urlbrowse(Constant.url);
	}
	
	public void healthinsuarnce() throws IOException
	{
	  //GMethods.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		GMethods.mousehover("HI");
		
	
		
	}
	
	public void familyhealth() throws IOException {
		
		GMethods.mousehover("FHP");
		GMethods.mousehover("Buy");
		GMethods.click("Buy");
	}
	
	
	
	public void buy() throws IOException
	{
	  //GMethods.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		
		GMethods.click("ByOnline");
		
	}
	

	
	
	public void form() throws IOException, InterruptedException
	{
		
		GMethods.click("Ince");
		GMethods.clickid("month");
		GMethods.selectByValue("4");
		GMethods.clickid("year");
		GMethods.selectByValue("2018");
		GMethods.click("date");
		GMethods.clickid("SumIn");
		GMethods.selectByValue("200000");	
		GMethods.click("Cover");
		
		String fName = ExcelUtility.getexceldata(1,1);	
		GMethods.clickidd("firtsmem", fName);
		String lName = ExcelUtility.getexceldata(1,2);	
		GMethods.clickidd("lastname", lName);
		GMethods.click("dob");
		GMethods.clickid("mon");
		GMethods.selectByValue("9");
		GMethods.clickid("yea");
		GMethods.selectByValue("1987");
		GMethods.click("dat");
		GMethods.clickid("preexist");
		GMethods.selectByValue("N");
       // Thread.sleep(2500);
		GMethods.clickid("relation");
		GMethods.selectByValue("Self");	
			
		GMethods.clickid("gender");
		GMethods.selectByValue("F");
		String height = ExcelUtility.getexceldata(1,3);	
		GMethods.clickidd("height", height);
		String wight = ExcelUtility.getexceldata(1,4);	
		GMethods.clickidd("Weight", wight);
		GMethods.clickid("Occupat");
		GMethods.selectByValue("ENGR");
			
		String fNam = ExcelUtility.getexceldata(2,1);	
		GMethods.clickidd("Anothfirtsmem", fNam);
		String lNam = ExcelUtility.getexceldata(2,2);	
		GMethods.clickidd("Anothlastname", lNam);
		GMethods.click("Anothdob");
		GMethods.clickid("Anothmon");
		GMethods.selectByValue("5");
		GMethods.clickid("Anothyea");
		GMethods.selectByValue("1987");
		GMethods.click("Anothdat");
		GMethods.clickid("Anothpreexist");
		GMethods.selectByValue("N");
		GMethods.clickid("Anothrelation");
		GMethods.selectByValue("Spouse");	
				
		GMethods.clickid("Anothgender");
		GMethods.selectByValue("F");
		String heigh = ExcelUtility.getexceldata(2,3);	
		GMethods.clickidd("Anothheight", heigh);
		String weight = ExcelUtility.getexceldata(2,4);	
		GMethods.clickidd("AnothWeight", weight);
		GMethods.clickid("AnothOccupat");
		GMethods.selectByValue("ENGR");
				
	
		
	}
	
	public void det() throws IOException, InterruptedException
	{
        GMethods.details();
		Thread.sleep(2500);
		String Mob = ExcelUtility.getexceldata(1,5);
		GMethods.clickidd("Mobile", Mob);
		String email = ExcelUtility.getexceldata(1,6);	
		GMethods.clickidd("email", email);
		String emername = ExcelUtility.getexceldata(4,1);
		GMethods.clickidd("emrgncyname", emername);
		String emermob = ExcelUtility.getexceldata(4,5);
		GMethods.clickidd("emrgncymob", emermob);
		GMethods.click("calpre");
	
	}
	public void nominee() throws IOException, InterruptedException {
		
		GMethods.details();
		Thread.sleep(2500);
		String name = ExcelUtility.getexceldata(3,1);
		GMethods.clickidd("Nomineename", name);
		GMethods.clickid("nomrelation");
		GMethods.selectByValue("Spouse");
		GMethods.clickid("state");
		GMethods.selectByValue("HAR");
		GMethods.clickid("city");
		GMethods.selectByValue("GURGAON");
		String pincode = ExcelUtility.getexceldata(1,7);
		GMethods.clickidd("pincode", pincode);
		
	
	}
	
public void buttonclick() throws IOException, InterruptedException
{
	GMethods.details();
	Thread.sleep(2500);
	GMethods.click("buyon");
	}
}


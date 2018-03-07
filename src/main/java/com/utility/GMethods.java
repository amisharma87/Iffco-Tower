package com.utility;



import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.data.Prop;


public class GMethods {


	public static String browser = Constant.url;
	public static WebDriver driver;
	public static Actions act;
	public static String read,readc,dropdate,val,readid;
	public static WebElement ele,eleid;
	public static String str = Constant.file;

	public static void urlbrowse(String browser) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\Amita_system\\backup\\Softwares\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		driver.get(browser);
	 /*   if(browser.equalsIgnoreCase("firefox"))
	    {
		System.setProperty("webdriver.gecko.driver", "E:\\Amita_system\\backup\\Softwares\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		driver.get(browser);
	}
		else if(browser.equalsIgnoreCase("chrome"))
		{*/
		/*System.setProperty("webdriver.chrome.driver", "E:\\Amita_system\\backup\\Softwares\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS) ;
		driver.get(browser);
		
		//}
*/	}

     public static void Act(WebElement ele)
     {
    	 act = new Actions(GMethods.driver);
    	 act.moveToElement(ele).build().perform();
  
     }
     
    
     public static WebElement getWebElement(String str) throws IOException{
         WebElement ele = null;        
 	     ele =driver.findElement(By.xpath(str));
 		 return ele;

 		}
 	
  
     public static String mousehover(String data) throws IOException
     {
    	 read = Prop.readdata(data);
    	 ele = GMethods.getWebElement(read);
         GMethods.Act(ele);
		 return data;
    	 
    	 
     }
     public static String click(String datac) throws IOException
     {
    	 readc = Prop.readdata(datac);
    	 ele = GMethods.getWebElement(readc);	
    	 ele.click(); 
		 return datac;
    	 
    	 
     }
     
     public static String clickid(String idd) throws IOException
     {
    	 readid = Prop.readdata(idd);
    	 eleid = GMethods.getWebElement(readid);
		 return idd;	 
     }
     
     public static void clickidd(String idd, String st) throws IOException
     {
    	 readid = Prop.readdata(idd);
    	 eleid = GMethods.getWebElement(readid);
    	 eleid.sendKeys(st);
		
     }
   

     public static void selectByValue(String value) throws IOException {
    	 Select drop=new Select(GMethods.eleid);
    	 drop.selectByValue(value);
    	 }
     
     

   public static void getscreenshot() throws IOException
   {
	   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       //The below method will save the screen shot in d drive with name "screenshot.png"
       FileUtils.copyFile(scrFile, new File("E:\\Amita_system\\backup\\19thdec2019\\IffcoTower\\src\\main\\java\\Screenshots.png"));
   }
	public static void details() throws IOException
	{

		JavascriptExecutor jse = (JavascriptExecutor)GMethods.driver;
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	}
}




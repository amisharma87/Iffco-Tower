package com.sele.IffcoTower;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.utility.GMethods;

public class Login {
	//@Parameters("browser")
	@Test(priority =1)
	public static void runurl()
	{
		LoginPage login = new LoginPage();
		login.browse();
		
	}
	@Test(priority =2)
	public static void healthinsuarnce() throws IOException
	{
		
		LoginPage login = new LoginPage();
		login.healthinsuarnce();
		
	}
	
	@Test(priority =3)
	public static void familyheal() throws IOException
	{
		
		LoginPage login = new LoginPage();
		login.familyhealth();
		
	}

	@Test(priority =4)
	public static void buy() throws IOException
	{
		
		LoginPage login = new LoginPage();
		login.buy();
		
	}
	@Test(priority =5)
	public static void form() throws IOException, InterruptedException
	{
		
		LoginPage login = new LoginPage();
		login.form();
		
	}
	
	
	
	@Test(priority =6)
	public static void deta() throws IOException, InterruptedException
	{
		//Thread.sleep(2500);
		LoginPage login = new LoginPage();
		login.det();
		
	}
	@Test(priority =7)
	public static void nomi() throws IOException, InterruptedException
	{
		//Thread.sleep(2500);
		LoginPage login = new LoginPage();
		login.nominee();
		
	}
	@Test(priority =8)
	public static void click() throws IOException, InterruptedException
	{
		//Thread.sleep(2500);
		LoginPage login = new LoginPage();
		login.buttonclick();
		
	}
	
	
}

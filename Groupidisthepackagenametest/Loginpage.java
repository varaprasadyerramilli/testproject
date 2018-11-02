package Groupidisthepackagenametest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import Groupidisthepackagenamemain.Baseclass;


public class Loginpage extends Baseclass{
	@Test
	public void loggingin() throws IOException 
	{
		driver=browserinvoking();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.id("email")).sendKeys("varaprasadyerramilli@yahoo.com	");
	    driver.findElement(By.id("pass")).sendKeys("143@Alekhyaaa");
	    driver.findElement(By.xpath("//input[@value='Log In']")).click();
	    System.out.println(driver.getCurrentUrl());
	    System.out.println(driver.getTitle());
	}

	}



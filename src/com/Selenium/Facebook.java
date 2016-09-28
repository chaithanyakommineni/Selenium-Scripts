package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("chaitukommineni25@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("9490061573");
	driver.findElement(By.id("loginbutton")).click();
	driver.manage().window().maximize();
	Thread.sleep(10000);
	System.out.println("Facebook login succesfully");
	
	driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
	Thread.sleep(30000);
	driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']/div/div/div[1]/div/div/ul/li[12]/a/span/span")).click();
	System.out.println("Facebook logout succesfully");
	
	}

}

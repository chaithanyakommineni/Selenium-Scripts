package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webdriver {

	
	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		
		driver.findElement(By.id("login-email")).sendKeys("komminenichaithanya@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("9492055182k");
		driver.findElement(By.name("submit")).click();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.close();
		System.out.println("welcome to linkdin");
	}

}

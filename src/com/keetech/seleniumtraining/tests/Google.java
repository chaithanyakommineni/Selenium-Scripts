package com.keetech.seleniumtraining.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Google {
    public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/test.html");
		driver.manage().window().maximize();
		
		//this timeout is applicable for the entire driver life cycle
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Test to Validate Header Text of a page
		String headerText = driver.findElement(By.id("header")).getText();
		Assert.assertEquals(headerText, "WelCome to Selenium Training");
		
		//Another Test - To Test Login
		driver.findElement(By.id("username")).sendKeys("keetech");
		driver.findElement(By.id("password")).sendKeys("keetech");
		driver.findElement(By.id("login")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertEquals(alert.getText(), "OOPS!!! Login Failed!!!");
		alert.accept();
		
	}
}
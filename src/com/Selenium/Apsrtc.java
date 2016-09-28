package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Apsrtc {

	public static void main(String[] args ) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.apsrtconline.in/oprs-web/login/show.do");
		driver.findElement(By.id("userName")).sendKeys("chaitunani1");
		driver.findElement(By.id("password")).sendKeys("9492055182k");
	
		driver.findElement(By.id("submitBtn")).click();
		driver.manage().window().maximize();
		System.out.println("login succesfully");
		Thread.sleep(30000);
		driver.findElement(By.xpath(".//*[@id='header']/div/div[4]/a[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		System.out.println("logout succesfully");
		driver.manage().deleteAllCookies();
	

	}}

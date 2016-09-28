package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ravi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new FirefoxDriver(); 
      driver.get("https:\\www.google.com");
      driver.findElement(By.name("username")).sendKeys("pussy_chaitu");
      driver.findElement(By.name("password")).sendKeys("fuckky1234");
      driver.findElement(By.xpath("submit")).click();
      driver.findElement(By.className("user")).sendKeys("nani");
      driver.findElement(By.cssSelector("password")).sendKeys("1234");
      driver.findElement(By.id("ravi")).sendKeys("123");
      driver.findElement(By.linkText("hello")).sendKeys("hi");
      driver.findElement(By.name("shiva")).sendKeys("47895");
      driver.findElement(By.partialLinkText("oiiii")).sendKeys("hiiiiii");
      driver.findElement(By.tagName("h1")).sendKeys("hello world");
      driver.findElement(By.xpath(".\\@@")).sendKeys("14kkk");
      driver.get("https:www.facebook.com");
      driver.navigate();
      driver.close();
      driver.quit();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     driver.getTitle();
     System.out.println("chaitu");
     driver.navigate().back();
     driver.navigate().forward();
     driver.navigate().refresh();
    // Webdriver
	}

}

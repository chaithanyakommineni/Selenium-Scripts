package com.keetech.seleniumtraining.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.flipkart.com/?semcmpid=sem_8024046704_brand_goog&tgi=sem%2C1%2CG%2C8024046704%2Cg%2Csearch%2C%2C80614873960%2C1t1%2Ce%2Cflipcart%2Cc%2C%2C%2C%2C%2C%2C%2C&gclid=CNqex87Sjs4CFdUQaAodVoYKYg");
		driver.manage().window().maximize();
		WebElement search= driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[2]/div/div[2]/div/form/div/input"));
		search.clear();
		search.sendKeys("redminote");
		search.clear();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		

}
}

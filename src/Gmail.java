import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Selenium.Webdriver;

public class Gmail {

	FirefoxDriver driver;
	

@Test
public void gmaillogin()
{
	driver.findElement(By.id("Email")).sendKeys("chaithanya061993@gmail.com");
	driver.findElement(By.id("next")).click();
	driver.findElement(By.id("Passwd")).sendKeys("9492055182k");
	driver.findElement(By.id("signIn")).click();
}
@BeforeTest
public void beforetest()
{
	 driver=new FirefoxDriver();
	  driver.get("https://accounts.google.com/ServiceLogin?service=mail&continue=https://mail.google.com/mail/#identifier");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@Test
public void gmaillogout()
{
	driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
	driver.findElement(By.linkText("Sign out")).click();
}
@AfterTest
public void aftertest()
{
	driver.quit();
}
}

	

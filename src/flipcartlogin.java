import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class flipcartlogin {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.flipkart.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.findElement(By.linkText("Log In")).click();
			driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("7396618327");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7396618327k");
			driver.findElement(By.xpath("html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
			//driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span")).click();
	}

}

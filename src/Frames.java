import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/Selenium%20Class%20Code/SeleniumTest/SeleniumTest/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame("myHeader");
		WebElement chaitu=driver.findElement(By.xpath("//h3[contains(text(),'Welcome')]"));
		System.out.println(chaitu.getText());
	/*	driver.switchTo().defaultContent();
		driver.switchTo().frame("myNavigation");
		//driver.findElement(By.xpath(".//*[@id='myTree']")).click();
		driver.findElement(By.linkText("tree")).click();
		driver.findElement(By.linkText("Handle Alert")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("myDetail");
		driver.findElement(By.id("myBtn")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("alert");
		alert.accept();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("myDetail");
	driver.findElement(By.id("myInputText")).sendKeys("chaitu");*/
	}

}

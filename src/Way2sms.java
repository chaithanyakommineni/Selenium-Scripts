import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

import com.Selenium.Webdriver;
import com.sun.jna.platform.FileUtils;
import com.thoughtworks.selenium.webdriven.commands.Click;

public class Way2sms {
	public static void main(String[] args) 
	{
        
WebDriver driver=new FirefoxDriver(); 
driver.get("http://site21.way2sms.com/content/index.html?");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("9492055182");
driver.findElement(By.id("password")).sendKeys("9493807483k");
driver.findElement(By.id("loginBTN")).click();
File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//FileUtils.copyFile(scrFile,new File("c:\\tmp\\screenshot.png"));
//FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[3]/div/input[3]")).click();
driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.switchTo().frame("frame");
driver.findElement(By.id("mobile")).sendKeys("9652414312");
driver.findElement(By.id("message")).sendKeys("hello sandeep");
driver.findElement(By.id("Send")).click();
/*Alert alert=driver.switchTo().alert();
System.out.println("alert");
alert.accept();*/
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//logout xpath
//driver.findElement(By.xpath(".//*[@id='mainBody']/div[5]/div/ul/li[7]/i")).click();
//by using javascript logout






/*driver.switchTo().defaultContent();
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("javascript:logout();");
*/
		
	}

	private static Object TakesScreenshotAs() {
		// TODO Auto-generated method stub
		return null;
	}

}

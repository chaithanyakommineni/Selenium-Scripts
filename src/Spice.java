import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class Spice {

	public static void main(String[] args) {
		//File file = new File("D:\\");
		//System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		

		System.setProperty("WebDriver.chrome.driver", "D:\\IEDriverServer_x64_2.53.1");
		WebDriver driver=new InternetExplorerDriver();
		
		//WebDriver driver=new FirefoxDriver();
		driver.get("http://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		//WebElement select1=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1"));
	//	select1.click();
		 /*Select select=new Select(select1);
		 select.selectByVisibleText("From");*/
driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
driver.findElement(By.linkText("Hyderabad (HYD)")).click();
driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
driver.findElement(By.linkText("Vishakhapatnam (VTZ)")).click();
driver.findElement(By.id("ctl00_mainContent_txt_Fromdate")).click();
driver.findElement(By.linkText("24")).click();
WebElement select1=driver.findElement(By.id("ctl00_mainContent_ddl_Adult"));
Select select=new Select(select1);
select.selectByVisibleText("5 Adults");
select.selectByIndex(2);
select.selectByValue("6");
WebElement select2=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
select2.click();
Select select4=new Select(select2);
select4.selectByIndex(3);
select4.selectByVisibleText(".//*[@id='ctl00_mainContent_ddl_Child']/option[4]");

WebElement select8=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
select.selectByVisibleText("2 Children");
//select.selectByIndex(2);
//select.selectByValue("4");
WebElement select7=driver.findElement(By.id("ctl00_mainContent_ddl_Child"));
select7.click();
select.selectByVisibleText("4 Infants");
WebElement select3=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
Select selects=new Select(select3);
select.selectByVisibleText("UAE Dirham(AED)");
select.selectByIndex(1);
select.selectByValue("3");
	}

}

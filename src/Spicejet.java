import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Spicejet {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[4]/li[8]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_txt_Fromdate']")).click();
		driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[5]/td[6]/a")).click();
		

	}

}

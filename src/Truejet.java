import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Truejet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("http://www.trujet.com/ebooking/home/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.findElement(By.id("rboOneWay")).click();
driver.findElement(By.id("drpOrigin")).click();
driver.findElement(By.xpath(".//*[@id='drpOrigin']/option[3]")).click();
driver.findElement(By.id("drpDestination")).click();
driver.findElement(By.xpath(".//*[@id='drpDestination']/option[3]")).click();
driver.findElement(By.id("txtDepartureDate")).click();
driver.findElement(By.xpath(".//*[@id='imgDepartDate']")).click();
driver.findElement(By.xpath(".//*[@id='tblCal1']/tbody/tr[8]/td[7]/a")).click();
driver.findElement(By.id("txtReturnDate")).click();
driver.findElement(By.id("drpAdult")).click();
driver.findElement(By.xpath(".//*[@id='drpAdult']/option[6]")).click();
driver.findElement(By.id("drpChild")).click();
driver.findElement(By.xpath(".//*[@id='drpChild']/option[9]")).click();
driver.findElement(By.id("drpInfant")).click();
driver.findElement(By.xpath(".//*[@id='drpInfant']/option[2]")).click();
driver.findElement(By.id("drpSpecialCategory")).click();
driver.findElement(By.xpath(".//*[@id='drpSpecialCategory']/option[4]")).click();
driver.findElement(By.id("MSI")).click();
/*Alert alert=driver.switchTo().alert();
System.out.println("alert");
alert.accept();
driver.findElement(By.xpath(".//*[@id='msg']/div[1]")).click();*/
/*WebDriverWait wait=new WebDriverWait(driver, 5);
wait.until(ExpectedCondition.elementToBeClickable("xpath));*/

driver.findElement(By.xpath(".//*[@id='divBookFlight']/div/div[3]")).click();

	}

}

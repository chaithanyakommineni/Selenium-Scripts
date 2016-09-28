import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("file:///D:/Selenium%20Class%20Code/SeleniumTest/SeleniumTest/home.html");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
driver.switchTo().frame("myHeader");
WebElement element=driver.findElement(By.xpath("html/body/div/h3"));
System.out.println(element.getText());
driver.switchTo().defaultContent();
driver.switchTo().frame("myNavigation");
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

driver.findElement(By.id("myInputText")).sendKeys("chaitu");
driver.findElement(By.id("myInputTextArea")).sendKeys("hello");
//driver.findElement(By.linkText("click me to show content")).click();
//driver.findElement(By.id("myCheckbox")).click();
//driver.findElement(By.id("mySelect")).click();
//driver.findElement(By.xpath(".//*[@id='mySelect']/option[4]")).click();
driver.findElement(By.linkText("click me to	open a new window")).click();
/*String parentwindowid = driver.getWindowHandle();
System.out.println("parentwindow: "+parentwindowid);

System.out.println("Current window id: "+driver.getWindowHandle());;
Set<String> setwindowids = driver.getWindowHandles();
for(String window: setwindowids){
	if(window.equals(parentwindowid))
		continue;
	else
		driver.switchTo().window(window);
	
}//for loop close
*/
String parentwindowid=driver.getWindowHandle();
System.out.println("parentwindow: "+parentwindowid);
Set<String> setwindow=driver.getWindowHandles();
for(String window:setwindow){
	 if(window.equals(parentwindowid))
		 continue;
	 else
	 {
		 driver.switchTo().window(window);
	     break;
	 }}System.out.println("currentwindow id: "+driver.getTitle());
	 Assert.assertEquals(driver.getTitle(), "satix new window");
	 driver.manage().window().maximize();
	 driver.findElement(By.id("newInputText")).sendKeys("my name is satish");
	 Thread.sleep(2000);
	 driver.close();
//driver.getWindowHandle();
/*driver.switchTo().defaultContent();
driver.switchTo().frame("frameHeader");
driver.switchTo().frame("frameDetail");
driver.findElement(By.id("myBtn2")).click();
*/


	}

}

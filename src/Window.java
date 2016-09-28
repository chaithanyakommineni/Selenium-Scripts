import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.obcindia.co.in/obcnew/site/internet_banking.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String parentwindowid=driver.getWindowHandle();
		System.out.println("parentwindowid:"+parentwindowid);
		WebElement OBCNetBankingelement=driver.findElement(By.linkText("OBC Net Banking"));
		OBCNetBankingelement.click();
		System.out.println("currentwindowid:"+driver.getWindowHandle());
	Set<String> setwindows=driver.getWindowHandles();
		for(String window:setwindows)
		{
			if(window.equals(parentwindowid))
			{
				continue;
			}
			else
			{
				driver.switchTo().window(window);
				break;
			}
		}
		System.out.println("currentwindowtitle:"+driver.getTitle());
	
	Assert.assertEquals(driver.getTitle(), "Oriental Bank of Commerce");	
		
driver.close();
driver.switchTo().window(parentwindowid);
System.out.println("currentwindow:"+driver.getTitle());
	}

}

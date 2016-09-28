import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hsbc {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
        driver.get("http://www.hsbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Valuing")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.linkText("About HSBC")).click();
        
        driver.findElement(By.xpath(".//*[@id='shareBarLargeDiv']/ul/li[6]")).click();
        driver.findElement(By.linkText("Strategy")).click();
        
        String parentwindowid = driver.getWindowHandle();
        System.out.println("parentwindowid:"+parentwindowid);
        WebElement Fbicon = driver.findElement(By.xpath(".//*[@id='shareBarLargeDiv']/ul/li[6]"));
        Fbicon.click();
        for(String winHandle : driver.getWindowHandles()){  
               driver.switchTo().window(winHandle);  
        }
        driver.findElement(By.id("email")).sendKeys("vishwakreddy69@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("****");
        driver.findElement(By.id("u_0_2")).click();
        driver.findElement(By.id("u_0_k")).click();
	}

}

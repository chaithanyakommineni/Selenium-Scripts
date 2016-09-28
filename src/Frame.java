import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new FirefoxDriver();
driver.get("file:///D:/Selenium%20Class%20Code/SeleniumTest/SeleniumTest/home.html");
driver.manage().window().maximize();
driver.switchTo().frame("subFrame");
driver.switchTo().frame("frameHeader");
driver.findElement(By.xpath("html/body/div/h3"));
System.out.println("frameheader");
driver.switchTo().defaultContent();
driver.switchTo().frame("subFrame");
driver.switchTo().frame("frameDetail");
driver.findElement(By.id("myBtn2")).click();
	}

}

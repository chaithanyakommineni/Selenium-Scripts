import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailRegistration {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("div[class='goog-inline-block goog-flat-menu-button-dropdown' ]")).click();
		driver.findElement(By.xpath("//div[@id=':a']/div")).click();

	}

}

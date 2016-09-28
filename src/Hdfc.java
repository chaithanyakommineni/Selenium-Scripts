import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hdfc {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.obconline.co.in/");
	driver.findElement(By.xpath("html/body/div/div[2]/span[2]/a")).click();
	driver.findElement(By.xpath(".//*[@id='AuthenticationFG.CORP_CORP_ID']")).sendKeys("chaithanya");
	driver.findElement(By.xpath(".//*[@id='AuthenticationFG.CORP_USER_ID']")).sendKeys("nani");
	driver.findElement(By.xpath(".//*[@id='STU_VALIDATE_CREDENTIALS']")).click();
	
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com");
		
		driver.findElement(By.name("session_key")).sendKeys("komminenichaithanya@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("9492055182k");
		driver.findElement(By.name("submit")).click();
		driver.getTitle();
		System.out.println("World’s Largest Professional Network | LinkedIn");
		
		driver.navigate().to("https:www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
		
	}

}

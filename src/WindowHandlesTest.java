import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandlesTest {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://site21.way2sms.com/content/index.html?");
		driver.manage().window().maximize();
		//WebElement Search=driver.findElement(By.xpath(".//*[@id='udemy']/div[2]/div[1]/div[2]/div[2]/form/div/input"));
		//Search.sendKeys("selenium");
		
		//driver.findElement(By.xpath(".//button[@class='home-search-btn']")).click();
		//driver.findElement(By.linkText(" Become an Instructor")).click();
		//driver.get("http://ww1.obcbank.com/?ga=GuTPiMqoQNy6Xg9Cc1nBJIytgDC83Ke7hvAkDMehYU42AwtFfZ%2BYxQiYoze%2FjXqemhOaHEURPNM9NqtFbIoGIYbeQLIM%2Bu%2BxO1x%2BmfuQJ%2B3MTWHOmOzZZ%2BXr2YTgoY3kpvEyP0g1JDUzCMgUeXSeBqIt07YM8ux64d6AcmIN7TQepvs74NkpwHPoogrjD6KbNdGM0LCmn4GEqGZqGv06QA%3D%3D&gqsg=bd72SJJFFENA2sm5477ET5%2B4%2BpfHOuDOFWS8xLOkWrvtPwBLaDeBaa20wjAoTYNH&klb=2&maxads=0&gerf=oCC12QLZ92vpsmIG0Sy%2BdUGQYQKLXb1zeZH1P5WybdM%3D&&query=Internet%20Banking&afdToken=CrYCChMIkPOloImRzgIVx6NoCh3UPgIzGAEgAFDJ2J4BUPDQoAFQ_6HQBVCNotAFUOmm0AlQjKfQCVCNp9AJUI-n0AlQ6-fhCVDfgpkLUPXJ_wtQ38K3DlD8jusOUM6WuRBQ8du5EFDig-sQUOOD6xBQ06HXI1CW6O06UJmiijxQrr6KPFDNjrw8UPz38zxQ67j9PFDbwP08UKaLgj1QqaKDPVDj7Ic9UPqcmz1Q8bqFelCsiJOPAVCJ9p2XAVD18e2XAVDMv82gAVDx5dW5AVDxwfPAAVCx6timAlCy6timAlCDva22AlCnpPPfAlDgrr-mA1DTkefTBFDusvaGBWjJ2J4BaPDQoAFxZs1rtbK-bWmCARMIwJ6moImRzgIVlqVoCh0e5wx7jQH4u4p6kQEl0x_jfdfgBxIZAG06ipC3swwtJDr9frdn1ZziI2GgkqcXcQ");
		driver.findElement(By.id("username")).sendKeys("9492055182");
		driver.findElement(By.id("password")).sendKeys("9493807483k");
		driver.findElement(By.id("loginBTN")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div[3]/div/input[3]")).click();
		driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
		driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ebFrm']/div[1]/div[1]/div[2]/div[1]/input")).click();
		//driver.findElement(By.xpath(".//*[@id='sendSMS']/a")).click();
	//	driver.findElement(By.id("sndfSMS")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.switchTo().frame("frame");
		
		//driver.findElement(By.id("mobile")).sendKeys("8885355519");
		//driver.findElement(By.id("message")).sendKeys("8885355519");
		driver.findElement(By.id("Send")).click();
		Alert alert=driver.switchTo().alert();
		System.out.println("alert");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		alert.accept();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.switchTo().window(arg0)
		driver.close();
	}

}

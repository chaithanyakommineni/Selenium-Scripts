import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailCreateaccount {

public static void main(String[] args) throws Exception {
WebDriver driver=new FirefoxDriver();
driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&hl=en");
driver.manage().window().maximize();
driver.findElement(By.id("FirstName")).sendKeys("sandy");
driver.findElement(By.id("LastName")).sendKeys("kommineni");
driver.findElement(By.id("GmailAddress")).sendKeys("komminenisandy@gmail.com");
driver.findElement(By.id("Passwd")).sendKeys("987654321");
driver.findElement(By.id("PasswdAgain")).sendKeys("987654321");
//driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]/div[2]")).click();
       // driver.findElement(By.xpath("//div[@role='listbox']")).sendKeys("June");
//dropdown.click()
driver.findElement(By.xpath("//span[@id='BirthMonth']/div")).sendKeys("July");
//Select select=new Select(dropdown);
//select.selectByVisibleText("October");
//driver.findElement(By.linkText("October")).click();
//driver.findElement(By.tagName("select")).getAttribute("April");
//List<WebElement> months =
//driver.findElements(By.xpath("//div[text()='July']"));
      /// for (int i=0; i<months.size(); i++){
        //   if (months.get(i).getText().trim().equals("July"))
          //     months.get(i).click();
      // }
//driver.findElement(By.cssSelector("div[id=':0']")).click();
//driver.findElement(By.xpath("//div[text()='August']")).click();
driver.findElement(By.xpath(".//*[@id='BirthDay']")).sendKeys("20");
driver.findElement(By.xpath(".//*[@id='BirthYear']")).sendKeys("1990");
driver.findElement(By.xpath(".//*[@id='Gender']/div[@role='listbox']")).sendKeys("Male");

//driver.findElement(By.xpath(".//*[@id='Gender']/div[1]/div[2]")).click();
//driver.findElement(By.xpath(".//*[@id='Gender']/div[1]/div[2]")).click();
driver.findElement(By.id("RecoveryPhoneNumber")).sendKeys("9492055182");
driver.findElement(By.id("RecoveryEmailAddress")).sendKeys("chaitukommineni25@gmail.com");
//driver.findElement(By.xpath("//form[@id='createaccount']/div[8]/span[@id='errormsg_0_RecoveryEmailAddress']")).sendKeys("chaitukommineni25@gmail.com");

//driver.findElement(By.xpath(".//*[@id='Gender']/div[@role='listbox']")).sendKeys("Male");
driver.findElement(By.xpath("//div[@id='CountryCode']/div")).sendKeys("AmericanSamoa");
//driver.findElement(By.xpath("//form[@id='createaccount']/input[9]")).click();
driver.findElement(By.xpath("//input[@id='submitbutton']")).click();

}

}
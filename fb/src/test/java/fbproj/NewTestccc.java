package fbproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class NewTestccc {
@Test
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.id("email")).sendKeys("rdsdf");
		
		driver.findElement(By.id("pass")).sendKeys("354356");
		
		driver.findElement(By.id("loginbutton")).click();
	}
	
  
}

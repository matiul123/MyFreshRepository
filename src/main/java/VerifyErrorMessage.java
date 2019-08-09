//import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyErrorMessage {
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver =new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	WebElement nxt_btn=driver.findElement(By.xpath("//*[@class='ZFr60d CeoRYc']"));	
	nxt_btn.click();	
		
	}

}

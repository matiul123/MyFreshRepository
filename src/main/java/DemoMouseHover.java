import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoMouseHover {

	
	@Test
	public void mouseHover() {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("http://schwab.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele=driver.findElement(By.xpath("//*[@aria-label='What We Charge']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		WebElement ele1=driver.findElement(By.xpath("//*[@id='Pricing'])]"));
		ele1.click();
		
		
}

}
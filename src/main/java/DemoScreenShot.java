import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoScreenShot {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("http://www.spicejet.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 WebElement ele=driver.findElement(By.xpath( "//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));
		 ele.click();
	
		 DemoScreenShot1.screen(driver,"bd");
		 //TakesScreenshot ts= (TakesScreenshot)driver;
		//File source=ts.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(source, new File(c));
	}

}

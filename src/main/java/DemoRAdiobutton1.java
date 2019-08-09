import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoRAdiobutton1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.get("http://www.spicejet.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 WebElement ele=driver.findElement(By.xpath( "//input[@id='ctl00_mainContent_rbtnl_Trip_1']"));		
		// driver.findElement(By.xpath( "//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).isEnabled();
		 ele.click();
		boolean d=ele.isEnabled();
		System.out.println(d);
	}

}

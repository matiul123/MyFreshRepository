import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleRAdioButton {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://www.facebook.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 List<WebElement> radio=driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
		 
		 for(int i=0;i<radio.size();i++)
		 {
			 WebElement local_radio=radio.get(i);
			 String value=local_radio.getAttribute("value");
			 System.out.println("Value from radio buttons are:" +value);
			 
			 if(value.equalsIgnoreCase("Ruby"))
			 {
				 local_radio.click();
				 
			 }
			 
		 }
	}

}

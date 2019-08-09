import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCheckBox1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://www.spicejet.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		// WebElement ele=driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[12]/div[2]/input[1]")).click();
		//ele.click();
		 //boolean d=ele.isSelected();
		 //System.out.println(d);
	}

}

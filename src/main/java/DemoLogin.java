import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DemoLogin {

	
	//public void Test1() {
	public static void main(String[] args) {
	 //WebDriverManager.chromedriver();
		 
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://www.facebook.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
	
	}

}

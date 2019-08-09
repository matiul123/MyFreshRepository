import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoVerifyTitle {
	
	
	@Test
	public void verifyApplicationTitles(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String myTitle=driver.getTitle();
		System.out.println("My Title is:" +myTitle);
		String expected_title="Facebook - Log In or Sign Up";
		//Assert.assertEquals(myTitle,expected_title,"Title is failed");
		Assert.assertTrue(myTitle.contains( "Log In or Sign Up"));
		System.out.println("Test is completed");
		
	}

}

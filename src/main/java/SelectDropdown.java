import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */

/**
 * @author Matiul
 * DropDownList which is Combo
 * SelectedBy index
 * SelectedBy value
 * SelectesBy visible
 *
 *
 */
public class SelectDropdown {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 
				//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				 driver.get("http://www.facebook.com");
				 driver.manage().window().maximize();
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
				
				 WebElement month_dropdown=driver.findElement(By.id("month"));
				 Select month_dd=new Select(month_dropdown);
			
				 WebElement selected_value=month_dd.getFirstSelectedOption();
				 System.out.println("Before Selection selected values is:" +selected_value.getText());
				 
				 
				 month_dd.selectByIndex(3);
				 
				// Thread.sleep(3000);
				 //month_dd.selectByValue("10");
				 
				// month_dd.selectByVisibleText("Aug");

List<WebElement> month_list=month_dd.getOptions();
 System.out.println(month_list.size());
 
 for(WebElement x:month_list)
 {String month_name=x.getText();
 System.out.println("Months are:"+month_name);
 }
				 
	}

}

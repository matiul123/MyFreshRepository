import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class DemoScreenShot1 {
	
	public static void screen(WebDriver driver, String c) throws IOException
	{ // string only to be used for memory that will be used by particular screenshot
		TakesScreenshot tkss= (TakesScreenshot) driver;// this is take screenshot interface 
		File f1= tkss.getScreenshotAs(OutputType.FILE);// this is get screenshotas method , File is a java interface
		FileUtils.copyFile(f1, new File("./ScreenShot/"+c+".png"));

System.out.println("Screenshot taken");
}
}

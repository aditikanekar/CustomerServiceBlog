package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonPage {
	
	WebDriver driver;
	
	public static void takeScreenshots(WebDriver driver,String nameOfScreenshot) throws Exception{

	

	        TakesScreenshot ts = (TakesScreenshot)driver;   
	        File srcFIle = ts.getScreenshotAs(OutputType.FILE);  

	        try {

	        FileUtils.copyFile(srcFIle, new File("./Screenshots/"+nameOfScreenshot));

	        } catch (IOException e) {

	          e.printStackTrace();

	        }
		}
    }



package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CustomerServicePage {
	WebDriver driver;
 
    By blog= By.xpath("//a[@href='/blog']");
  
    //By customerService= By.xpath("//*[text()='Customer service']");
    
    public CustomerServicePage(WebDriver driver){

        this.driver = driver;

    }
    public CustomerServicePage() {
		// TODO Auto-generated constructor stub
	}
    
	public void scrollToCustomerServiceLink(WebDriver driver) {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	WebElement customerService = driver.findElement(By.xpath("//*[text()='Customer service']"));
    	js.executeScript("arguments[0].scrollIntoView(true);", customerService);
    	Assert.assertTrue(((WebElement) customerService).isDisplayed());
    }
	public void clickBlog(WebDriver driver) {
		driver.findElement(blog).click();
	}
}

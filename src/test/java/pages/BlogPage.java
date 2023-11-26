package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class BlogPage {
	WebDriver driver;
	By blogArchive= By.xpath("//*[text()=\"Blog archive\"]");
  
	public BlogPage(WebDriver driver){

        this.driver = driver;

    }
	
	public BlogPage() {
		// TODO Auto-generated constructor stub
	}

	public void verifyUrl(WebDriver driver) {
		System.out.println("the url is: "+driver.getCurrentUrl());
        Assert.assertEquals("https://demowebshop.tricentis.com/blog", driver.getCurrentUrl());
        
	}
	
	public void verifyBlogContent(WebDriver driver) {
		 Assert.assertTrue(driver.findElement((By) blogArchive).isDisplayed());
	        
	}
	
}

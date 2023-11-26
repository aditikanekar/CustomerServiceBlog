package com.customerServiceTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BlogPage;
import pages.CommonPage;
import pages.CustomerServicePage;

public class CustomerServiceBlogTest {
	  WebDriver driver;
	  CommonPage commonPage=new CommonPage();
      
		 @BeforeTest
		    public void testBrowser() {
		       WebDriverManager.chromedriver().setup();
		        driver = new ChromeDriver();   
		        driver.manage().window().maximize();
		        driver.get("https://demowebshop.tricentis.com");
		        String title = driver.getTitle();
		        System.out.println(title);      
		          
		    }

		 @Test
		 public void test() throws Exception {
			 CustomerServicePage cusService=new CustomerServicePage();
			 cusService.scrollToCustomerServiceLink(driver);
			 CommonPage.takeScreenshots(driver, "Screenshot"+Math.random()+".jpg");
			 cusService.clickBlog(driver);
			 BlogPage blogpage=new BlogPage();
			 blogpage.verifyUrl(driver);
			 blogpage.verifyBlogContent(driver);
			 CommonPage.takeScreenshots(driver, "Screenshot"+Math.random()+".jpg");
				
		 }
		 
		 @AfterTest
		 public void closeTest() {
			 driver.quit();  
		 }

}

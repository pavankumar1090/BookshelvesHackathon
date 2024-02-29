package com.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Factory.Baseclass;

public class Urbanladderr extends Basepage{
	
static WebDriver driver = Baseclass.getDriver();
	
	public Urbanladderr(WebDriver driver)
	{
		super(driver);
	}
    
	@FindBy(xpath="//input[@id='search']")
	WebElement search;
	
	@FindBy(xpath="//button[@id='search_button']")
	WebElement button;
	
	
	//Actionmethods
    //Home page verification
     public void main_title_verify() throws InterruptedException
     {
    	 Thread.sleep(5000);
    	 String title=driver.getTitle();
       	 System.out.println(title);
       	 Assert.assertEquals("Buy Furniture Online and Get up to 50% Off | Shop Now - Urban Ladder",driver.getTitle());
     }
     
     //search bookshelves in searchbox
     public void search_Bookshelves()
     {
    	 boolean key=search.isEnabled();
    	 System.out.println("is searchbox is enabled ?"+key);
    	 search.sendKeys("BookShelves");
    	 button.click();
    	 
     }
     
     //title verify of home
     public void Bookshelves_title()
     {
    	 String title_Bookshelves=driver.getTitle();
       	 System.out.println(title_Bookshelves);
       	 Assert.assertEquals("Buy Furniture Online and Get up to 50% Off | Shop Now - Urban Ladder",driver.getTitle());
     }
     
     //firstpage(regression method)
     public void search_Bookshelevs_reg()
     {
    	 search.sendKeys("BookShelves");
    	 button.click();
     }
     
}

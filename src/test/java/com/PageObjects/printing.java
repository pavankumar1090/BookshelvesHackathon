package com.PageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.Baseclass;
import utilies.Excelsheet;
//import utilities.Excel;

public class printing extends Basepage {
//	printing ps=new printing();
	
	
	static String file = System.getProperty("user.dir")+"\\src\\test\\resources\\Excel\\urbanladder.xlsx";

	//public static WebDriver driver = Baseclass.getDriver();
	

	// WebDriver driver;

	public printing(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[@class='close-reveal-modal hide-mobile']")
	WebElement popup;

	@FindBy(xpath = "//div[contains(text(),'Category')]")
	WebElement category;

	@FindBy(xpath = "(//label[contains(text(),'Bookshelves')])[1]")
	WebElement Bookshelves;
	@FindBy(xpath="//label[contains(text(),'Kids Bookshelves')]")
	WebElement KidsBookshelves;

	@FindBy(xpath = "(//li[@class='item'])[2]")
	WebElement price;

	@FindBy(xpath = "//*[@class='noUi-handle noUi-handle-upper']")
	WebElement slider_right;

	@FindBy(id = "filters_availability_In_Stock_Only")
	WebElement exclude;

	@FindBy(xpath = "//span[contains(text(),'Recommended')]")
	WebElement recomend;

	@FindBy(xpath = "//li[contains(text(),'Price: High to Low')]")
	WebElement High_low;

	By print_names = By.xpath("//span[@class='name']");

	By print_price = By.xpath("//div[@class='price-number']//span");

	@FindBy(xpath = "(//span[@class='topnav_itemname'])[3]")
	WebElement living;

	By elements_1 = By.xpath("(//*[@id='topnav_wrapper']/ul/li[3]/div/div/ul/li[3]/ul/li/a/span)");

	By elements_2 = By.xpath("(//*[@id='topnav_wrapper']/ul/li[3]/div/div/ul/li[1]/ul/li/a/span)");
	
	

	// Action methods

	//Bookshelves page elements validation 
	public void specifications() throws InterruptedException, IOException {
		popup.click();
		
		Thread.sleep(5000);
		boolean category_check=category.isEnabled();
   	    System.out.println("is category  enabled ?"+category_check);
		category.click();
	
		KidsBookshelves.click();
//		Thread.sleep(5000);
		boolean category_drpdn_check=KidsBookshelves.isEnabled();
   	    System.out.println("is kidsBookshelves enabled ?"+category_drpdn_check);
		
   	    Thread.sleep(5000);
		boolean price_check=category.isEnabled();
   	    System.out.println("is price  is enabled ?"+price_check);
		price.click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider_right, -211, 0).perform();
		
		Thread.sleep(5000);
		boolean exclude_check=category.isEnabled();
   	    System.out.println("is exclude is enabled ?"+exclude_check);
		exclude.click();
		
		boolean Recomend_check=recomend.isEnabled();
   	    System.out.println("is recomend is enabled ?"+Recomend_check);
		recomend.click();
		boolean Recomend_drpdn_check=KidsBookshelves.isEnabled();
   	    System.out.println("is drop down element  enabled ?"+Recomend_drpdn_check);
		High_low.click();
		Thread.sleep(5000);
	}
		
	//printing top3 elements
		public void printing() throws IOException
		{
			//int col=1;
		for (int i = 0; i<=2; i++) {
			String aa = driver.findElements(print_names).get(i).getText();
			String bb = driver.findElements(print_price).get(i).getText();
			System.out.println(aa + "---------" + bb);
			Excelsheet.setCellData(file,"Print Top three Items",i+1,0,aa);
			Excelsheet.setCellData(file,"Print Top three Items",i+1,1,bb);
			//col+=1;
		}

	}
     
		//dropdown validation and click
	public void drpdn_click()
	{
		boolean Living_check=living.isEnabled();
   	    System.out.println("is Living is enabled ?"+Living_check);
		living.click();
	}
	
	//print dropdown elements
	public void print_drpdnelements() throws InterruptedException, IOException {
		
		List<WebElement> e2 = driver.findElements(elements_2);
		System.out.println(e2.size());
		for (int j = 0; j<e2.size(); j++) {
			String cccc = driver.findElements(elements_2).get(j).getText();
			System.out.println(cccc);
			Excelsheet.setCellData(file,"Print Dropdown Elements",j+1,0,cccc);
		}
	}
	
	
	//Bookshelevs page for regression methods
	public void specifications_reg() throws InterruptedException
	{
		Thread.sleep(10000);
		popup.click();
        category.click();
		KidsBookshelves.click();
		Thread.sleep(5000);
		price.click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(slider_right, -211, 0).perform();
		exclude.click();
		recomend.click();
		High_low.click();
		Thread.sleep(5000);
		
	}
	
	
	//dropdown elements print for regression methods
	public void drp_dn_reg() throws InterruptedException, IOException {
		living.click();
		print_drpdnelements();
		
	}
}

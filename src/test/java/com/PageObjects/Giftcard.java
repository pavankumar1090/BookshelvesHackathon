package com.PageObjects;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Factory.Baseclass;
import utilies.Excelsheet;

 
public class Giftcard extends Basepage {
	
///	WebDriver driver;
	static String file = System.getProperty("user.dir")+"\\src\\test\\resources\\Excel\\urbanladder.xlsx";
	static WebDriver driver = Baseclass.getDriver();
    public static String Input0,Input1,Input2,Input3,Input4,Input5,Input6,Input7,Input8,Input9;
    JavascriptExecutor js= (JavascriptExecutor)driver;
	
	
	public Giftcard(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="(//a[contains(text(),'Gift Cards')])[1]")
	WebElement giftcard;
	
    By moveto_element=By.xpath("(//p[@class='ByxHM'])[3]");
	
	@FindBy(xpath="(//button[@class='_1fVSi action-button _1njbS _1XfDi _3J6Eb'])[3]")
	WebElement choose_Birthday_;
	By choose_Birthday=By.xpath("(//button[@class='_1fVSi action-button _1njbS _1XfDi _3J6Eb'])[3]");
	
	@FindBy(xpath="//h3[contains(text(),'Birthday/Anniversary')]")
	WebElement chose_Birthday;
	
	@FindBy(xpath="//li[@class='_11b4v'][3]")
	WebElement choose_any;
	
	@FindBy(xpath="//select[@class='Upz18 _1hLiD UJU2v'][1]")
	WebElement choose_calender;
	
	@FindBy(xpath="//option[@class='_3YLWF'][4]")
	WebElement choose_month;
	
	@FindBy(xpath="//select[@class='Upz18 _1hLiD UJU2v'][2]")
	WebElement choose_date;
	
	@FindBy(xpath="//option[@value='5']")
	WebElement date_click;
	
	@FindBy(xpath="//button[@class='_1IFIb _1fVSi action-button _1gIUf _1XfDi']")
	WebElement next_click;
	
	//to elements
	
	@FindBy(name="recipient_name")
	WebElement recipient_name;
	
	@FindBy(name="recipient_email")
	WebElement recipient_email;
	
	@FindBy(name="recipient_mobile_number")
	WebElement recipient_mobile_number;
	
	//From elements
	
	@FindBy(name="customer_name")
	WebElement customer_name;
	
	@FindBy(name="customer_email")
	WebElement customer_email;
	
	@FindBy(name="customer_mobile_number")
	WebElement customer_mobile_number;
	
	@FindBy(name="customer_address")
	WebElement customer_address;
	
	@FindBy(name="zip")
	WebElement zip;
	
	@FindBy(xpath="//button[@class='_3Hxyv _1fVSi action-button _1gIUf _1XfDi']")
	WebElement confirm;
	
	@FindBy(xpath="//input[@id='ip_137656023']")
	WebElement invalid2;
	By invalid=	By.xpath("//input[@id='ip_137656023']");
	
	@FindBy(xpath="(//div[@class='dL47V'])[1]/div[1]")
	WebElement verify_todetails_name;
	
	@FindBy(xpath="(//div[@class='dL47V'])[1]/div[2]")
	WebElement verify_todetails_email;
	
	@FindBy(xpath="(//div[@class='dL47V'])[1]/div[3]")
	WebElement verify_todetails_mobile;
	
	@FindBy(xpath="(//*[@class='dL47V']//div)[4]")
	WebElement verify_Fromdetails_name;
	
	@FindBy(xpath="(//*[@class='dL47V']//div)[5]") WebElement verify_Fromdetails_email;
	@FindBy(xpath="(//*[@class='dL47V']//div)[6]") WebElement verify_Fromdetails_phone;
	
	@FindBy(xpath="(//*[@class='dL47V']//div)[7]") WebElement verify_Fromdetails_address;
	@FindBy(xpath="(//*[@class='dL47V']//div)[8]") WebElement verify_Fromdetails_pincode;
	
	@FindBy(xpath="//*[@id='ip_2251506436']")WebElement enter_amount;
	By enter_amount1=By.xpath("//*[@id='ip_2251506436']");
	
	@FindBy(xpath="//*[@class='_1yQxr']")WebElement return_home;
	
	
	
	
    //Validation of Giftcard icon
	public void giftcard_icon_click() {
		//Giftcard-click
		boolean Giftcard_check=giftcard.isEnabled();
   	    System.out.println("is giftcard icon is enabled ?"+Giftcard_check);
	}
	
	//Giftcard click
	public void giftcard_click() {
		giftcard.click();
	}
	
	
	//Giftcard title verification
		public void giftcard_title() 
		{
		 String title2=driver.getTitle();
    	 System.out.println(title2);
    	 Assert.assertEquals("Gift Card - Buy Gift Cards & Vouchers Online for Wedding, Birthday | Urban Ladder",title2);
	}
	
		//Birthday/Anniversary element validation
	public void Choose_giftcard() throws InterruptedException {
		//Wedding-click
		Thread.sleep(10000);
		js.executeScript("arguments[0].scrollIntoView();",choose_any);
		Actions act=new Actions(driver);
		act.moveToElement(choose_any).build().perform();
		boolean birthday_check=choose_any.isEnabled();
   	    System.out.println("is Birthday/Anniversary is enabled ?"+birthday_check);
   	    choose_any.click();

	}
	
	//Customize the giftcard elements validation
	public void customize_giftcard() throws IOException
	{
	    
	  //select price
		boolean amount=enter_amount.isEnabled();
   	    System.out.println("is amount_text is enabled ?"+amount);
   	    
	}
	
	//Customize the lucky person elements validation
	public void customize_luckyperson()
	{
		
	boolean receip_name=recipient_name.isEnabled();
   	    System.out.println("is recipient_name is enabled ?"+receip_name);
   	    
   	 boolean receip_email=recipient_email.isEnabled();
	    System.out.println("is recipient_email is enabled ?"+receip_email);
	    
	 boolean receip_mn=recipient_mobile_number.isEnabled();
   	    System.out.println("is recipient_mobile_number is enabled ?"+receip_mn);
   	    
   	 boolean cust_name=customer_name.isEnabled();
	    System.out.println("is customer_name is enabled ?"+cust_name);
	    
	    boolean cust_email=customer_email.isEnabled();
   	    System.out.println("is customer_email is enabled ?"+cust_email);
   	    
         boolean cust_mnname=customer_mobile_number.isEnabled();
	    System.out.println("is customer_mobile_number is enabled ?"+cust_mnname);
	    
	  boolean cust_address=customer_address.isEnabled();
   	    System.out.println("is customer_address is enabled ?"+cust_address);
   	    
   	   boolean pincode=zip.isEnabled();
   	System.out.println("is pincode is enabled ?"+pincode);
   	
	}

	//customize the giftcard
     public void customize_gift() throws IOException, InterruptedException
     {
    	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
         wait.until(ExpectedConditions.visibilityOfElementLocated(enter_amount1));
         js.executeScript("arguments[0].click();",driver.findElement(enter_amount1));
		String Input0 = Excelsheet.getCellData(file,"Lucky Person Form ",10,0);
		enter_amount.sendKeys(Input0);
		this.Input0=Input0;
	    
	  //calender-select
		choose_calender.click();
		
		//month-select
		choose_month.click();
		
		
		//date-dropdown
		choose_date.click();
		
		
		//date-click
		date_click.click();
		
		
		//next
		boolean next=next_click.isEnabled();
        System.out.println("is next_element is enabled ?"+next);
		next_click.click();
	}

	
     //customize lucky person form 
	public  void luckyform() throws IOException, InterruptedException {
		
		String Input1 = Excelsheet.getCellData(file,"Lucky Person Form ",1,0);
		recipient_name.sendKeys(Input1);
		this.Input1=Input1;
		
		//enter receipientsname
		
		
		//enter receipientsemail
		String Input2 = Excelsheet.getCellData(file,"Lucky Person Form ",2,0);
		recipient_email.sendKeys(Input2);
		this.Input2=Input2;
		
		
		
		//enter receipients(mn)
		String Input3 = Excelsheet.getCellData(file,"Lucky Person Form ",3,0);
		recipient_mobile_number.sendKeys(Input3);
		this.Input3=Input3;
		
		
		//enter customer_name
		String Input4 = Excelsheet.getCellData(file,"Lucky Person Form ",4,0);
		customer_name.sendKeys(Input4);
		this.Input4=Input4;
		
		
		//enter customer_email
		String Input5 = Excelsheet.getCellData(file,"Lucky Person Form ",5,0);
		customer_email.sendKeys(Input5);
		this.Input5=Input5;
		
		
		//enter customer(Mn)
		String Input6 = Excelsheet.getCellData(file,"Lucky Person Form ",6,0);
		customer_mobile_number.sendKeys(Input6);
		this.Input6=Input6;
	     
	     //enter adress
		String Input7 = Excelsheet.getCellData(file,"Lucky Person Form ",7,0);
		customer_address.sendKeys(Input7);
		this.Input7=Input7;
		
		
		//enter zip
		String Input8 = Excelsheet.getCellData(file,"Lucky Person Form ",8,0);
		zip.sendKeys(Input8);
		this.Input8=Input8;
		
		Thread.sleep(5000);
		boolean confirm_check=confirm.isEnabled();
	   	  System.out.println("is confirm box enabled?"+confirm_check);
		//confirm click
	    confirm.click();
	    Thread.sleep(5000);
	}
	
	//print invalid message
	public void print_invalid_email() throws InterruptedException, IOException
	{
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String ss=invalid2.getAttribute("validationMessage");
	     System.out.println("error message:"+ss);
	}
	
	//take scrren shot of error message
	public void screenshot1() throws IOException, HeadlessException, AWTException {
		BufferedImage img1=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(img1, "png", new File(System.getProperty("user.dir")+"\\src\\test\\java\\Screenshot\\errormsg1.png"));
	}
	
	//enter valid email
	public void valid_email() throws IOException, InterruptedException
	{
		Thread.sleep(10000);
		recipient_email.clear();
		String Input9 = Excelsheet.getCellData(file,"Lucky Person Form ",9,0);
		recipient_email.sendKeys(Input9);
		this.Input9=Input9;
		
	     confirm.click();
	     Thread.sleep(5000);
	     
	}
	
	//validation of confirm details page
	public void verify_details() throws IOException
	{
		
		String enter_amounts=enter_amount.getAttribute("value");
		String enter_date=date_click.getAttribute("value");
	
		String ss=verify_todetails_name.getText();
		String vv=verify_todetails_email.getText();
		String pp=verify_todetails_mobile.getText();
		String qq=verify_Fromdetails_name.getText();
		String yy=verify_Fromdetails_email.getText();
		String zz=verify_Fromdetails_phone.getText();
		String ll=verify_Fromdetails_address.getText();
		String bal=verify_Fromdetails_pincode.getText();
		 bal=bal.replace("," ,"");
		 bal=bal.replace("Chennai" ,"");
		 bal=bal.replace(" ","");
		Assert.assertEquals(Input0,enter_amounts);
		Assert.assertEquals("5", enter_date);
		Assert.assertEquals(Input1,ss);
		Assert.assertEquals(Input9,vv);
		Assert.assertEquals(Input3,pp);
		Assert.assertEquals(Input4,qq);
		Assert.assertEquals(Input5,yy);
		Assert.assertEquals(Input6,zz);
		Assert.assertEquals(Input7,ll);
		Assert.assertEquals(Input8,bal);
	}
	
	//screenshot of confirm details page
	public void screenshot2() throws IOException, HeadlessException, AWTException {
		BufferedImage img2=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		ImageIO.write(img2, "png", new File(System.getProperty("user.dir")+"\\src\\test\\java\\Screenshot\\Confirmpage.png"));
	    
	}
	
	//combining method and function(for regression)
	public void customize_giftcard_prerequisit() throws InterruptedException, IOException
	{
		giftcard.click();
		Choose_giftcard();
	}
	
	//return to homepage
	public void return_homepage() {
		return_home.click();
	}
		
	}
		

	

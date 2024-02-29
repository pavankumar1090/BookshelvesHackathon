package com.StepDefinations;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;

import com.PageObjects.Giftcard;
import com.PageObjects.printing;

import Factory.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Giftcardpage {
	
 Giftcard gf=new Giftcard(Baseclass.getDriver());
 printing ps=new printing(Baseclass.getDriver());

	//smoke
 @Given("User is on the Giftcar site")
 public void user_is_on_the_giftcar_site() {
     
 }
	
 //smoke
	@When("Giftcard icon is enabled")
	public void giftcard_icon_is_enabled() {
		gf.giftcard_icon_click();
	}
	
	//smoke
	@Given("User is on the Giftcard site")
	public void  User_is_on_the_Giftcard_site() {
		
	}
//
//		@Given("User is on the Giftcard site")
//		public void user_is_on_the_giftcard_site() {
//		    // Write code here that turns the phrase above into concrete actions
//		    throw new io.cucumber.java.PendingException();
//		}



	//smoke
	@When("user clicks on the Giftcard option")
	public void user_clicks_on_the_giftcard_option() {
	     gf.giftcard_click();
	     gf.giftcard_title();
	}
	
	//smoke
	@Then("Birthday\\/Annivarsary is available")
	public void birthday_annivarsary_is_available() throws InterruptedException {
	    gf.Choose_giftcard();
	}
	
	//smoke
	@Given("user is on the Giftcard site")
	public void user_is_on_the_Giftcard_site() {
		
	    
	}
	
	
	//smoke
	@When("Checks wether Amount text box is enabled")
	public void checks_wether_amount_text_box_is_enabled() throws IOException {
	    gf.customize_giftcard();
	   
	}
	
	//smoke
	@Then("checks all textboxes are enabled")
	public void checks_all_textboxes_are_enabled() {
	   gf.customize_luckyperson();
	}
	
//	@Then("user customizes the luckypersonform")
//	public void user_customizes_the_luckypersonform() throws IOException, InterruptedException {
//		gf.luckyform();
//	}
//	
//	@Then("user prints error message")
//	public void user_prints_error_message() throws InterruptedException, IOException {
//	    gf.print_invalid_email();
//	}
	
//	@Then("user takes Scrrenshot")
//	public void user_takes_scrrenshot() throws HeadlessException, IOException, AWTException {
//		gf.screenshot1();
//	}
	
//	@Then("user provides valid input")
//	public void user_provides_valid_input() throws IOException, InterruptedException {
//		gf.valid_email();
//	}
	
//	@Given("user is on confirm details page")
//	public void user_is_on_confirm_details_page() {
//	    
//	}
//	
//	@Then("user validates the confirm details page")
//	public void user_validates_the_confirm_details_page() throws IOException {
//		gf.verify_details();
//		
//	}
	
//	@Then("user takes screenshot of Confirm details page")
//	public void user_takes_screenshot_of_confirm_details_page() throws HeadlessException, IOException, AWTException {
//	    gf.screenshot2();
//	}
	
	//regression
	@Given("user is on the customize Giftcard page")
	public void user_is_on_the_customize_giftcard_page() throws InterruptedException, IOException {
		 gf.customize_giftcard_prerequisit();
	    }
	    
	 //regression
	    
	    @Then("user customize the gift card")
	    public void user_customize_the_gift_card()throws IOException, InterruptedException {
//	    	gf.customize_giftcard();
        	gf.customize_gift();
	    }
	    
	    
	  //regression
	    @Then("user customizes the luckypersonform")
	    public void user_customizes_the_luckypersonform()throws IOException, InterruptedException {
	    	gf.luckyform();
	    }
	    
	    //regression
	    @Then("user prints error message")
	    public void user_prints_error_message()  throws InterruptedException, IOException {
	        gf.print_invalid_email();
	    }
	    
	    
	    //regression
	    @Then("user takes Scrrenshot")
	    public void user_takes_scrrenshot() throws HeadlessException, IOException, AWTException {
	        gf.screenshot1();
	    }
	    
	    
	    @Then("user provides valid input")
	    public void user_provides_valid_input()  throws IOException, InterruptedException {
	    	gf.valid_email();
	    }
	    
	    //regression
	    @Given("user is on confirm details page")
	    public void user_is_on_confirm_details_page() {
	      
	    }
	    
	    //regression
	    @Then("user validates the confirm details page")
	    public void user_validates_the_confirm_details_page() throws IOException {
	    	gf.verify_details();
	    }
	    
	    //regression
	    @Then("user takes screenshot of Confirm details page")
	    public void user_takes_screenshot_of_confirm_details_page() throws HeadlessException, IOException, AWTException {
	    	gf.screenshot2();
	    }
	    
       @Given("User is on the Bookshelves page")
      public void  User_is_on_the_Bookshelves_page() throws InterruptedException
      {
	          Thread.sleep(5000);
      }

     @When ("User clicks on the Giftcard option")
      public void User_clicks_on_the_Giftcard_option()
      {
	    gf.giftcard_click();
      }

     @And ("User Choose BirthdayAnniversay occasion")
     public void User_Choose_BirthdayAnniversay_occasion() throws InterruptedException
      {
	     gf.Choose_giftcard();
      }
 
     @Then("User customise the Giftcard")
    public void user_customise_the_giftcard()  throws IOException, InterruptedException
    {
	gf.customize_giftcard();
	gf.customize_gift();
    }
//end to end
@Then("User fills the lucky person form")
public void user_fills_the_lucky_person_form()  throws IOException, InterruptedException
{
	gf.customize_luckyperson();
	gf.luckyform();
}

//end to end
@Then("User prints the Invalid message")
public void user_prints_the_invalid_message() throws InterruptedException, IOException, HeadlessException, AWTException
{
	gf.print_invalid_email();
	gf.screenshot1();
}

//end to end
@Then("User Enter valid email")
public void user_enter_valid_email() throws IOException, InterruptedException
{
	gf.valid_email();
}

@Then("User  validates the Confirm details")
public void user_validates_the_confirm_details() throws IOException, InterruptedException, HeadlessException, AWTException
{
	gf.verify_details();
	gf.screenshot2();
}
	

@Then("User return to Homepage")
public void user_return_to_homepage() {
	gf.return_homepage();
}

@Then("navigate to homepage")
public void navigate_to_homepage() {
    gf.return_homepage();
}
}


package com.StepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.PageObjects.printing;
import com.PageObjects.Urbanladderr;

import Factory.Baseclass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage {
	Urbanladderr ul=new Urbanladderr (Baseclass.getDriver());
	printing bs=new  printing(Baseclass.getDriver());

	static WebDriver driver = Baseclass.getDriver();

	//smoke
	@Given("User is on the UrbanLadder site")
	public void user_is_on_the_urban_ladder_site() throws InterruptedException {
		ul.main_title_verify();
	}
		
	//smoke
	@When("checks wether search box is enabled")
	public void checks_wether_search_box_is_enabled() {
		ul.search_Bookshelves();
	}
	
	//smoke
	@Then("checks weather page navigates to Bookshelves")
	public void checks_weather_page_navigates_to_bookshelves() {
		ul.Bookshelves_title();
	}
	
	//regression
	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
	    ul.search_Bookshelevs_reg();
	}
	
	//end to end
	@Given("User is on the urbanLadder site")
	public void User_is_on_the_urban_ladder_site() throws InterruptedException {
		ul.main_title_verify();
		
	}

	@When("User provides input in searchbox field\\(Input: {string})")
	public void user_provides_input_in_searchbox_field_Input(String string) {
		Urbanladderr ul = new Urbanladderr(Baseclass.getDriver());
	    // Write code here that turns the phrase above into concrete actions
		  ul.search_Bookshelves();
	}
	
	//end to end
	@When("User selects the preferred options")
	public void user_selects_the_preferred_options() throws InterruptedException 
		{
		  // Write code here that turns the phrase above into concrete actions
		}
	
	//end to end
	@Then("User Prints top Three items")
	public void user_prints_top_three_items() throws InterruptedException, IOException {
		    // Write code here that turns the phrase above into concrete actions
		bs.specifications();
		bs.printing();
		}
 
	}
	
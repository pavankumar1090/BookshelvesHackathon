package com.StepDefinations;

import com.PageObjects.printing;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.PageObjects.Giftcard;
import com.PageObjects.Urbanladderr;
import com.github.dockerjava.api.model.Driver;

import Factory.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Bookshelfpage {
	
	printing bs=new printing(Baseclass.getDriver());
	Urbanladderr ul=new Urbanladderr(Baseclass.getDriver());
	 printing ps=new printing(Baseclass.getDriver());
	WebDriver driver;
	
	
	//smoke
	@Given("User is on the Bookshelvess site")
	public void user_is_on_the_bookshelvess_site() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	//smoke
	@Then("checks specifications availability")
	public void checks_specifications_availability() throws InterruptedException, IOException {
		bs.specifications();
	}
	

	@When("User clicks on Living Title on header menu")
	public void user_clicks_on_living_title_on_header_menu() {
	    // Write code here that turns the phrase above into concrete actions
		bs.drpdn_click();
	}
	
	@Then("User Prints the sub menu items of Seating & Chairs")
	public void user_prints_the_sub_menu_items_of_seating_chairs() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
	    bs.print_drpdnelements();
	}
	
	
	//smoke
	@Given("User is on the Bookshelves site")
	public void User_is_on_the_Bookshelves_site() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	 Thread.sleep(5000);
	}
	
	//smoke
	@When("Living is enabled")
	public void living_is_enabled() {
		bs.drpdn_click();
	
   }
	
	//regression
	@When("User gives required specifications")
	public void user_gives_required_specifications() throws InterruptedException {
	    ps.specifications_reg();
	}
	
	//regression
	@Then("User prints top three elements")
	public void user_prints_top_three_elements() throws IOException {
	    ps.printing();
	}
	
	//regression
	@Then("user prints elements under Seating&Chair")
	public void user_prints_elements_under_seating_chair() throws InterruptedException, IOException {
	    
		ps.drp_dn_reg();
	}
	
}
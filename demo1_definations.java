package bdcstepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demo1_definations {
	@Given("user launched demo webshop app in chrome browser")
	public void user_launched_demo_webshop_app_in_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user launches the demo");
	}

	@Then("user searches for the item of his choice")
	public void user_searches_for_the_item_of_his_choice() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("user searches for the item of his choice");
	}

	@Then("adds the item to the cart")
	public void adds_the_item_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("user adds the item to the cart");
	}

	@Given("user has already placed an order for his favourite item")
	public void user_has_already_placed_an_order_for_his_favourite_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user has already placed an order for his favourite item");
	}

	@Given("user tries to access the order tracking dashboard")
	public void user_tries_to_access_the_order_tracking_dashboard() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user tries to access the order tracking dashboard");
	}

	@Then("identifies the state of the order")
	public void identifies_the_state_of_the_order() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("identifies the state of the order");
	}

}

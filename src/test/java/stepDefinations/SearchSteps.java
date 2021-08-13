package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	@Given("I have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page() {
	    System.out.println("search field");
	}

	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
	    System.out.println("search product "+productName+price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String string) {
	    System.out.println("product displayed");
	}
}

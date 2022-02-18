package co.uk.zoopla.stepDefinitions;

import co.uk.zoopla.pages.BasePage;
import co.uk.zoopla.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchHousesForSaleSteps extends BasePage {
    HomePage homePage = new HomePage(driver);
    @Given("I navigate to Zoopla homepage")
    public void i_navigate_to_zoopla_homepage() throws InterruptedException {
        launchURL();
        homePage.clickAcceptCookies();

    }
//    @Given("I accept all cookies")
//    public void i_accept_all_cookies() {
//        clickAcceptCookies();

  //  }
    @When("I enter {string} in the search field")
    public void i_enter_in_the_search_field(String string) {

    }
    @When("I select {string} as minimum bed")
    public void i_select_as_minimum_bed(String string) {

    }
    @When("I select {string} as maximum bed")
    public void i_select_as_maximum_bed(String string) {

    }
    @When("I select {string} as minimum price")
    public void i_select_as_minimum_price(String string) {

    }
    @When("I select {string} as maximum price")
    public void i_select_as_maximum_price(String string) {

    }
    @When("I choose {string} as property type")
    public void i_choose_as_property_type(String string) {

    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
    }

    @Then("search result page is displayed")
    public void search_result_page_is_displayed() {

    }


}

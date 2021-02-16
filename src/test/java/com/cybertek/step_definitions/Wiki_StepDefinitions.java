package com.cybertek.step_definitions;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Wiki_StepDefinitions {

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        String url = ConfigurationReader.getProperty("wikiUrl");
        Driver.getDriver().get(url);

    }

    @When("User types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {

    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {

    }

    @Then("User sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {

    }


}
package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Library_StepDefinitions {


    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("User enters LIBRARIAN username");

        //Intentionally failing this step
        //Assert.fail("INTENTIONAL FAIL!!!!!!!");

    }

    @When("user enter librarian password")
    public void user_enter_librarian_password() {
        System.out.println("User enters LIBRARIAN password");
    }

    @Then("user should see dashboard")
    public void userShouldSeeDashboard() {
        System.out.println("User sees dashboard");
    }

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("User is on the login page.");
    }


}

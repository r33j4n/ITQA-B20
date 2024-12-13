package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import pages.Dashboard;
import pages.HomePage;

public class loginToUIApplication {
    @Steps
    HomePage home;

    @Steps
    Dashboard dashboard;

    @Given("I am on the HRM login page")
    public void i_am_on_the_login_page() {
        home.openApplication();
    }

    @When("I enter admin as username")
    public void i_enter_admin_as_username() {
        home.enterUsername();
    }

    @When("I enter admin123 as password")
    public void i_enter_admin_as_password() {
        home.enterPassword();
        home.clickLoginButton();
    }

    @Then("I should be able to login")
    public void i_should_be_able_to_login() {
        dashboard.verifyAdmin();
    }
}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

public class ApiSteps {

    private String baseUrl;
    private Response response;

    @Given("the API base URL is {string}")
    public void the_api_base_url_is(String url) {
        this.baseUrl = url;
    }

    @When("I send a GET request to {string} as {string} with password {string}")
    public void i_send_a_get_request_to_as_with_password(String endpoint, String username, String password) {
        response = SerenityRest.given()
                .auth().basic(username, password)
                .get(baseUrl + endpoint);
    }

    @Then("the response status should be {int}")
    public void the_response_status_should_be(Integer statusCode) {
        Assert.assertEquals((int) statusCode, response.getStatusCode());
    }

    @Then("the response should contain a list of books")
    public void the_response_should_contain_a_list_of_books() {
        Assert.assertTrue(response.jsonPath().getList("$").size() > 0);
    }
}
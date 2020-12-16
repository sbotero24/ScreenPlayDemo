package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.AddToThe;
import tasks.Checkout;
import tasks.LoginInto;
import ui.HomePage;

public class E2eTransactionStepDefinitions {
    @Managed(driver = "chrome")
    private WebDriver webDriver;
    private Actor actor = Actor.named("Santiago");
    private HomePage homePage;

    @Given("^that loggin into swagLabs with (.*), (.*)$")
    public void thatLogginIntoSwagLabsWithStandard_userSecret_sauce(String username, String password) {
        actor.can(BrowseTheWeb.with(webDriver));
        actor.wasAbleTo(Open.browserOn(homePage));
    actor.attemptsTo(
            LoginInto.swagLabs(username,password)
    );
    }

    @When("^I add (.*),(.*) to the cart$")
    public void iAddSauceLabsBoltTShirtToTheCart(String item1,String item2) {
    actor.attemptsTo(
            AddToThe.cart(item1,item2),
            Checkout.information()
    );

    }

    @Then("^I shold see that the purchase was successfuly$")
    public void iSholdSeeThatThePurchaseWasSuccessfuly() {

    }
}
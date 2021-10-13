package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.questions.Answer;
import co.com.choucair.certification.proyectobase.tasks.Formulario;
import co.com.choucair.certification.proyectobase.tasks.Inscribirse;
import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class UTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to register in uTest$")
    public void thanBrandonWantsToRegisterInUTest() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Formulario.onThePage());
    }

    @When("^Make registration form in Utest$")
    public void makeRegistrationFormInUtest() {
        OnStage.theActorInTheSpotlight().attemptsTo(Inscribirse.the());
    }

    @Then("^confirmation of successful registration$")
    public void confirmationOfSuccessfulRegistration() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe()));
    }
}

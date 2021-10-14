package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.UTestData;
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

import java.util.List;

public class UTestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than brandon wants to register in uTest$")
    public void thanBrandonWantsToRegisterInUTest() throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), Formulario.onThePage());
    }

    @When("^Make registration form in Utest$")
    public void makeRegistrationFormInUtest(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Inscribirse.the(uTestData.get(0).getFirtName(), uTestData.get(0).getLastName(),
                uTestData.get(0).getEmailName(),uTestData.get(0).getOptMonth(),uTestData.get(0).getOptDay(),uTestData.get(0).getOptYear(),
                uTestData.get(0).getZip(),uTestData.get(0).getPassword()));
    }

    @Then("^confirmation of successful registration$")
    public void confirmationOfSuccessfulRegistration(List<UTestData> uTestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(uTestData.get(0).getVerification())));
    }
}

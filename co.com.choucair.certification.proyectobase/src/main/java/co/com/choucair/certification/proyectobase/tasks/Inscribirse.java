package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.InscribirsePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.SelectedValue;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import org.openqa.selenium.support.ui.Select;

public class Inscribirse implements Task {
    Object a = "January";
    public static Inscribirse the() {
        return Tasks.instrumented(Inscribirse.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Jackier David").into(InscribirsePage.INPUT_FIRST_NAME),
                Enter.theValue("Buelvas Julio").into(InscribirsePage.INPUT_LAST_NAME),
                Enter.theValue("jbuelvasjulio23@gmail.com").into(InscribirsePage.INPUT_EMAIL),
                SelectFromOptions.byValue("number:1").from(InscribirsePage.OPTION_MONTH),
                SelectFromOptions.byValue("number:23").from(InscribirsePage.OPTION_DAY),
                SelectFromOptions.byValue("number:1997").from(InscribirsePage.OPTION_YEAR),
                Click.on(InscribirsePage.INPUT_LANGUAGE),
                Click.on(InscribirsePage.OPTION_LANGUAGE),
                Click.on(InscribirsePage.BUTTON_STEP),

                Enter.theValue("706010").into(InscribirsePage.INPUT_ZIP),
                Click.on(InscribirsePage.BUTTON_STEP2),

                Click.on(InscribirsePage.SELECT_DEVICE),
                Click.on(InscribirsePage.OPTION_DEVICE),
                Click.on(InscribirsePage.SELECT_MODEL),
                Click.on(InscribirsePage.OPTION_MODEL),
                Click.on(InscribirsePage.SELECT_SYSTEM),
                Click.on(InscribirsePage.OPTION_SYSTEM),
                Click.on(InscribirsePage.BUTTON_STEP3),

                Enter.theValue("123AA123aa").into(InscribirsePage.INPUT_PASSWORD),
                Enter.theValue("123AA123aa").into(InscribirsePage.INPUT_PASSWORD_CONFIRM),
                Click.on(InscribirsePage.CHECK_TERM1),
                Click.on(InscribirsePage.BUTTON_STEP4));

    }
}

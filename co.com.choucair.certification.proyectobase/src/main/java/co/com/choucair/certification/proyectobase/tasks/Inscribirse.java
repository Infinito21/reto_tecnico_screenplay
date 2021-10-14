package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.InscribirsePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Inscribirse implements Task {

    private String firtName;
    private String lastName;
    private String emailName;
    private String optMonth;
    private String optDay;
    private String optYear;
    private String zip;
    private String password;

    public Inscribirse(String firtName, String lastName, String emailName, String optMonth, String optDay, String optYear, String zip, String password) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.emailName = emailName;
        this.optMonth = optMonth;
        this.optDay = optDay;
        this.optYear = optYear;
        this.zip = zip;
        this.password = password;
    }



    public static Inscribirse the(String firtName, String lastName, String emailName, String optMonth, String optDay,
                                  String optYear, String zip, String password) {

        return Tasks.instrumented(Inscribirse.class,firtName,lastName,emailName,optMonth,optDay,optYear,zip,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(firtName).into(InscribirsePage.INPUT_FIRST_NAME),
                    Enter.theValue(lastName).into(InscribirsePage.INPUT_LAST_NAME),
                Enter.theValue(emailName).into(InscribirsePage.INPUT_EMAIL),
                SelectFromOptions.byValue(optMonth).from(InscribirsePage.OPTION_MONTH),
                SelectFromOptions.byValue(optDay).from(InscribirsePage.OPTION_DAY),
                SelectFromOptions.byValue(optYear).from(InscribirsePage.OPTION_YEAR),
                Click.on(InscribirsePage.INPUT_LANGUAGE),
                Click.on(InscribirsePage.OPTION_LANGUAGE),
                Click.on(InscribirsePage.BUTTON_STEP),

                Enter.theValue(zip).into(InscribirsePage.INPUT_ZIP),
                Click.on(InscribirsePage.BUTTON_STEP2),

                Click.on(InscribirsePage.SELECT_DEVICE),
                Click.on(InscribirsePage.OPTION_DEVICE),
                Click.on(InscribirsePage.SELECT_MODEL),
                Click.on(InscribirsePage.OPTION_MODEL),
                Click.on(InscribirsePage.SELECT_SYSTEM),
                Click.on(InscribirsePage.OPTION_SYSTEM),
                Click.on(InscribirsePage.BUTTON_STEP3),

                Enter.theValue(password).into(InscribirsePage.INPUT_PASSWORD),
                Enter.theValue(password).into(InscribirsePage.INPUT_PASSWORD_CONFIRM),
                Click.on(InscribirsePage.CHECK_TERM1),
                Click.on(InscribirsePage.BUTTON_STEP4));

    }
}

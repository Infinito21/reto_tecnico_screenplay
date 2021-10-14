package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.InscribirsePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private static String msj;

    public static Answer toThe(String verification) {
        msj = verification;
        return new Answer();
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String msjConfirm = Text.of(InscribirsePage.MSJ_CONFIRM).viewedBy(actor).asString();
        if(msj.equals(msjConfirm)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}

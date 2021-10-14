package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegisterPage {
    public static final Target REGISTRO_BUTTON = Target.the("Se dirige a la vista del formulario")
            .located(By.xpath("//li//a[contains(text(),'Join Today')]"));
}

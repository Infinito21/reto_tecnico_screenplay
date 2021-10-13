package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InscribirsePage extends PageObject {

    public static final Target INPUT_FIRST_NAME = Target.the("Ingresar nombres")
            .located(By.id("firstName"));

    public static final Target INPUT_LAST_NAME = Target.the("Ingresar apellidos")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL = Target.the("Ingresar correo")
            .located(By.id("email"));

    public static final Target OPTION_MONTH = Target.the("Seleccionar mes de nacimiento")
            .located(By.id("birthMonth"));

    public static final Target OPTION_DAY = Target.the("Seleccionar dia de nacimiento")
            .located(By.id("birthDay"));

    public static final Target OPTION_YEAR = Target.the("Seleccionar año de nacimiento")
            .located(By.id("birthYear"));

    public static final Target INPUT_LANGUAGE = Target.the("Abrir lista")
            .located(By.xpath("//div//div//div//input[@type='search']"));

    public static final Target OPTION_LANGUAGE = Target.the("Seleccionar idioma")
            .located(By.xpath("//span//div[contains(text(),'Spanish')]"));

    public static final Target BUTTON_STEP = Target.the("Siguiente paso")
            .located(By.xpath("//a//span[contains(text(),'Next: Location')]"));

    public static final Target INPUT_ZIP = Target.the("Ingresar codigo postal")
            .located(By.id("zip"));

    /*public static final Target INPUT_CITY = Target.the("Ingresar ciudad")
            .located(By.id("city"));
    public static final Target SELECT_PAIS = Target.the("Seleccionar idioma")
            .located(By.xpath("//div//div//span"));

    public static final Target INPUT_PAIS = Target.the("Ingresar pais")
            .located(By.xpath("//div//input[type='search']"));*/

    public static final Target BUTTON_STEP2 = Target.the("Siguiente paso")
            .located(By.xpath("//a//span[contains(text(),'Next: Devices')]"));

    public static final Target SELECT_DEVICE = Target.the("Lista de dispositivos")
            .located(By.xpath("//div[@placeholder='Select Brand' @aria-label='Select Brand']"));

    public static final Target OPTION_DEVICE = Target.the("Seleccionar dispositivo")
            .located(By.xpath("//span//div[contains(text(),'Motorola')]"));

    public static final Target SELECT_MODEL = Target.the("Lista de modelos")
            .located(By.xpath("//div[@placeholder='Select a Model' @aria-label='Select a Model']"));

    public static final Target OPTION_MODEL = Target.the("Seleccionar modelos")
            .located(By.xpath("//span//div[contains(text(),'Moto G5')]"));

    public static final Target SELECT_SYSTEM = Target.the("Lista de sistemas operativos")
            .located(By.xpath("//div[@placeholder='Select OS' @aria-label='Select OS']"));

    public static final Target OPTION_SYSTEM = Target.the("Seleccionar sistemas operativo")
            .located(By.xpath("//span//div[contains(text(),'Android 8.1')]"));

    public static final Target BUTTON_STEP3 = Target.the("Siguiente paso")
            .located(By.xpath("//a//span[contains(text(),'Next: Last Step')]"));

    public static final Target INPUT_PASSWORD = Target.the("Ingresar contraseña")
            .located(By.id("password"));

    public static final Target INPUT_PASSWORD_CONFIRM = Target.the("Confirmar contraseña")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_TERM1 = Target.the("Terminos y condiciones ")
            .located(By.xpath("//label[@class='input-check-box signup-consent']//span[@class='checkmark signup-consent__checkbox error']"));

    public static final Target BUTTON_STEP4 = Target.the("Siguiente paso")
            .located(By.xpath("//a//span[contains(text(),'Complete Setup')]"));

    public static final Target MSJ_CONFIRM = Target.the("Mensaje de confirmacion")
            .located(By.xpath("//p[@class='welcome-lead']//b[contains(text(),'First, please check your email inbox')]"));
}

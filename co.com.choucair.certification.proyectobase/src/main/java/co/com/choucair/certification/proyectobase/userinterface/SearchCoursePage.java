package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_CC = Target.the("selecciona cursos y certificaciones")
            .located(By.xpath("//div[@id='certificaciones']//strong"));

    public static final Target INPUT_COURSE = Target.the("buscar el curso")
            .located(By.id("coursesearchbox"));

    public static final Target BUTTON_GO = Target.the("click para buscar el curso")
            .located(By.xpath("//form//button[@class='btn btn-secondary']"));

    public static final Target SELECT_COURSE = Target.the("click para buscar el curso")
            .located(By.xpath("//h4//a[contains(text(),'Foundation Level')]"));

    public static final Target NAME_COURSE = Target.the("extrae el nombre del curso")
            .located(By.xpath("//h1[contains(text(),'Foundation Level')]"));
}

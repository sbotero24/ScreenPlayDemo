package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/index.html")
public class HomePage extends PageObject {
    public static final Target USERNAME = Target.the("username")
            .located(By.xpath("//input[@data-test='username']"));
    public static final Target PASSWORD = Target.the("password")
            .located(By.xpath("//input[@data-test='password']"));
    public static final Target LOGIN_BTN = Target.the("login button")
            .located(By.id("login-button"));
}

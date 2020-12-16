package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.HomePage.*;

public class LoginInto implements Task {
    String username;
    String password;

    public LoginInto(String username, String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(USERNAME),
                Enter.theValue(password).into(PASSWORD),
                Click.on(LOGIN_BTN)
        );
    }

    public static Performable swagLabs(String username, String password) {
    return instrumented (LoginInto.class,username,password);
    }
}

package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.CheckoutPage.*;

public class Checkout implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
    t.attemptsTo(
            Enter.theValue("Santiago").into(FIRST_NAME),
            Enter.theValue("Botero").into(LAST_NAME),
            Enter.theValue("156454").into(ZIP_CODE),
            Click.on(BTN_CONTINUE),
            Click.on(BTN_FINISH)
    );
    }

    public static Performable information() {
        return instrumented (Checkout.class);
    }
}
package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.CheckoutPage.FIRST_NAME;

public class Checkout implements Task {

    @Override
    public <T extends Actor> void performAs(T t) {
    t.attemptsTo(
            Enter.theValue("santiago").into(FIRST_NAME)
    );
    }

    public static Performable information() {
        return instrumented (Checkout.class);
    }
}

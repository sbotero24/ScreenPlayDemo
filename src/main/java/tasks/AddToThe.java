package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.conditions.Check;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static ui.CheckoutPage.*;
import static ui.ProductsPage.*;

public class AddToThe implements Task {
    String item1;
    String item2;

    public AddToThe(String item1, String item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String item3 = item2.trim();
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("Price (low to high)").from(FILTER),
                Click.on(PRODCUT_ITEM.of(item1)),
                Click.on(ADD_TO_CART_BTN),
                Click.on(BACK_BTN),
                Click.on(PRODCUT_ITEM.of(item3)),
                Click.on(ADD_TO_CART_BTN),
                Click.on(CART_BTN)
        );
        String quanity = QTY_DESCRIPTION.resolveFor(actor).getText();
        System.out.println(quanity);
        String cartNumber = NUMBER_CART_ITEM.resolveFor(actor).getText();
        actor.attemptsTo(
        Check.whether(!quanity.isEmpty() && !cartNumber.isEmpty())
                .andIfSo(Click.on(CHECKOUT_BTN))
        );
    }

    public static Performable cart(String item1, String item2) {
        return instrumented(AddToThe.class, item1, item2);
    }
}


package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.CheckoutPage.TXT_FINAL;

public class ProcessWas implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return (TXT_FINAL.resolveFor(actor).isVisible()) ? true : false;
    }

    public static ProcessWas successful() {
        return new ProcessWas();
    }

}



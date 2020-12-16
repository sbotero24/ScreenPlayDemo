package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {
    public static final Target NUMBER_CART_ITEM = Target.the("number cart item")
            .located(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
    public static final Target QTY_DESCRIPTION = Target.the("number cart item")
            .located(By.id("cart_contents_container"));
    public static final Target CART_BTN = Target.the("number cart item")
            .located(By.xpath("//div[@class='shopping_cart_container']"));
    public static final Target CHECKOUT_BTN = Target.the("number cart item")
            .located(By.xpath("//a[@class='btn_action checkout_button']"));
    public static final Target FIRST_NAME = Target.the("number cart item")
            .located(By.xpath("//*[@id=\"first-name\"]"));
}

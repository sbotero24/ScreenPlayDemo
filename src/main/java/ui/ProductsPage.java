package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {
    public static final Target FILTER = Target.the("filter")
            .located(By.xpath("//select[@class='product_sort_container']"));
    public static final Target PRODCUT_ITEM = Target.the("product item")
            .locatedBy(("//div[@class='inventory_item_name' and contains(.,'{0}')]"));
    public static final Target ADD_TO_CART_BTN = Target.the("add to cart button")
            .locatedBy(("//button[@class='btn_primary btn_inventory']"));
    public static final Target BACK_BTN = Target.the(" back button")
            .locatedBy(("//button[@class='inventory_details_back_button']"));
}

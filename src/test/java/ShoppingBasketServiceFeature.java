import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class ShoppingBasketServiceFeature {

    @Test
    void
    should_contain_one_film_and_the_total() {
        UserID userID = new UserID();
        ProductID productID = new ProductID();
        ShoppingBasketService shoppingBasket = new ShoppingBasketService();
        shoppingBasket.addItem(userID, 1002, 1);

        assertThat( shoppingBasket.basketFor(userID)).isEqualTo("21/09/2022", "1 x The Hobbit", "1 x £5.00 = £5.00", "Total: £5.00");
    }


}

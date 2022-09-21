import org.junit.jupiter.api.Test;


public class ShoppingBasketServiceFeature {

    @Test
    void
    should_contain_one_film_and_the_total() {
        User user = new User();
        String userID = user.id;
        ShoppingBasketService shoppingBasket = new ShoppingBasketService();
        shoppingBasket.addItem(userID, 1002, 1);

        assertThat( shoppingBasket.basketFor(userID)).isEqualTo("21/09/2022", "1 x The Hobbit", "1 x £5.00 = £5.00", "Total: £5.00");
    }


}

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@ExtendWith(MockitoExtension.class)
public class ShoppingBasketShould {

    @Mock Product product;

    @Test
    void
    add_a_product_to_basket_on_initialization(){
        ShoppingBasket shoppingBasket = new ShoppingBasket(product);

        assertThat(shoppingBasket.getBasket().size()).isEqualTo(1);
    }

    @Test
    void
    add_two_products_to_basket(){
        ShoppingBasket shoppingBasket = new ShoppingBasket(product);
        shoppingBasket.addProductToBasket(product);

        assertThat(shoppingBasket.getBasket().size()).isEqualTo(2);
    }




}
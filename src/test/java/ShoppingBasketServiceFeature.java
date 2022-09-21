import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@ExtendWith(MockitoExtension.class)
public class ShoppingBasketServiceFeature {

    @Mock ProductRepository productRepository;

    @Test
    void
    should_contain_one_film_and_the_total() {

        addProductsToProductRepository();
        UserID userID = new UserID();
        ShoppingBasketService shoppingBasket = new ShoppingBasketService(productRepository);
        ShoppingBasket shoppingBasket = new ShoppingBasket();

        assertThat(shoppingBasket.basketFor(userID)).isEqualTo("21/09/2022, 1 x The Hobbit, 1 x £5.00 = £5.00, Total: £5.00");
    }

    private void addProductsToProductRepository() {
        Product lordOfTheRings = new Product(100001, "Lord of the Rings", 10.00);
        Product theHobbit = new Product(100002, "The Hobbit", 5.00);
        Product gameOfThrones = new Product(20001, "Game of Thrones", 9.00);
        Product breakingBad = new Product(20110, "Breaking Bad", 7.00);

        productRepository.addProduct(lordOfTheRings);
        productRepository.addProduct(theHobbit);
        productRepository.addProduct(gameOfThrones);
        productRepository.addProduct(breakingBad);
    }

//        String[] basket = {"21/09/2022", "1 x The Hobbit", "1 x £5.00 = £5.00", "Total: £5.00"};

}

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {

    private List<Product> basket = new ArrayList<>();

    public void addProductToBasket(Product product, int quantity) {
//        need to implement adding multiple products...
        basket.add(product);
    }

    public List<Product> getBasket() {
        return basket;
    }

}

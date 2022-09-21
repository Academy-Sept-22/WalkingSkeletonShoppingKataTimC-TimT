import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ProductRepository {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }
}
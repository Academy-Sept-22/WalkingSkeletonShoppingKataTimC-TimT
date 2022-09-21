import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Product findProduct(int productId) {
        for( Product product : products ){
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null;
    }

}
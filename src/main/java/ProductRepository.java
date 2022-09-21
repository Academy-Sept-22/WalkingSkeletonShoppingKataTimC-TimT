import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ProductRepository {



    private HashMap<Integer, List<Object>> productsMap = new HashMap<>();

    public void addProduct(Product product) {

        productsMap.put(product.getProductId(), product.getProductName(), product.getProductPrice());
    }

}

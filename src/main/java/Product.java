import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Product {

    private int productId;
    private String productName;
    private float productPrice;

    public Product(int productId, String productName, float productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public float getProductPrice() {
        return productPrice;
    }
}

// hash {productID, {productName, productPrice}}
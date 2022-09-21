import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryShould {

	@Test
	void add_one_product_to_the_repository() {
		Product product = new Product(100001, "Lord of the Rings", 10.00);
		ProductRepository productRepository = new ProductRepository();
		productRepository.addProduct(product);
		assertThat(productRepository.products.size()).isEqualTo(1);
	}
}
public class ShoppingBasketService {

	private ProductRepository productRepository;

	public ShoppingBasketService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

    public String basketFor(UserID userId) {
		getUserShoppingBasket(userId);
	}
}

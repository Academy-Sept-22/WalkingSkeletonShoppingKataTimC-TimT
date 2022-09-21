public class ShoppingBasketService {

//	private final UserID userId;
	private ProductRepository productRepository;

	public ShoppingBasketService(ProductRepository productRepository) {
		this.productRepository = productRepository;
//		this.userId = new UserID();
	}

	public void addItem(User user, Product product, int quantity) {
		user.getShoppingBasket().addProductToBasket(product, quantity);
		ShoppingBasket shoppingBasket = new ShoppingBasket(user, product);
//		TBC
	}


//    public String basketFor(UserID userId) {
//		getUserShoppingBasket(userId);
//	}
}

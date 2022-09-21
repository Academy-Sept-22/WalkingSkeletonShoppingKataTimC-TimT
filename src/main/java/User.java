public class User {

	private final int userId;
	private ShoppingBasket shoppingBasket;

	public User() {
		this.userId = 1;
		this.shoppingBasket = new ShoppingBasket();
	}

	public int getUserId() {
		return userId;
	}

	public ShoppingBasket getShoppingBasket() {
		return shoppingBasket;
	}

}

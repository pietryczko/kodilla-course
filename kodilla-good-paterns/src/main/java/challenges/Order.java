package challenges;

public class Order {
    private final User user;
    private final Product product;
    private final int productQuantity;

    public Order(User user, Product product, int productAmount) {
        this.user = user;
        this.product = product;
        this.productQuantity = productAmount;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}

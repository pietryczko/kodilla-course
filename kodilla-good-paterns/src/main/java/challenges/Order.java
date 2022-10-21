package challenges;

public class Order {
    private User user;
    private Product product;
    private int productQuantity;

    public Order(User user, Product product, int productAmount) {
        this.user = user;
        this.product = product;
        this.productQuantity = productAmount;
    }

}

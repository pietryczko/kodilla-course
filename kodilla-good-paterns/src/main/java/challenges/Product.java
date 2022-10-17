package challenges;

public class Product {
    private int productQuantity;

    public Product(String productName, int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }
}

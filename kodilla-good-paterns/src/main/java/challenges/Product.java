package challenges;

public class Product {
    private String productName;
    private int productQuantity;

    public Product(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                '}';
    }

    void increaseAmount(int amount) {
        productQuantity += amount;
    }

    int reduceAmount(int amount) {
        productQuantity -= amount;
        return amount;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}

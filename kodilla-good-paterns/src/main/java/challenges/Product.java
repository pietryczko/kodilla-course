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

    public void increaseAmount(int amount) {
        productQuantity += amount;
    }

    public int reduceAmount(int amount) {
        productQuantity -= amount;
        if (amount < 0) {
            throw new IndexOutOfBoundsException();
        }
        return amount;
    }

    public int getProductQuantity() {
        return productQuantity;
    }
}

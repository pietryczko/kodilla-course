package challenges;

import java.util.Objects;

public class Product {

    private String name;
    private int itemQuantity;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public String getName() {
        return name;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    void increaseAmount(int amount) {
        itemQuantity += amount;
    }

    void reduceAmount(int amount) {
        itemQuantity -= amount;
    }

}

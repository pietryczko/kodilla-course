package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Producer {
    private final String name;
    private final List<Product> products = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                '}';
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(String productName) {
        products.remove(new Product(productName));
    }

    public Product getProduct(String productName) {
        return products.get(products.indexOf(new Product(productName)));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void process(Product product, int amount) {
        products.get(product.reduceAmount(amount));
        System.out.println("Order complete");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return name.equals(producer.name) && products.equals(producer.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }
}

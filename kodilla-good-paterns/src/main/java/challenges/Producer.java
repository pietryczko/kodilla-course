package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Producer {
    private final String name;
    private final List<Product> productList = new ArrayList<>();

    public Producer(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producer producer = (Producer) o;
        return name.equals(producer.name) && productList.equals(producer.productList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, productList);
    }

    @Override
    public String toString() {
        return "Producer{" +
                "name='" + name + '\'' +
                '}';
    }

    void addProduct(Product product) {
        productList.add(product);
    }

    void deleteProduct(String productName) {
        productList.remove(new Product(productName));
    }

    public List<Product> getProductList() {
        return productList;
    }

    void process(Producer producer, Product product, int amount) {
        productList.get(product.reduceAmount(amount));
    }
}

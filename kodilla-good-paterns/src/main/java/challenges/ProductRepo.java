package challenges;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    public List<Product> products = new ArrayList<>();

    void createProduct(String productName) {
        Product product = new Product(productName);
        products.add(product);
    }

    void increaseAmount(String productName, int amount) {
        products.get(products.indexOf(new Product(productName))).increaseAmount(amount);
    }

    void reduceAmount(String productName, int amount) {
        products.get(products.indexOf(new Product(productName))).reduceAmount(amount);
    }

    public boolean ifProductExist(Product product) {
        return products.contains(product);
    }
}

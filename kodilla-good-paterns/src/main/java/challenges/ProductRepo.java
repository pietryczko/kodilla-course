package challenges;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    public List<Product> products = new ArrayList<>();

    void createProduct(String productName) {
        Product product = new Product(productName);
    }

    void increaseAmount(String productName, int amount) {
        products.get(products.indexOf(new Product(productName))).increaseAmount(amount);
    }

    void reduceAmount(String productName, int amount) {
        products.get(products.indexOf(new Product(productName))).reduceAmount(amount);
    }

    boolean productExist(Product product) {
        return products.contains(product);
    }
}

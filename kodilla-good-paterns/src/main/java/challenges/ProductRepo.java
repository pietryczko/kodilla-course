package challenges;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    public List<Product> productList = new ArrayList<>();

    void addProduct(String productName) {
        Product product = new Product(productName);
    }

    boolean productExist(Product product) {
        return productList.contains(product);
    }
}

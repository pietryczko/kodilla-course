package challenges;

import java.util.ArrayList;
import java.util.List;

public class ProductRepo {

    private List<Product> productList = new ArrayList<>();

    void addProduct(String productName) {
        Product product = new Product(productName);
    }

    boolean productExist(Product product) {
        if (productList.contains(product)) {
            return true;
        } else {
            return false;
        }
    }
}

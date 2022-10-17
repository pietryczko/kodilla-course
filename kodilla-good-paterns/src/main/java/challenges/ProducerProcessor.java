package challenges;

import java.util.HashMap;
import java.util.Map;

public class ProducerProcessor {

    Map<String, Product> producerList = new HashMap<>();

    void addProducer(String producerName, String productName, int productQuantity) {
        Product product = new Product(productName, productQuantity);
        producerList.put(producerName, product);
    }

    void process(String producerName, String productName, int productQuantity) {
        producerList.get(producerName).setProductQuantity(producerList.get(producerName).getProductQuantity() - productQuantity);
        System.out.println("Order from " + producerName + ", contains :  " + productName + " " + productQuantity + " is completed" );
    }
}

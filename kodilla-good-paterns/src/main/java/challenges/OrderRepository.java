package challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private final List<Order> orderList = new ArrayList<>();

    void addOrder(Order order) {
        orderList.add(order);
    }

    private Order getOrder(Order order) {
        return orderList.get(orderList.indexOf(order));
    }

    private void showOrders() {
        for (Order o : orderList) {
            System.out.println(o);
        }
    }
}

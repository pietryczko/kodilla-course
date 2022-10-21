package challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private List<Order> orderList = new ArrayList<>();

    void addOrder(Order order) {
        orderList.add(order);
    }

    void showOrders() {
        for (Order o : orderList) {
            System.out.println(o);
        }
    }
}

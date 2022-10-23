package challenges;

import java.util.ArrayList;
import java.util.List;

public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void showOrders() {
        for (Order o : orders) {
            System.out.println(o);
        }
    }
}

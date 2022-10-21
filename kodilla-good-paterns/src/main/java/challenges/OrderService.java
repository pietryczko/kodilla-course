package challenges;

public class OrderService {

    private final UserRepo userRepo = new UserRepo();

    private final ProductRepo productRepo = new ProductRepo();
    private final OrderRepository orderRepository = new OrderRepository();

    void createOrder(User user, Product product, int itemAmount) {
        if (!userRepo.ifUserExist(user)) {
            System.out.println("User doesn't exist");
            return;
        }
        if (!productRepo.productExist(product)) {
            System.out.println("Product doesn't exist");
            return;
        }
        if (product.getItemQuantity() < itemAmount) {
            System.out.println("Invalid amount of product");
            return;
        }
        Order order = new Order(user, product, itemAmount);
        orderRepository.addOrder(order);
    }
}

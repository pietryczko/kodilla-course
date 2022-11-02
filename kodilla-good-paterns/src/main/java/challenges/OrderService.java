package challenges;

public class OrderService {

    private final UserRepo userRepo;

    private final ProductRepo productRepo;
    private final OrderRepository orderRepository;

    public OrderService(UserRepo userRepo, ProductRepo productRepo, OrderRepository orderRepository) {
        this.userRepo = userRepo;
        this.productRepo = productRepo;
        this.orderRepository = orderRepository;
    }

    public void createOrder(User user, Product product, int itemAmount) {
        if (!userRepo.ifUserExist(user)) {
            System.out.println("User doesn't exist");
            return;
        }
        if (!productRepo.ifProductExist(product)) {
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

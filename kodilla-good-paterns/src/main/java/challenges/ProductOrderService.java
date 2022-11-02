package challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        UserRepo userRepo = new UserRepo();
        ProductRepo productRepo = new ProductRepo();
        OrderRepository orderRepository = new OrderRepository();

        OrderService orderService = new OrderService(userRepo, productRepo, orderRepository);

        userRepo.createUser("John Deep");
        productRepo.createProduct("Orange");
        productRepo.increaseAmount("Orange", 10);
        orderService.createOrder(new User("John Deep"), new Product("Orange"), 5);
        orderRepository.showOrders();
    }
}

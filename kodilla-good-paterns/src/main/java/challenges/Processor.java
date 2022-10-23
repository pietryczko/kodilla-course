package challenges;

public class Processor {

    public static void main(String[] args) {
        ProducerRepo producerRepo = new ProducerRepo();

        producerRepo.addProducer("Food2Door");
        Product orange = new Product("Orange");
        producerRepo.getProducer("Food2Door").addProduct(orange);
        orange.increaseAmount(10);
        producerRepo.getProducer("Food2Door").process(orange, 5);
    }

}

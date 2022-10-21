package challenges;

import java.util.ArrayList;
import java.util.List;

public class ProducerRepo {

    private List<Producer> producers = new ArrayList<>();

    void addProducer(String producerName) {
        producers.add(new Producer(producerName));
    }

    void deleteProducer(String producerName) {
        producers.remove(new Producer(producerName));
    }

    public void showProducers() {
        for (Producer producer : producers) {
            System.out.println(producer);
        }
    }

}

package challenges;

import java.util.ArrayList;
import java.util.List;

public class ProducerRepo {

    private List<Producer> producers = new ArrayList<>();

    public void addProducer(String producerName) {
        producers.add(new Producer(producerName));
    }

    public Producer getProducer(String producerName) {
        return producers.get(producers.indexOf(new Producer(producerName)));
    }

    public void deleteProducer(Producer producer) {
        producers.remove(producer);
    }

    public void showProducers() {
        for (Producer producer : producers) {
            System.out.println(producer);
        }
    }

}

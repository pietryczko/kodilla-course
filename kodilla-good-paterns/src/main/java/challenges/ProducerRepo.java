package challenges;

import java.util.ArrayList;
import java.util.List;

public class ProducerRepo {

    private List<Producer> producerList = new ArrayList<>();

    void addProducer(String producerName) {
        producerList.add(new Producer(producerName));
    }

    void deleteProducer(String producerName) {
        producerList.remove(new Producer(producerName));
    }

    void showProducers() {
        for (Producer producer : producerList) {
            System.out.println(producer);
        }
    }

}

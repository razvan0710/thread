package producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.*;

public class Application {
    public static void main(String[] args) {

        BlockingQueue<Integer> questions = new ArrayBlockingQueue<Integer>(5);

        Thread t1 = new Thread(new Producer(questions));
        Thread t2 = new Thread(new Consumer(questions));

        t1.start();
        t2.start();

    }

}

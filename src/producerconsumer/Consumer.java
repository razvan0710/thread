package producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Integer> questions;
    public Consumer(BlockingQueue<Integer> questions){
        this.questions = questions;
    }
    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Answered question: " + questions.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}

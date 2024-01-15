package producerconsumer;

import threading_inventory.Product;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    BlockingQueue<Integer> questions;
    int questionNo;
    public Producer(BlockingQueue<Integer> questions){
        this.questions = questions;
    }
    @Override
    public void run() {
        while (true) {

            try {
                questions.put(getNextQuestion());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    private synchronized int getNextQuestion(){
        int nextQuestion = questionNo++;
        System.out.println("Got new question: "+nextQuestion);
        return nextQuestion;
    }
}

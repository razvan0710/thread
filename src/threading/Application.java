package threading;

public class Application {
    public static void main(String[] args) {
        System.out.println("Starting thread 1");
        Task taskRunner = new Task("qqqqqq");
        taskRunner.start();

        System.out.println("qaz");

        System.out.println("Starting thread 2");
        Task taskRunner2 = new Task("qaz");
        taskRunner2.start();

    }
}

class Task extends Thread{
    String name;
    public Task(String name){
        this.name=name;
    }
    public void run(){
        Thread.currentThread().setName(this.name);
        for (int i = 0; i < 100; i++) {
            System.out.println("number:"+i+" - "+Thread.currentThread().getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

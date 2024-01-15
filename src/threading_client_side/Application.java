package threading_client_side;
import threading_inventory.InventoryManager;

public class Application {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProduct();
            }
        });

        Thread displayTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        });
        inventoryTask.start();
        try {
            inventoryTask.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        displayTask.start();
    }
}

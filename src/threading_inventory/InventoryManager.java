package threading_inventory;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    List<Product> soldProductList = new ArrayList<Product>();
    List<Product> purchasedProductList = new ArrayList<Product>();
    
    public void populateSoldProduct(){
        for (int i = 0; i < 1000; i++) {
            Product prod = new Product(i, "test_product_"+i);
            soldProductList.add(prod);
            System.out.println("Added: "+prod);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public void displaySoldProducts(){
        for(Product product: soldProductList){
            System.out.println("printing the sold"+ product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

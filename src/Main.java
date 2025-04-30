import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    //CoffeePotUnsynchronized coffeePot = CoffeePotUnsynchronized.getInstance();
                    //CoffeePotSynchronized coffeePot = CoffeePotSynchronized.getInstance();
                    CoffeePotEnum coffeePot = CoffeePotEnum.INSTANCE;
                    coffeePot.drinkCoffee();
                }
            });
            thread.setName("Person " + i);
            thread.start();
            threads.add(thread);
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
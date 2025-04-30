public class CoffeePotSynchronized {
    private static volatile CoffeePotSynchronized instance;

    private CoffeePotSynchronized() {
        System.out.println(Thread.currentThread().getName() + ": I'm making the coffee today!");
    }

    public static CoffeePotSynchronized getInstance() {
        if (instance == null) {
            synchronized (CoffeePotSynchronized.class) {
                if (instance == null) {
                    instance = new CoffeePotSynchronized();
                }
            }
        }
        System.out.println(Thread.currentThread().getName() + ": Coffee is made!");
        return instance;
    }

    public void drinkCoffee() {
        System.out.println(Thread.currentThread().getName() + ": I'm drinking some coffee!");
    }
}

public class CoffeePotUnsynchronized {
    private static volatile CoffeePotUnsynchronized instance;

    private CoffeePotUnsynchronized() {
        System.out.println(Thread.currentThread().getName() + ": I'm making the coffee today!");
    }

    public static CoffeePotUnsynchronized getInstance() {
        if (instance == null) {
            instance = new CoffeePotUnsynchronized();
        }
        System.out.println(Thread.currentThread().getName() + ": Coffee is made!");
        return instance;
    }

    public void drinkCoffee() {
        System.out.println(Thread.currentThread().getName() + ": I'm drinking some coffee!");
    }
}

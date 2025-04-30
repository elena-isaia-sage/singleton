public enum CoffeePotEnum {
    INSTANCE;

    CoffeePotEnum() {
        System.out.println(Thread.currentThread().getName() + ": I'm making the coffee today!");
    }

    public void drinkCoffee() {
        System.out.println(Thread.currentThread().getName() + ": I'm drinking some coffee!");
    }
}

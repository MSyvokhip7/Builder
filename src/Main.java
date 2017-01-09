/**
 * Created by TheOriginMS7 on 03.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Waiter pz = new Waiter();

        PizzaMaker meatPizza = new MeatPizza();
        pz.setPizzaBuilder(meatPizza);
        pz.constructPizza();

        Pizza pizza = pz.getPizza();
        System.out.println(pizza);
    }
}

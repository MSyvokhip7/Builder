/**
 * Created by TheOriginMS7 on 03.01.2017.
 */
public class Waiter {
    private PizzaMaker pizzaMaker;

    public void setPizzaBuilder(PizzaMaker pm) {
        pizzaMaker = pm;
    }
    public Pizza getPizza() {
        return pizzaMaker.getPizza();
    }

    public void constructPizza() {
        pizzaMaker.makePizza();
        pizzaMaker.addCheese();
        pizzaMaker.addMeat();
        pizzaMaker.addVegetables();
        pizzaMaker.addType();
    }
}

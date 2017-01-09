/**
 * Created by TheOriginMS7 on 03.01.2017.
 */
public class VegetablePizza extends PizzaMaker{
    @Override
    public void addCheese(){
        pizza.setCheese("Mozzarella");
    }

    @Override
    public void addMeat(){
        pizza.setMeat("Chicken");
    }

    @Override
    public void addVegetables(){
        pizza.setVegetables("Broccoli, Tomato");
    }

    @Override
    public void addType(){
        pizza.setType("Calzone");
    }
}

/**
 * Created by TheOriginMS7 on 03.01.2017.
 */
public class MeatPizza extends PizzaMaker {
    @Override
    public void addCheese(){
        pizza.setCheese("Mozzarella");
    }

    @Override
    public void addMeat(){
        pizza.setMeat("Salami, Prosciutto");
    }

    @Override
    public void addVegetables(){
        pizza.setVegetables("Nothing");
    }

    @Override
    public void addType(){
        pizza.setType("Default");
    }
}

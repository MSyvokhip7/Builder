/**
 * Created by TheOriginMS7 on 03.01.2017.
 */
public class Pizza {
    private String cheese = "";
    private String meat = "";
    private String vegetables = "";
    private String type = "";

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public void setType(String type){
        this.type = type;
    }

    public String toString(){
        return "Your Pizza is " + type + " type. Pizza contains " + cheese + " cheese, " + meat + " meat and " + vegetables + " vegetables. Bon Appetite.";
    }
}

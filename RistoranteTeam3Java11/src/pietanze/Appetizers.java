package pietanze;

public class Appetizers {
    private String name;
    private double price;

    public Appetizers(String name,double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void printMenu() {
        System.out.println(name + " - " + price );
    }

    //TODO non serve per stampare
    @Override
    public String toString() {
        return name + " - " + price;
    }


}

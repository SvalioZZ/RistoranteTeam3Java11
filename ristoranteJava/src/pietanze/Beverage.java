package pietanze;

public class Beverage {
    
    private String name;
    private double price;
    
    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public Beverage() {
    }
    public String getName() {
        return name;
    }
    public Beverage setName(String name) {
        this.name = name;
        return this;
    }
    public double getPrice() {
        return price;
    }
    public Beverage setPrice(double price) {
        this.price = price;
        return this;
    }
    @Override
    public String toString() {
        return "\n" + name + " - " + price + "\n";
    }
}

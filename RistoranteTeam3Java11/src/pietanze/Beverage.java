package pietanze;

public class Beverage  {
    
    private String name;
    private double price;
    
    private String capacity;
    
    public Beverage(String name, String capacity, double price) {
        this.name = name;
        this.price = price;
        this.capacity = capacity;
    }
    
    public Beverage() {
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
        System.out.println(name + ": " + capacity + " - price: " + price);
    }
    
    @Override
    public String toString() {
        return name + ": " + capacity + " - price: " + price;
    }
}

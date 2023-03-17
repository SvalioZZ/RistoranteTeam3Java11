package pietanze;

public class Beverage extends Portata {
    private String capacity;
    public Beverage(String name, String capacity, double price) {
        super(name, price);
        this.capacity = capacity;
    }
    public Beverage(String name, double price) {
        super(name,price);
    }
    
    @Override
    public void printMenuPortata() {
        super.printMenuPortata();
    }
}

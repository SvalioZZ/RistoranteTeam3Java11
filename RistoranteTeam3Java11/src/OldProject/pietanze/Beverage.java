package OldProject.pietanze;

public class Beverage extends Portata {
    private String capacity;
    public Beverage(String name, String capacity, double price) {
        super(name, price);
        this.capacity = capacity;
        Portate type = Portate.BEVERAGES;
    }
    public Beverage(String name, double price) {
        super(name,price);
    }
    
    @Override
    public void printMenuPortata() {
        System.out.println(super.getName() + ": " + this.capacity + " - " + super.getPrice());
    }
    
    @Override
    public String getPortataType(Portate type) {
        type = Portate.BEVERAGES;
        return super.getPortataType(type);
    }
}

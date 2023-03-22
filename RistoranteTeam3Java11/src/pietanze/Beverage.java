package pietanze;

public class Beverage extends Portata {
    private String capacity;
    private PortateTypeEnum type;
    public Beverage(String name, String capacity, double price) {
        super(name, price);
        this.capacity = capacity;
        this.type = PortateTypeEnum.BEVERAGES;
    }

    @Override
    public void printMenuPortata() {
        System.out.println(super.getName() + ": " + this.capacity + " - " + super.getPrice());
    }


}

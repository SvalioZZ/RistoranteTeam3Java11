package pietanze;

public class Beverage extends Portata {
    private String capacity;
    
    public Beverage(String name, String capacity, double price) {
        super(name, price, PortateTypeEnum.BEVERAGES);
        this.capacity = capacity;
        
    }
    
    @Override
    public void printMenuPortata() {
        System.out.println(
                getAnsiBlackChars() +
                        getAnsiCyanBackground() +
                        super.getName() + ": " + this.capacity +
                        " - " + super.getPrice() + getAnsiReset()
        );
    }
    
    
}

package pietanze;

import static pietanze.AnsiUtility.*;

public class Beverage extends Portata {
    private String capacity;
    
    public Beverage(String name, String capacity, double price) {
        super(name, price, PortateTypeEnum.BEVERAGES);
        this.capacity = capacity;
        
    }
    
    @Override
    public void printPortata() {
        System.out.println(
                ANSI_CYAN_BACKGROUND + ANSI_BLACK_CHARS +
                        super.getName() + ": " + this.capacity +
                        " - " + super.getPrice() + ANSI_RESET
        );
    }
    
    
}

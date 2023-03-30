package pietanze;

import static pietanze.AnsiUtility.*;

public class Beverage extends Portata {
    
    private String capacity;
    private boolean isAlcoholic;
    private int alcoholPerc;
    
    private boolean allaSpina;
    
    public Beverage(String name, String capacity, double price) {
        super(name, price, EnumPortate.BEVERAGES);
        this.capacity = capacity;
        this.isAlcoholic = false;
        this.alcoholPerc = 0;
        this.allaSpina = false;
    }
    
    public Beverage(String name, String capacity, double price, int alcoholPerc) {
        super(name, price, EnumPortate.BEVERAGES);
        this.capacity = capacity;
        this.isAlcoholic = true;
        this.alcoholPerc = alcoholPerc;
        if (this.getName().contains("alla spina")) {
            this.allaSpina = true;
        }
    }
    
    public int getAlcoholPerc() {
        return alcoholPerc;
    }
    
    
    private String printAlcoholic() {
        return isAlcoholic ? "ALCOHOL: " + alcoholPerc + "%" : "false";
    }
    
    @Override
    public String askWaitress() {
        return super.askWaitress();
    }
    
    @Override
    public void printPortata() {
        if (!isAlcoholic) {
            System.out.println(
                    ANSI_CYAN_BACKGROUND + ANSI_BLACK_CHARS +
                            super.getName() + ": " + this.capacity +
                            " - " + super.getPrice() + ANSI_RESET
            );
        } else {
            if (!allaSpina) {
                System.out.println(
                        ANSI_CYAN_BACKGROUND + ANSI_BLACK_CHARS +
                                super.getName() + ": " + this.capacity +
                                " - " + super.getPrice() + " - " + ANSI_PURPLE_BACKGROUND + printAlcoholic() + ANSI_RESET);
            } else {
                String newCapacity = "Small: 0.33 - Medium: 0.50cl - Large: 0.89 cl";
                System.out.println(
                        ANSI_CYAN_BACKGROUND + ANSI_BLACK_CHARS +
                                super.getName() + ": " + this.capacity +
                                " - " + super.getPrice() + " - " + ANSI_PURPLE_BACKGROUND + printAlcoholic() + ANSI_RESET +
                                "\n" + ANSI_BLACK_BACKGROUND + "*** You can chose if alla spina these sizes ***" + ANSI_RESET +
                                "\n" + ANSI_BLACK_BACKGROUND + newCapacity + ANSI_RESET +
                                "\n" + ANSI_WHITE_BACKGROUND + ANSI_BLACK_CHARS + askWaitress() + ANSI_RESET);
            }
        }
    }
}

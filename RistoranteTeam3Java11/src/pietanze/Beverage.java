package pietanze;

import static pietanze.AnsiUtility.*;

public class Beverage extends Portata {
    
    private String capacity;
    private boolean isAlcoholic;
    private int alcoholPerc;
    
    public Beverage(String name, String capacity, double price, int alcoholPerc, boolean isAlcoholic) {
        super(name, price, EnumPortate.BEVERAGES);
        this.capacity = capacity;
        this.isAlcoholic = isAlcoholic;
        this.alcoholPerc = alcoholPerc;
    }
    
    public String getCapacity() {
        return capacity;
    }
    
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    
    public boolean isAlcoholic() {
        return isAlcoholic;
    }
    
    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }
    
    public int getAlcoholPerc() {
        return alcoholPerc;
    }
    
    public void setAlcoholPerc(int alcoholPerc) {
        this.alcoholPerc = alcoholPerc;
    }
    
    private String printAlcoholic() {
        return isAlcoholic ? "ALCOHOL: " + alcoholPerc + "%" : "false";
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
            String newCapacity = "Small: 33cl - Medium: 50cl - Large: 89cl";
            if (!super.getName().contains("alla spina")) {
                System.out.println(ANSI_CYAN_BACKGROUND + ANSI_BLACK_CHARS +
                                           super.getName() + ": " + this.capacity +
                                           " - " + super.getPrice() + " - " + ANSI_PURPLE_BACKGROUND + printAlcoholic() + ANSI_RESET);
            } else {
                System.out.println(
                        ANSI_CYAN_BACKGROUND + ANSI_BLACK_CHARS +
                                super.getName() + ": " + this.capacity +
                                " - " + super.getPrice() + " - " + ANSI_PURPLE_BACKGROUND + printAlcoholic() + ANSI_RESET +
                                "\n" + ANSI_BLACK_BACKGROUND + newCapacity + ANSI_RESET +
                                "\n" + ANSI_BLACK_BACKGROUND + askWaitress() + ANSI_RESET
                );
            }
        }
    }
}

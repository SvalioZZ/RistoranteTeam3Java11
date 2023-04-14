package pietanze;

import java.util.List;

import static pietanze.AnsiUtility.*;

public class Portata {

    private String name;
    private double price;
    private EnumPortate type;
    //private List<AllergeniciEnum> allergen;
    private String description;
    
    public Portata(String name, double price, EnumPortate type) {
        this.name = name;
        this.price = price;
        this.type = type;
        // this.allergen = allergen;
    }

//    public List<AllergeniciEnum> getAllergen() {
//        return allergen;
//    }
//
//    public void setAllergen(List<AllergeniciEnum> allergen) {
//        this.allergen = allergen;
//    }

    public EnumPortate getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String askWaitress() {
        return "For every question about price adjustments ask the waiter/ress";
    }
    

    public void printPortata() {
        System.out.println(ANSI_BLACK_CHARS + ANSI_CYAN_BACKGROUND + name + " - " + price + ANSI_RESET);
    }
}





















/*

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m"
    private static final String ANSI_BLACK_CHARS = "\u001B[30m";
*/



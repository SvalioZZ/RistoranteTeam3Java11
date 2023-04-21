package pietanze;

import pietanze.enumerati.EnumPortate;

import static pietanze.enumerati.AnsiUtility.*;

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
        System.out.println(ANSI_BLACK_CHARS.getColor() + ANSI_CYAN_BACKGROUND.getColor() + name + " - " + price + ANSI_RESET.getColor());
    }
}
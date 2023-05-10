package pietanze;

import pietanze.enumerati.AnsiUtilityEnum;
import pietanze.enumerati.PortateEnum;

import static pietanze.enumerati.AnsiUtilityEnum.*;

public class Portata {

    private String name;
    private double price;
    private PortateEnum type;
    
    private String description;
    
    public Portata(String name, double price, PortateEnum type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public PortateEnum getType() {
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
        System.out.println(ANSI_BLACK_CHARS.getCodice() + ANSI_CYAN_BACKGROUND.getCodice() + name + " - " + price + ANSI_RESET.getCodice());
    }

    public void printPortata(AnsiUtilityEnum ansiUtilityEnum1,AnsiUtilityEnum ansiUtilityEnum2 ) {
        System.out.println(ansiUtilityEnum1.getCodice() + ansiUtilityEnum2.getCodice() + name + " - " + price + ANSI_RESET.getCodice());
    }
}
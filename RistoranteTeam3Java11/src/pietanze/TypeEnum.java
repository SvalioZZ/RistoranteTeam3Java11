package pietanze;

public enum TypeEnum {
    //TODO mettiamo gli altri tipi
    MEAT("Meat Based Menu"),
    VEGAN("Vegan Based Menu"),

    //TODO gli enum so gratis se ve ne serve un altro fatelo non accorpiamo logiche di cose diverse
    GLUTENFREE("No Gluten Menu"),
    LACTOSEFREE("No Lactose Menu"),
    EXPLOSIVE("Maybe your final menu");
    
    //TODO enum del tipo di menu
    
    
    private final String description;
    
    TypeEnum(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    
}

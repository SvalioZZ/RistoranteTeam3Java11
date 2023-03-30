package pietanze;

public enum MenuType {
    //TODO mettiamo gli altri tipi
    MEAT("Meat Based Menu"),
    VEGAN("Vegan Based Menu"),
    GLUTENFREE("No Gluten Menu"),
    LACTOSEFREE("No Lactose Menu"),
    EXPLOSIVE("Maybe your final menu");
    
    //TODO enum del tipo di menu
    
    
    private final String description;
    
    MenuType(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    
}

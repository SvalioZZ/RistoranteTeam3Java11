package pietanze.enumerati;

public enum TypeEnum {
    MEAT("Meat Based Menu"),
    VEGAN("Vegan Based Menu"),
    FISH ("Fish Based Menu"),
    CHEF ("Chef Menu"),
    HOUSE ("House Menu"),
    DAY("Day Menu"),
    TASTING ("Tasting Menu");

    private final String description;
    
    TypeEnum(String description) {
        this.description = description;
    }
    
    public String getDescription() {
        return description;
    }
    
    
}

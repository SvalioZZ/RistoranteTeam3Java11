package pietanze;

import java.util.List;


public enum AllergeniciEnum {
    LATTOSIO(1, "Latte", "This courses countains milk and derivatives"),
    GLUTINE(2, "Grano", "This courses countains gluten and derivatives"),
    ARACHIDI(3, "Arachidi", "This courses countains arach and derivatives"),
    FRUTTA_A_GUSCIO(4, "Frutta a guscio", "This courses countains Walnuts and derivatives nuts"),
    SOIA(5, "Soia", "This courses countains Soia and derivatives"),
    UOVA(6, "Uova", "This courses countains eggs and derivatives"),
    PESCE(7, "Pesce", "This courses countains fish and derivatives"),
    CROSTACEI(8, "Crostacei", "This courses countains shellfish and derivatives"),
    SENAPE(9, "Senape", "This courses countains mustard and derivatives"),
    SESAMO(10, "Sesamo", "This courses countains sesame and derivatives"),
    SOLFITI(11, "Solfiti", "This courses countains sulfites and derivatives");
    
    private List<AllergeniciEnum> ingredients;
    private String name;
    private String description;
    private int id;
    
    AllergeniciEnum(int id, String name, String description) {
        this.name = name;
        this.id = id;
        this.description = description;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    //chiedere a michele se va bene come ragionamento
    
    /*public void isAllergenic() {
        List<Ingredient> allergens = Arrays.asList(
                Ingredient.LATTOSIO,
                Ingredient.GLUTINE,
                Ingredient.ARACHIDI,
                Ingredient.FRUTTA_A_GUSCIO,
                Ingredient.SOIA,
                Ingredient.UOVA,
                Ingredient.PESCE,
                Ingredient.CROSTACEI,
                Ingredient.SENAPE,
                Ingredient.SESAMO,
                Ingredient.SOLFITI
        );

        for (Ingredient ingredient : ingredients) {
            if (allergens.contains(ingredient)) {
                System.out.println(ingredient.getName() + " è un allergene");
            }
        }
    }*/
    public List<AllergeniciEnum> getIngredients() {
        return ingredients;
    }
}
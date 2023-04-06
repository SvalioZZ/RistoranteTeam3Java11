package pietanze;

public enum EnumIngredienti {
    STRAWBERRIES(1, "Fragole", ""), CHOCALATE(2, "Cioccolato", "IgE"), COCOA(3, "Cacao", ""), COFFEE(4, "Caffè", ""),
    BUTTER(5, "Burro", "lactose"), MILK(6, "Latte", "lactose"), EGGS(7, "Uova", "lisozima"), SUGAR(8, "Zucchero", ""),
    YEAST(9, "Lievito", ""), MILK_CREAM(10, "Panna", "lactose"), CREAM_CHEESE(11, "Formaggio spalmabile", "lactose"),
    MASCARPONE_CHEESE(12, "Mascarpone", "lactose"), FLOUR(13, "Farina", "gluten"), APPLES(14, "Mele", ""),
    DRY_BISCUITS(15, "Biscotti secchi", "gluten"), SAVOIARDI_BISCUITS(16, "Savoiardi", "gluten"), HAZELNUTS(17, "Nocciole", "IgE"),
    SALT(18, "Sale", ""), RED_FOOD_COLORING(19, "Colorante alimentare rosso", ""), VANILLA(20, "Vaniglia", "");

    private int id;
    private String name;
    private String allergen;

    EnumIngredienti(int id, String name, String allergen) {
        this.id = id;
        this.name = name;
        this.allergen = allergen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }
}



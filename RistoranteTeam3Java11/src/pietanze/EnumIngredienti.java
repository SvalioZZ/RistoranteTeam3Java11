package pietanze;

import java.util.List;

public enum EnumIngredienti {
    STRAWBERRIES(1, "Fragole", List.of()),
    CHOCALATE(2, "Cioccolato", List.of("IgE")),
    COCOA(3, "Cacao", List.of()),
    COFFEE(4, "Caffè", List.of()),
    BUTTER(5, "Burro", List.of("lactose")),
    MILK(6, "Latte", List.of()),
    EGGS(7, "Uova", List.of("lisozima")),
    SUGAR(8, "Zucchero", List.of()),
    YEAST(9, "Lievito", List.of()),
    MILK_CREAM(10, "Panna", List.of("lactose")),
    CREAM_CHEESE(11, "Formaggio spalmabile", List.of("lactose")),
    MASCARPONE_CHEESE(12, "Mascarpone", List.of("lactose")),
    FLOUR(13, "Farina", List.of("gluten")),
    APPLES(14, "Mele", List.of()),
    DRY_BISCUITS(15, "Biscotti secchi", List.of("lactose", "gluten")),
    SAVOIARDI_BISCUITS(16, "Savoiardi", List.of("gluten")),
    HAZELNUTS(17, "Nocciole", List.of("IgE")),
    SALT(18, "Sale", List.of()),
    RED_FOOD_COLORING(19, "Colorante alimentare rosso", List.of()),
    VANILLA(20, "Vaniglia", List.of());

    private int id;
    private String name;
    private List<String> allergen;

    EnumIngredienti(int id, String name, List<String> allergen) {
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

    public List<String> getAllergen() {
        return allergen;
    }

    public void setAllergen(List<String> allergen) {
        this.allergen = allergen;
    }
}



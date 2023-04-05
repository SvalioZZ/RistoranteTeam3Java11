package pietanze;

public enum EnumIngredienti {
    STRAWBERRIES(1, "Fragole"), CHOCALATE(2, "Cioccolato"), COCOA(3, "Cacao"), COFFEE(4, "Caffè"),
    BUTTER(5, "Burro"), MILK(6, "Latte"), EGGS(7, "Uova"), SUGAR(8, "Zucchero"),
    YEAST(9, "Lievito"), MILK_CREAM(10, "Panna"), CREAM_CHEESE(11, "Formaggio spalmabile"),
    MASCARPONE_CHEESE(12, "Mascarpone"), FLOUR(13, "Farina"), APPLES(14, "Mele"),
    DRY_BISCUITS(15, "Biscottoìi secchi"), SAVOIARDI_BISCUITS(16, "Savoiardi"), HAZELNUTS(17, "Nocciole"),
    SALT(18, "Sale"), RED_FOOD_COLORING(19, "Colorante aloìimentare rosso"), VANILLA(20, "Vaniglia");

    private int id;
    private String name;

    EnumIngredienti(int id, String name) {
        this.id = id;
        this.name = name;
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
}



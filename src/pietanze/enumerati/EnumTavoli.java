package pietanze.enumerati;

public enum EnumTavoli {


    //TODO riparlarne

    TAVOLO_MEDIO(1, 4, "Tavolo per 2 persone"),
    TAVOLO_2(2, 4, "Tavolo per 4 persone"),
    TAVOLO_3(3, 2, "Tavolo per 6 persone"),
    TAVOLO_4(4, 2, "Tavolo per 10 persone");

    private int disponibilitaTable;
    private String description;
    private int id;

    EnumTavoli(int id, int disponibilitaTable, String description) {
        this.disponibilitaTable = disponibilitaTable;
        this.id = id;
        this.description = description;
    }

    public int getDisponibilitaTable() {
        return disponibilitaTable;
    }

    public void setDisponibilitaTable(int disponibilitaTable) {
        this.disponibilitaTable = disponibilitaTable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

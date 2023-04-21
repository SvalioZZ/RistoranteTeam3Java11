package pietanze.enumerati;

public enum TavoliEnum {


    //TODO riparlarne

    TAVOLO_PER_DUE(1, 4, "Tavolo per 2 persone"),
    TAVOLO_PER_QUATTRO(2, 4, "Tavolo per 4 persone"),
    TAVOLO_PER_SEI(3, 2, "Tavolo per 6 persone"),
    TAVOLO_PER_DIECI(4, 2, "Tavolo per 10 persone");

    private int disponibilitaTable;
    private String description;
    private int id;

    TavoliEnum(int id, int disponibilitaTable, String description) {
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

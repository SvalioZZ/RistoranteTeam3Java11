package pietanze;

public enum PortateTypeEnum {

    //TODO inseriamo tutti i tipi e poi ci potete mettere una descrizione ecc ecc
    BEVERAGES("Bevande", 1),
    APPETIZERS("Antipasti", 2),
    FIRST("Primi Piatti", 3),
    SECOND("Secondi Piatti", 4),
    DESSERT("Dessert", 5);
    
    private final String nome;
    private final int key;


    PortateTypeEnum(String nome, int key) {
        this.nome = nome;
        this.key = key;
    }

    public String getNome() {
        return nome;
    }

    public int getKey() {
        return key;
    }
}

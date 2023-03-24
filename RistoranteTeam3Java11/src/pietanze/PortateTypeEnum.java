package pietanze;

public enum PortateTypeEnum {

    //TODO inseriamo tutti i tipi e poi ci potete mettere una descrizione ecc ecc
    BEVERAGES("Bevande", 1),
    SECOND("Secondi Piatti", 3);

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

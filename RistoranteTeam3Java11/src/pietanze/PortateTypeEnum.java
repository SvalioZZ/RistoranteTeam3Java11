package pietanze;

public enum PortateTypeEnum {

    //TODO inseriamo tutti i tipi e poi ci potete mettere una descrizione ecc ecc
    BEVERAGES("Bevande"),
    SECOND("Secondi Piatti");

    private final String nome;

    PortateTypeEnum(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

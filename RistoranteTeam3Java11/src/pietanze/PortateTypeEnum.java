package pietanze;

public enum PortateTypeEnum {


    //TODO, prima l'id poi il nome e poi la descrizione
    BEVERAGES("------- BEVANDE -------", 1),
    APPETIZERS("------- ANTIPASTI -------", 2),
    FIRST("------- PRIMI PIATTI -------", 3),
    SECOND("------- SECONDI PIATTI -------", 4),
    DESSERT("------- DESSERTS -------", 5);
    
    private final String nome;
    private final int key;

    //TODO spostare in una classe utility
    private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_RESET = "\u001B[0m";
    
    private static final String ANSI_BLACK_CHARS = "\u001B[30m";


    PortateTypeEnum(String nome, int key) {
        this.nome = ANSI_BLACK_CHARS + ANSI_BLUE_BACKGROUND + nome + ANSI_RESET;
        this.key = key;
    }

    public String getNome() {
        return nome;
    }

    public int getKey() {
        return key;
    }


}

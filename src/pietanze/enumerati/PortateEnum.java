package pietanze.enumerati;

import static pietanze.enumerati.AnsiUtilityEnum.*;

public enum PortateEnum {
    
    BEVERAGES(1, "------- BEVANDE -------"),
    APPETIZERS(2, "------- ANTIPASTI -------"),
    FIRST(3, "------- PRIMI PIATTI -------"),
    SECOND(4, "------- SECONDI PIATTI -------"),
    DESSERT(5, "------- DESSERTS -------");
    
    private final String nome;
    private final int key;
    
    PortateEnum(int key, String nome) {
        this.nome =  nome ;
        this.key = key;
    }

    public String getNome() {
        return ANSI_BLACK_CHARS.getCodice() + ANSI_RED_BACKGROUND.getCodice() + nome + ANSI_RESET.getCodice();
    }

    public int getKey() {
        return key;
    }


}

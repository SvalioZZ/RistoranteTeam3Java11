package pietanze;

import static pietanze.AnsiUtility.*;

public enum EnumPortate {
    
    BEVERAGES(1, "------- BEVANDE -------"),
    APPETIZERS(2, "------- ANTIPASTI -------"),
    FIRST(3, "------- PRIMI PIATTI -------"),
    SECOND(4, "------- SECONDI PIATTI -------"),
    DESSERT(5, "------- DESSERTS -------");
    
    private final String nome;
    private final int key;
    
    EnumPortate(int key, String nome) {
        this.nome =  nome ;
        this.key = key;
    }

    public String getNome() {
        return ANSI_BLACK_CHARS.getColor() + ANSI_RED_BACKGROUND.getColor() + nome + ANSI_RESET.getColor();
    }

    public int getKey() {
        return key;
    }


}

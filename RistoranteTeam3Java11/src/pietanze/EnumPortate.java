package pietanze;

import static pietanze.AnsiUtility.*;

public enum EnumPortate {
    
    
    //TODO, prima l'id poi il nome e poi la descrizione
    BEVERAGES(1, "------- BEVANDE -------"),
    APPETIZERS(2, "------- ANTIPASTI -------"),
    FIRST(3, "------- PRIMI PIATTI -------"),
    SECOND(4, "------- SECONDI PIATTI -------"),
    DESSERT(5, "------- DESSERTS -------");
    
    private final String nome;
    private final int key;

    //TODO spostare in una classe utility
    
    
    EnumPortate(int key, String nome) {
        this.nome =  nome ;
        this.key = key;
    }

    public String getNome() {
        return ANSI_BLACK_CHARS + ANSI_RED_BACKGROUND + nome + ANSI_RESET;
    }

    public int getKey() {
        return key;
    }


}

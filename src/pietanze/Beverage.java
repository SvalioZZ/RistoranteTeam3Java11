package pietanze;

import pietanze.enumerati.PortateEnum;

import static pietanze.enumerati.AnsiUtilityEnum.*;

/**
 * Questa è la classe beverage, all'interno troviamo tutti i metodi che eredita
 * dalla classe padre Portata, inseriti getter e setter di default, tramite questa classe
 * posso creare istanze di tipo Beverage (field a sé) all'interno del main.
 *
 * @author vales
 * @version 1.0
 * @see pietanze.Portata
 */

public class Beverage extends Portata {
    private String capacity;
    private boolean isAlcoholic;
    private int alcoholPerc;
    
    /**
     * @constructor costruttore di default, presente match con la superClasse Portata.
     *
     *
     * @param name - super della classe Portata,
     * @param capacity - valore del contenuto di una bevanda, stanziata come String,
     * @param price super della classe Portata,
     * @param alcoholPerc - valore intero, ad indicare quanto sia il livello di alcol nella bevanda,
     * @param isAlcoholic - valore in booleano per identificare l'alcolicità di una bevanda.
     */
    
    public Beverage(String name, String capacity, double price, int alcoholPerc, boolean isAlcoholic) {
        super(name, price, PortateEnum.BEVERAGES);
        this.capacity = capacity;
        this.isAlcoholic = isAlcoholic;
        this.alcoholPerc = alcoholPerc;
    }
    
    /**
     * Getter per estrapolare il valore capacity della Bevanda.
     * @return capacity
     */
    public String getCapacity() {
        return capacity;
    }
    
    /**
     * Setter per impostare il valore capacity della Bevanda.
     * @param capacity
     */
    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
    /**
     * Getter per estrapolare il valore isAlcoholic della Bevanda.
     * @return isAlcoholic
     */
    public boolean isAlcoholic() {
        return isAlcoholic;
    }
    /**
     * Setter per impostare il valore isAlcoholic della Bevanda.
     * @param alcoholic
     */
    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }
    /**
     * Getter per estrapolare il valore alcoholPerc della Bevanda.
     * @return alcoholPerc
     */
    public int getAlcoholPerc() {
        return alcoholPerc;
    }
    /**
     * Setter per impostare il valore alcoholPerc della Bevanda.
     * @param alcoholPerc
     */
    public void setAlcoholPerc(int alcoholPerc) {
        this.alcoholPerc = alcoholPerc;
    }
    
    /**
     * Il metodo ritorna una String che verrà implementata in metodi successivi
     * @return isAlcoholic ? "ALCOHOL: " + alcoholPerc + "%" : "false"
     */
    private String printAlcoholic() {
        return isAlcoholic ? "ALCOHOL: " + alcoholPerc + "%" : "false";
    }
    
    /**
     * printPortata è un metodo che la classe Beverage eredita dalla classe Portata,
     * all'interno troviamo dei metodi di cui sopra, implementati perché fungano da condizioni di stampa di default.
     *
     * ogni metodo richiama per una questione di 'abbellimento', delle Stringhe speciali dalla classe enum AnsiUtility,
     * rendendo visibilmente colorato l'output in terminale.
     *
     * @override metodo printPortata classe pietanze.Portata.
     */
    @Override
    public void printPortata() {
        if (!isAlcoholic) {
            System.out.println(
                    ANSI_CYAN_BACKGROUND.getColor() + ANSI_BLACK_CHARS.getColor() +
                            super.getName() + ": " + this.capacity +
                            " - " + super.getPrice() + ANSI_RESET.getColor()
            );
        } else {
            String newCapacity = "Small: 33cl - Medium: 50cl - Large: 89cl";
            if (!super.getName().contains("alla spina")) {
                System.out.println(ANSI_CYAN_BACKGROUND.getColor() + ANSI_BLACK_CHARS.getColor() +
                                           super.getName() + ": " + this.capacity +
                                           " - " + super.getPrice() + " - " + ANSI_PURPLE_BACKGROUND.getColor() + printAlcoholic() + ANSI_RESET.getColor());
            } else {
                System.out.println(
                        ANSI_CYAN_BACKGROUND.getColor() + ANSI_BLACK_CHARS.getColor() +
                                super.getName() + ": " + this.capacity +
                                " - " + super.getPrice() + " - " + ANSI_PURPLE_BACKGROUND.getColor() + printAlcoholic() + ANSI_RESET.getColor() +
                                "\n" + ANSI_BLACK_BACKGROUND.getColor() + newCapacity + ANSI_RESET.getColor() +
                                "\n" + ANSI_BLACK_BACKGROUND.getColor() + askWaitress() + ANSI_RESET.getColor()
                );
            }
        }
    }
}

package pietanze;

import pietanze.enumerati.IngredientiEnum;
import pietanze.enumerati.PortateEnum;
import pietanze.enumerati.SapiditaEnum;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static pietanze.enumerati.AnsiUtilityEnum.*;

/**
 * La classe Desserts ha un costruttore che è usato per istanziare tutti i desserts nel main
 * con nome, prezzo, tutti gli ingredienti del piatto se esso contiene glutine e lattosio.
 * Ha tre metodi che verranno poi usati nel metodo di stampa per fornire tutte le informazioni necessarie per ogni piatto.
 *
 * @author "Stefano Devoti"
 * @version 1.0
 * @see pietanze.Portata
 */

public class Desserts extends Portata {
    private final boolean containFrozenIngredients;
    private final boolean glutenFree;
    private final boolean lactoseFree;
    private SapiditaEnum dolcezza;
    private Set<IngredientiEnum> ingredienti;

    /**
     * @param name                     valore stringa che indica il nome del piatto (super Portata)
     * @param price                    valore intero che indica il prezzo del piatto (super Portata)
     * @param containFrozenIngredients booleano che indica se nel piatto sono usati ingredienti che possono essere surgelati
     * @param glutenFree               booleano che indica se il piatto contiene glutine
     * @param lactoseFree              booleano che indica se il piatto è privo di lattosio
     * @param dolcezza                 richiama la classe SapiditàEnum e indica il grado di dolcezza del piatto
     * @param ingredienti              attraverso un List e la classe IngredientiEnum, elenca gli ingredienti del piatto
     * @constructor costruttore della classe
     */

    public Desserts(String name, double price, boolean containFrozenIngredients, boolean glutenFree, boolean lactoseFree,
                    SapiditaEnum dolcezza, Set<IngredientiEnum> ingredienti) {
        super(name, price, PortateEnum.DESSERT);
        this.containFrozenIngredients = containFrozenIngredients;
        this.glutenFree = glutenFree;
        this.lactoseFree = lactoseFree;
        this.dolcezza = dolcezza;
        this.ingredienti = ingredienti;
    }

    /**
     * Getter per prendere il valore booleano glutenFree
     *
     * @return glutenFree
     */
    public boolean isGlutenFree() {
        return glutenFree;
    }

    /**
     * Getter per prendere il valore booleano lactoseFree
     *
     * @return lactoseFree
     */
    public boolean isLactoseFree() {
        return lactoseFree;
    }

    /**
     * Setter per impostare gli ingredienti
     *
     * @param ingredienti
     */
    public void setIngredienti(Set<IngredientiEnum> ingredienti) {
        this.ingredienti = ingredienti;
    }

    /**
     * Getter per prendere il valore booleano containFrozenIngredients
     *
     * @return containFrozenIngredients
     */
    public boolean getContainFrozenIngredients() {
        return containFrozenIngredients;
    }

    /**
     * Getter per prendere il valore dolcezza
     *
     * @return dolcezza
     */
    public SapiditaEnum getDolcezza() {
        return dolcezza;
    }

    /**
     * Setter per impostare il valore dolcezza
     *
     * @param dolcezza
     */
    public void setDolcezza(SapiditaEnum dolcezza) {
        this.dolcezza = dolcezza;
    }

    /**
     * Getter per prendere il valore ingredienti
     *
     * @return ingredienti
     */
    public Set<IngredientiEnum> getIngredienti() {
        return ingredienti;
    }

    /**
     * Metodo che ritorna due stringhe differenti a seconda del caso che il valore sia true o false
     *
     * @return true -> "*may contain frozen ingredients", false -> "*fresh ingredients"
     **/
    public String infoFrozenIngredients() {
        if (containFrozenIngredients) {
            return "*may contain frozen ingredients";
        } else return "*fresh ingredients";
    }

    /**
     * Metodo che ritorna due stringhe differenti a seconda del caso che il valore sia true o false
     *
     * @return true -> "suitable for lactose intolerance", false -> "not suitable for lactose intolerance"
     */
    public String infoLactose() {
        if (isLactoseFree()) {
            return "suitable for lactose intolerance";
        } else return "not suitable for lactose intolerance";
    }

    /**
     * Metodo che ritorna due stringhe differenti a seconda del caso che il valore sia true o false
     *
     * @return true -> "suitable for gluten intolerance", false -> "not suitable for gluten intolerance"
     */
    public String infoGluten() {
        if (isGlutenFree()) {
            return "suitable fot gluten intolerance";
        } else return "not suitable for gluten intolerance";
    }

    /**
     * Metodo di stampa nel terminale ereditato dalla classe Portata che usa le stringhe ricavate dai metodi precedenti,
     * formatta, aggiunge qualche colore ai caratteri e gli sfondi ricavati dalla classe AnsiUtilityEnum.
     *
     * @override metodo printPortata della classe Portata
     */
    @Override
    public void printPortata() {
        System.out.println(ANSI_CYAN_BACKGROUND.getCodice() + ANSI_BLACK_CHARS.getCodice()
                + super.getName() + ": " + super.getPrice() + " " + ANSI_BRIGHT_YELLOW_BACKGROUND.getCodice()
                + "(" + infoLactose() + ", " + infoGluten() + ")." + ANSI_RESET.getCodice());
        System.out.println(ANSI_BRIGHT_WHITE_BACKGROUND.getCodice() + ANSI_BLACK_CHARS.getCodice()
                + "Ingredienti: " + getIngredienti() + " " + ANSI_WHITE_BACKGROUND.getCodice() + ANSI_ITALIC.getCodice()
                + infoFrozenIngredients() + ANSI_RESET.getCodice());
        System.out.println(ANSI_BRIGHT_GREEN_BACKGROUND.getCodice() + ANSI_BLACK_CHARS.getCodice()
                + "Livello di dolcezza: " + getDolcezza().getName().toUpperCase() + ANSI_RESET.getCodice() + "\n");

    }
}


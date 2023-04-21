package pietanze;

import pietanze.enumerati.IngredientiEnum;
import pietanze.enumerati.PortateEnum;
import pietanze.enumerati.SapiditaEnum;

import java.util.Set;

import static pietanze.enumerati.AnsiUtilityEnum.*;

/**
 * La classe Desserts crea un costruttore che è usato per istanziare tutti i desserts
 * con nome, prezzo, tutti gli ingredienti del piatto se esso contiene glutine e lattosio. Ha tre metodi che verranno poi
 * usati nel metodo di stampa per fornire tutte le informazioni necessarie per ogni piatto.
 *
 * @author "Stefano Devoti"
 */

public class Desserts extends Portata {
    private final boolean containFrozenIngredients;
    private final boolean glutenFree;
    private final boolean lactoseFree;
    private SapiditaEnum dolcezza;
    private Set<IngredientiEnum> ingredienti;

    /**
     * costruttore
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
     * getter e setter
     */

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public boolean isLactoseFree() {
        return lactoseFree;
    }

    public void setIngredienti(Set<IngredientiEnum> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public boolean isContainFrozenIngredients() {
        return containFrozenIngredients;
    }

    public SapiditaEnum getDolcezza() {
        return dolcezza;
    }

    public void setDolcezza(SapiditaEnum dolcezza) {
        this.dolcezza = dolcezza;
    }

    public Set<IngredientiEnum> getIngredienti() {
        return ingredienti;
    }

    /**
     * Metodi che verranno utilizzati nella stampa successiva
     **/

    public String getFrozenIngredients() {
        if (containFrozenIngredients) {
            return "*may contain frozen ingredients";
        } else return "*fresh ingredients";
    }

    public String infoLactose() {
        if (isLactoseFree()) {
            return "suitable for lactose intolerance";
        } else return "not suitable for lactose intolerance";
    }

    public String infoGluten() {
        if (isGlutenFree()) {
            return "suitable fot gluten intolerance";
        } else return "not suitable for gluten intolerance";
    }

    /* metodo di stampa che usa i metodi precedenti e aggiunge qualche colore*/
    @Override
    public void printPortata() {
        System.out.println(ANSI_CYAN_BACKGROUND.getColor() + ANSI_BLACK_CHARS.getColor()
                + super.getName() + ": " + super.getPrice()
                + ANSI_YELLOW_BACKGROUND.getColor() + " (" + infoLactose() + ", " + infoGluten() +
                ") " + ANSI_WHITE_BACKGROUND.getColor() + getFrozenIngredients() + ANSI_RESET.getColor());

    }
}


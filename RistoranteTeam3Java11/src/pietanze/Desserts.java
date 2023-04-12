package pietanze;

import java.util.Set;

import static pietanze.AnsiUtility.*;

/**
 * La classe Desserts crea un costruttore che è usato per istanziare tutti i desserts
 * con nome, prezzo, se ha glutine o lattosio, e ha due metodi void che si potranno usare
 * per stampare i solo i dessert con o senza lattosio o solo i dessert con o senza glutine
 *
 * @author "Stefano Devoti"
 */

public class Desserts extends Portata {
    private final boolean containFrozenIngredients;
    private Set<EnumIngredienti> ingredienti;

    //TODO livello di dolcezza? un emumerato?

    public Desserts(String name, double price, boolean containFrozenIngredients, Set<EnumIngredienti> ingredienti) {
        super(name, price, EnumPortate.DESSERT);
        this.containFrozenIngredients = containFrozenIngredients;
        this.ingredienti = ingredienti;
    }

    public Set<EnumIngredienti> getIngredienti() {
        return ingredienti;
    }

    public void setIngredienti(Set<EnumIngredienti> ingredienti) {
        this.ingredienti = ingredienti;
    }

    public boolean isContainFrozenIngredients() {
        return containFrozenIngredients;
    }

    /*public String cannotEat() {
        for (EnumIngredienti i : ingredienti) {
            if (i.getAllergen().contains("lactose")) {
                return "not suitable for lactose intolerant";
            } else if (i.getAllergen().contains("gluten")) {
                return "not suitable for gluten intolerant";
            } else if (i.getAllergen().contains("IgE")) {
                return ("not suitable for IgE intolerant");
            } else if (i.getAllergen().contains("lisozima")) {
                return ("not suitable for lisozima/eggs intolerant");
            }
        }
        return "";
    }*/

    //TODO come si chiama questo metodo? print o get? quindi che devo fare nel corpo stampare o ritornare un valore?

    public String getFrozenIngredients() {
        if (containFrozenIngredients) {
            return "*may contain frozen ingredients";
        } else {
            return "*fresh ingredients";
        }
    }

    @Override
    public void printPortata() {
        System.out.println(ANSI_CYAN_BACKGROUND + ANSI_BLACK_CHARS
                                   + super.getName() + ": " + super.getPrice() +
                                   " " + ANSI_YELLOW_BACKGROUND + "( " +
                                   // cannotEat() +
                                   " )" +
                                   " " + ANSI_WHITE_BACKGROUND + getFrozenIngredients() + ANSI_RESET);

    }
}


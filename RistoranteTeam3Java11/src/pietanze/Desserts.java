package pietanze;

import static pietanze.AnsiUtility.*;

/**
 * La classe Desserts crea un costruttore che è usato per istanziare tutti i desserts
 * con nome, prezzo, se ha glutine o lattosio, e ha due metodi che si potranno usare
 * per stampare solo i dessert con o senza lattosio o solo i dessert con o senza glutine
 *
 * @author "Stefano Devoti"
 */

public class Desserts extends Portata {

    private final boolean isLactoseFree;
    private final boolean isGlutenFree;
    private final boolean containFrozenIngredients;

    public Desserts(String name, double price, boolean isLactoseFree, boolean isGlutenFree, boolean containFrozenIngredients) {
        super(name, price, EnumPortate.DESSERT);
        this.isLactoseFree = isLactoseFree;
        this.isGlutenFree = isGlutenFree;
        this.containFrozenIngredients = containFrozenIngredients;
    }

    public boolean isLactoseFree() {
        return isLactoseFree;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public boolean isContainFrozenIngredients() {
        return containFrozenIngredients;
    }

    public String getLactoseDesserts() {
        if (isLactoseFree) {
            return "lactose free";
        } else {
            return "with lactose";
        }
    }

    public String getGlutenDesserts() {
        if (isGlutenFree) {
            return "gluten free";
        } else {
            return "with gluten";
        }
    }

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
                " " + ANSI_YELLOW_BACKGROUND + "(" + getLactoseDesserts() + ", " + getGlutenDesserts() + ")" +
                " " + ANSI_WHITE_BACKGROUND + getFrozenIngredients() + ANSI_RESET);
    }
}



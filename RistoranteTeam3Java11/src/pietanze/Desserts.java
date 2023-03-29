package pietanze;

/**
 * La classe Desserts crea un costruttore che è usato per istanziare tutti i desserts
 * con nome, prezzo, se ha glutine o lattosio, e ha due metodi void che si potranno usare
 * per stampare i solo i dessert con o senza lattosio o solo i dessert con o senza glutine
 *
 * @author "Stefano Devoti"
 */

public class Desserts extends Portata {

    //TODO Stefano mettici un po di iniziativa
    private final boolean isLactoseFree;
    private final boolean isGlutenFree;

    public Desserts(String name, double price, boolean isLactoseFree, boolean isGlutenFree) {
        super(name, price, PortateTypeEnum.DESSERT);
        this.isLactoseFree = isLactoseFree;
        this.isGlutenFree = isGlutenFree;
    }

    public String printLactoseDesserts() {
        if (isLactoseFree) {
            return "lactose free";
        } else {
            return "with lactose";
        }
    }

    public String printGlutenDesserts() {
        if (isGlutenFree) {
            return "gluten free";
        } else {
            return "with gluten";
        }
    }

    @Override
    public void printPortata() {
        System.out.println(getAnsiBlackChars() + getAnsiCyanBackground()
                + super.getName() + ": " + super.getPrice() +
                " (" + printLactoseDesserts() + ", " + printGlutenDesserts() + ")" +
                getAnsiReset());
    }
}



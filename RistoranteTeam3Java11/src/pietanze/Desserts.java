package pietanze;

/**
 * La classe Desserts crea un costruttore che è usato per istanziare tutti i desserts
 * con nome, prezzo, se ha glutine o lattasio, e ha 2 metodi void che si potrenno usare
 * per stampare i solo i dessert con o senza lattosio o solo i dessert con o senza glutine
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
    public void printLactoseDesserts() {
        if (isLactoseFree) {
            System.out.println("This dessert is lactose free");
        } else {
            System.out.println("This dessert is with lactose");
        }
    }
    public void printGlutenDesserts() {
        if (isGlutenFree) {
            System.out.println("This dessert is gluten free");
        } else {
            System.out.println("This dessert is with gluten");
        }
    }
    @Override
    public void printPortata() {
        super.printPortata();
    }
}



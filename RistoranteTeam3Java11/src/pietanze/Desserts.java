package pietanze;

/**
 * Bisogna creare due parametri per classe Desserts
 * ne avremmo uno per il nome e uno per il prezzo.
 *
 * a   questo punto creare il costruttore di questa classe
 * e allìinterno specificare i parametri che andremo a stanziare per questa classe.
 *
 * una volta fatto ciò dovremmo solo creare un costruttore vuoto ed implementare
 * i setter e i getter per le variabili stanziate in precedenza.
 */


public class Desserts extends Portata{
    private String name;
    private double price;

    public Desserts(String name, double price) {
        super(name, price);

    }


    public void printMenuDessert() {
        System.out.println(name + " - " + price);
    }

}

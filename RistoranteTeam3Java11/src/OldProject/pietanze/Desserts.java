package OldProject.pietanze;

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


public class Desserts  {
    private String name;
    private double price;

    public Desserts(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Desserts() {
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getName(String name) {
        this.name = name;
    }
    public void getPrice(double price){
        this.price = price;
    }

    public void printMenu() {
        System.out.println(name + " - " + price);
    }
    @Override
    public String toString() {
        return name + ":" + price;
    }
}

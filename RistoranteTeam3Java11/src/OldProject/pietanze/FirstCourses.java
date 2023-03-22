package OldProject.pietanze;

/**
 * Bisogna creare due parametri per classe First_Courses
 * ne avremmo uno per il nome e uno per il prezzo.
 *
 * a   questo punto creare il costruttore di questa classe
 * e allìinterno specificare i parametri che andremo a stanziare per questa classe.
 *
 * una volta fatto ciò dovremmo solo creare un costruttore vuoto ed implementare
 * i setter e i getter per le variabili stanziate in precedenza.
 */

    public class FirstCourses extends Portata{
        private String name;
        private double price;

    public FirstCourses(String name, double price) {
        super(name, price);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printPortata() {
        System.out.println(name + " - " + price );
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }

    //TODO da fare su tutte le classe
    public void printInfo() {
        System.out.println(this.name+ this.price);
    }
}



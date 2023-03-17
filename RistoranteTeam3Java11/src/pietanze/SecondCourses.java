package pietanze;

import java.net.PortUnreachableException;

/**
 * Bisogna creare due parametri per classe Second_Courses
 * ne avremmo uno per il nome e uno per il prezzo.
 *
 * a   questo punto creare il costruttore di questa classe
 * e allìinterno specificare i parametri che andremo a stanziare per questa classe.
 *
 * una volta fatto ciò dovremmo solo creare un costruttore vuoto ed implementare
 * i setter e i getter per le variabili stanziate in precedenza.
 */


public class SecondCourses extends Portata {


    public SecondCourses(String name, double price) {
        super(name, price);

    }

    public void printMenuSecondCourses() {
        System.out.println(super.getName() + " - " + super.getPrice());
    }
}

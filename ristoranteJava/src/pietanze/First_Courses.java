package pietanze;

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

    public class First_Courses {
        private String name;
        private double price;

        public First_Courses(String name, double price ) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " - " + price;
        }
    }



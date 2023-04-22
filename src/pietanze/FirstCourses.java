package pietanze;

import pietanze.enumerati.PortateEnum;

import static pietanze.enumerati.AnsiUtilityEnum.*;
/**
 * Elenco Proprietà:
 * Classe FirstCourses.
 * All'interno troviamo tutti i metodi che erdita dalla classe padre Portata.
 * Inserimento di getter e setter di default
 * Tramite questa classe possiamo creare istanze di tipo FirstCourses all'interno del main.
 * Fild esclusi.
 * </P>
 * @since 2023/04/22
 * @author Daniele Romani
 * @version 1.0
 * @see pietanze.Portata
 */
public class FirstCourses extends Portata {
    private boolean glutenFree;
    private double kCal;
    private double salePrice;
    /**
     * Elenco Proprietà Costruttore:
     * @constructor costruttore di default.
     * Richiamo il costruttore della Classe Extends Portata.
     *</P>
     * @param name - super della classe Portata,
     * @param price super della classe Portata,
     * @param glutenFree - Valore che fa riferimento alla presenza di glutine,
     *                     valore stanziato come Boolean.
     * @param kCal - valore che indica le Calorie di una portata,
     *               valore stanziato come double.
     * @param salePrice - Valore utilizzato per effettuare variazioni di prezzo,
     *                    Valore stanziato come double.
     */

    public FirstCourses(String name, double price, boolean glutenFree, double kCal, double salePrice) {
        super(name, price, PortateEnum.FIRST);
        this.glutenFree = glutenFree;
        this.kCal = kCal;
        this.salePrice = salePrice;
    }

    public boolean glutenFree() {
        return glutenFree;
    }

    public double kCal() {
        return kCal;
    }

    public double salePrice() {
        return salePrice;
    }

    /**
     * Elenco proprietà Getter:
     * </P>
     * Getter per restituire il valore glutenFree del Piatto.
     * </P>
     * @return glutenfree
     */
    public boolean getGlutenFree() {
        return glutenFree;
    }
    /**
     *  Elenco proprietà Getter:
     * </P>
     * Setter per impostare il valore glutenFree del Piatto.
     * </P>
     * @param glutenFree
     */
    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }
    /**
     * Elenco proprietà Getter:
     * </P>
     * Getter per restituire il valore kCal del Piatto.
     * </P>
     * @return kCal
     */
    public double getkCal() {
        return kCal;
    }
    /**
     * Elenco proprità Setter:
     * </P>
     * Setter per impostare il valore cKal del Piatto.
     * </P>
     * @param kCal
     */
    public void setkCal(double kCal) {
        this.kCal = kCal;
    }

    /**
     * Proprietà del Metodo glutenFree:
     * </P>
     * Il seguente metodo restituisce la presenza di glutine nel piatto.
     * </P>
     * Caso valore True:
     * @return you can eat this courses
     * </P>
     * Caso valore False:
     * @return You can't eat it. Request the GlutenFree product
     */
    public String printGlutenFree() {
        if (glutenFree == true) {
            return "You can eat this courses";
        } else {
            return "You can't eat it. Request the GlutenFree product";
        }
    }
    /**
     * Proprietà del Metodo kCal:
     * </P>
     * Il seguente metodo restituisce le calorie presenti nel piatto.
     * </P>
     * Caso valore inserito:
     * @return  "KCal for 100 gr: " + kCal;
     * </P>
     * Case valore sconosciuto:
     * @return "Not Important. Think about eating! ";
     */
    public String getKCal() {
        if (kCal >= 0) {
            return "KCal for 100 gr: " + kCal;
        } else {
            return "Not Important. Think about eating! ";
        }
    }
    /**
     * Proprietà del Metodo salePrice:
     * </P>
     * Il seguente metodo restituisce possibili variazioni dei prezzi attraverso dei volori double pre impostati.
     * </P>
     * Caso valore originario:
     * @return  return getPrice();
     * </P>
     * Case valore con supplemento:
     * @return getPrice() * 1.5;
     * </P>
     * Case valore scontato del 20%;
     * @return getPrice() * 0.8;
     */
    public double getSalePrice() {
        if (salePrice == 1) {
            return getPrice();
        } else if (salePrice == 1.5) {
            return getPrice() * 1.5; // add supplemento
        } else {
            return getPrice() * 0.8; // applica uno sconto del 20%;
        }
    }

    /**
     * Elenco Proprietà Metodo Override di Stampa:
     * </P>
     * PrintPortata è un metodo che la classe FirstCourses eredita dalla classe Portata,
     *</P>
     * Il metodo richiama, per una questione di 'leggibilità ed estetica', delle Stringhe speciali dalla classe enum AnsiUtility,
     * rendendo colorato l'output in terminale.
     *</p>
     * @override metodo printPortata classe pietanze.Portata.
     */
    @Override
    public void printPortata() {
        System.out.println( ANSI_GREEN_BACKGROUND.getColor() + ANSI_BLACK_CHARS.getColor()
                + super.getName() + ": " + super.getPrice() + "€ " + " - "
                + ANSI_WHITE_BACKGROUND.getColor() + printGlutenFree() + " - "
                + ANSI_RED_BACKGROUND.getColor() + "(" + getKCal() + ")" + " - "
                + ANSI_PURPLE_BACKGROUND.getColor() + getSalePrice() + "€ "
                + ANSI_RESET.getColor());
    }

}



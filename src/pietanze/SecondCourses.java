package pietanze;


import pietanze.enumerati.PortateEnum;

import static pietanze.enumerati.AnsiUtilityEnum.*;

/**
 * Classe SecondCourses dove troviamo i metodi ereditati dalla classe Portata, presenti i getter and setter.
 * Tramite questi parametri. Creiamo nel main oggetti di tipo SecondCourses.
 * Inseriti nel printPortata valori enum per il colore dei caratteri.
 *
 * @author Giovanni Mauro
 * @version 1.0
 * @see pietanze.Portata
 *
 */
public class SecondCourses extends Portata {

    /**
     * Questo è il corpo della classe SecondCourses:
     *
     * @param name The name of the portata
     * @param price The price of the portata
     * @param highProteinValueParameter the value of the protein contained in the portata
     *
     * @return Ritorna una stringa contenente nome - prezzo - proteinValue
     */
    private boolean highProteinValue;

    public SecondCourses(String name, double price, boolean highProteinValueParameter) {
        super(name, price, PortateEnum.SECOND);
        this.highProteinValue = highProteinValueParameter;
    }

    public boolean isHighProteinValue() {
        return highProteinValue;
    }

    public void setHighProteinValue(boolean highProteinValueParameter) {
        highProteinValue = highProteinValueParameter;
    }

    /**
     *  Prendendo un valore booleano come input, restituisce "Contains more than 20gr of protein per 100gr"
     *      * se True o "Contains less than 20gr of protein per 100gr" se falso
     * @return una stringa se contiene più o meno di 20gr di proteine
     */
    public String returnProteinValue() {
        if (highProteinValue) {
            return "Contains more than 20gr of protein per 100gr";
        } else {
            return "Contains less than 20gr of protein per 100gr";
        }
    }

    /**
     * Il metodo di stampa della portata
     * @return Portata
     */
    @Override
    public void printPortata() {
        System.out.println(ANSI_CYAN_BACKGROUND.getCodice() + ANSI_BLACK_CHARS.getCodice()
                + super.getName() + ": " + super.getPrice() + " " + ANSI_PURPLE_BACKGROUND.getCodice() +
                "(" + returnProteinValue() + ")" +
                ANSI_RESET.getCodice());
    }
}

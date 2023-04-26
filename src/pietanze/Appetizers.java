package pietanze;

import pietanze.enumerati.PortateEnum;
import pietanze.interfacce.KmZeroInterface;

import static pietanze.enumerati.AnsiUtilityEnum.*;

/**
 * La classe appetizers, che eredita la classe Portata e che implementa KmZeroInterface,possiede tre parametri,
 * un costruttore, i setter ed i getter ed un metodo.
 * @author Kristian
 */

public class Appetizers extends Portata implements KmZeroInterface {

    private double weightAppetizerKg;
    private boolean canExplode;
    private int distanceFromOrigin;

    /**
     * Costruttore
     * @param name ->nome del piatto
     * @param price -> prezzo
     * @param weightAppetizerKg ->peso in chilogrammi dell'antipasto
     * @param canExplode -> possibilità di esplodere (con te) duranto il pasto
     * @param distanceFromOrigin -> distanza dalla provenienza degli ingredienti
     */
    public Appetizers(String name, double price, double weightAppetizerKg, boolean canExplode, int distanceFromOrigin) {
        super(name, price, PortateEnum.APPETIZERS);
        this.weightAppetizerKg = weightAppetizerKg;
        this.canExplode = canExplode;
        this.distanceFromOrigin = distanceFromOrigin;
    }

    /**
     * getter e setter dei parametri
     */
    public boolean getCanExplode() {
        return canExplode;
    }

    public void setWeightAppetizerKg(double weightAppetizerKg) {
        this.weightAppetizerKg = weightAppetizerKg;
    }

    public void setCanExplode(boolean canExplode) {
        this.canExplode = canExplode;
    }

    public double getWeightAppetizerKg() {
        return weightAppetizerKg;
    }

    public int getDistanceFromOrigin() {
        return distanceFromOrigin;
    }

    public void setDistanceFromOrigin(int distanceFromOrigin) {
        this.distanceFromOrigin = distanceFromOrigin;
    }

    /**
     * metodo che si basa sul boolean canExplode
     * @return una stringa che varia a seconda di canExplode
     */
    public String isExplosive() {
        if (canExplode) {
            return "This can be your last meal. No pressure";
        } else {
            return "No explosive agents found here";
        }
    }
//    public double totalWeight(){
//        return weightAppetizerKg;
//    }

    /**
     * metodo ereditato da Portata che serve a stampare il menù utilizzando i colori
     */


    @Override
    public void printPortata() {
        System.out.println(ANSI_GREEN_BACKGROUND.getColor() + ANSI_BLACK_CHARS.getColor()
                + super.getName() + ": " + super.getPrice() + "€ " + " - "
                + ANSI_WHITE_BACKGROUND.getColor() + getWeightAppetizerKg() + " - "
                + ANSI_RED_BACKGROUND.getColor() + "(" + isExplosive() + ")" + " - "
                + ANSI_BLUE_BACKGROUND.getColor() + "(" + origin() + ")" + " - "
                + ANSI_RESET.getColor());
    }

    /**
     * metodo implementato con KmZeroInterface
     * @return una stringa diversa a seconda di DistanceFromOrigin
     */

    @Override
    public String origin() {
        if (distanceFromOrigin < 50) {
            return "This appetizer is km0";
        } else
            return "This appetizer is not km0";
    }
}

package pietanze;

import pietanze.enumerati.EnumPortate;

import static pietanze.enumerati.AnsiUtility.*;

public class Appetizers extends Portata implements KmZeroInterface {

    private double weightAppetizerKg;
    private boolean canExplode;
    private int distanceFromOrigin;

    public Appetizers(String name, double price, double weightAppetizerKg, boolean canExplode, int distanceFromOrigin) {
        super(name, price, EnumPortate.APPETIZERS);
        this.weightAppetizerKg = weightAppetizerKg;
        this.canExplode = canExplode;
        this.distanceFromOrigin = distanceFromOrigin;
    }

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

    @Override
    public void printPortata() {
        System.out.println(ANSI_GREEN_BACKGROUND.getColor() + ANSI_BLACK_CHARS.getColor()
                + super.getName() + ": " + super.getPrice() + "€ " + " - "
                + ANSI_WHITE_BACKGROUND.getColor() + getWeightAppetizerKg() + " - "
                + ANSI_RED_BACKGROUND.getColor() + "(" + isExplosive() + ")" + " - "
                + ANSI_BLUE_BACKGROUND.getColor() + "(" + origin() + ")" + " - "
                + ANSI_RESET.getColor());
    }

    @Override
    public String origin() {
        if (distanceFromOrigin < 50) {
            return "This appetizer is km0";
        } else
            return "This appetizer is not km0";
    }
}

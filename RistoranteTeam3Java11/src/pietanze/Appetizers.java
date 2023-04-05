package pietanze;

import static pietanze.AnsiUtility.*;
import static pietanze.AnsiUtility.ANSI_RESET;

public class Appetizers extends Portata{

    private double weightAppetizerKg;
    private boolean canExplode;
    public Appetizers(String name, double price,double weightAppetizerKg,boolean canExplode) {
        super(name, price, EnumPortate.APPETIZERS);
        this.weightAppetizerKg = weightAppetizerKg;
        this.canExplode= canExplode;
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

    public String isExplosive() {
        if(canExplode){
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
        System.out.println( ANSI_GREEN_BACKGROUND + ANSI_BLACK_CHARS
                + super.getName() + ": " + super.getPrice() + "€ " + " - "
                + ANSI_WHITE_BACKGROUND + getWeightAppetizerKg() + " - "
                + ANSI_RED_BACKGROUND + "(" + isExplosive() + ")" + " - "
                + ANSI_RESET);
    }
}

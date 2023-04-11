package pietanze;

import java.util.List;
import java.util.Scanner;

import static pietanze.AnsiUtility.*;
import static pietanze.AnsiUtility.ANSI_RESET;

public class FirstCourses extends Portata {
    private boolean glutenFree;
    private double kCal;
    private double salePrice;

    public FirstCourses(String name, double price, boolean glutenFree, double kCal, double salePrice) {
        super(name, price, EnumPortate.FIRST);
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

    // Getter and Setter
    public boolean getGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public double getkCal() {
        return kCal;
    }

    public void setkCal(double kCal) {
        this.kCal = kCal;
    }

    // Metodi
    public String printGlutenFree() {
        if (glutenFree == true) {
            return "You can eat this courses";
        } else {
            return "You can't eat it. Request the GlutenFree product";
        }
    }

    public String getKCal() {
        if (kCal >= 0) {
            return "KCal for 100 gr: " + kCal;
        } else {
            return "Not Important. Think about eating!g ";
        }
    }
    public double getSalePrice() {
        if (salePrice == 1) {
            return getPrice();
        } else if (salePrice == 1.5) {
            return getPrice() * 1.5; // add supplemento
        } else {
            return getPrice() * 0.8; // applica uno sconto del 20%;
        }
    }

    // Metodo di stampa
    @Override
    public void printPortata() {
        System.out.println( ANSI_GREEN_BACKGROUND + ANSI_BLACK_CHARS
                + super.getName() + ": " + super.getPrice() + "€ " + " - "
                + ANSI_WHITE_BACKGROUND + printGlutenFree() + " - "
                + ANSI_RED_BACKGROUND + "(" + getKCal() + ")" + " - "
                + ANSI_PURPLE_BACKGROUND + getSalePrice() + "€ "
                + ANSI_RESET);
    }

}



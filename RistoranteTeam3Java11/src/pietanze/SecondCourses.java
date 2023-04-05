package pietanze;

import static pietanze.AnsiUtility.*;

public class SecondCourses extends Portata {

    private boolean highProteinValue;
    public SecondCourses(String name, double price, boolean highProteinValueParameter) {
        super(name, price, EnumPortate.SECOND);
        this.highProteinValue = highProteinValueParameter;
    }

    public boolean isHighProteinValue() {
        return highProteinValue;
    }

    public void setHighProteinValue(boolean highProteinValueParameter) {
        highProteinValue = highProteinValueParameter;
    }

    public String returnProteinValue() {
        if (highProteinValue) {
            return "Contains more than 20gr of protein per 100gr";
        } else {
            return "Contains less than 20gr of protein per 100gr";
        }
    }

    @Override
    public void printPortata() {
        System.out.println(ANSI_CYAN_BACKGROUND + ANSI_BLACK_CHARS
                + super.getName() + ": " + super.getPrice() + " " + ANSI_PURPLE_BACKGROUND +
                "(" + returnProteinValue() + ")" +
                ANSI_RESET);
    }
}

package pietanze;

import static pietanze.AnsiUtility.*;

public class SecondCourses extends Portata {

    private boolean HighProteinValue;
    public SecondCourses(String name, double price, boolean HighProteinValue) {
        super(name, price, EnumPortate.SECOND);
        this.HighProteinValue = HighProteinValue;
    }

    public boolean isHighProteinValue() {
        return HighProteinValue;
    }

    public void setHighProteinValue(boolean highProteinValue) {
        HighProteinValue = highProteinValue;
    }

    public String printProteinValue() {
        if (HighProteinValue) {
            return "Contains more than 20gr of protein per 100gr";
        } else {
            return "Contains less than 20gr of protein per 100gr";
        }
    }

    @Override
    public void printPortata() {
        System.out.println(ANSI_CYAN_BACKGROUND + ANSI_BLACK_CHARS
                + super.getName() + ": " + super.getPrice() +
                " (" + printProteinValue() + ")" +
                ANSI_RESET);
    }
}

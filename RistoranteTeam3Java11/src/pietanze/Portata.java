package pietanze;

public class Portata {
    
    //TODO classe utility
    private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    private static final String ANSI_BLACK_CHARS = "\u001B[30m";
    private static final String ANSI_RESET = "\u001B[0m";
    
    private String name;
    private double price;
    private PortateTypeEnum type;
    
    public Portata(String name, double price, PortateTypeEnum type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    public PortateTypeEnum getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public static String getAnsiCyanBackground() {
        return ANSI_CYAN_BACKGROUND;
    }
    
    public static String getAnsiReset() {
        return ANSI_RESET;
    }

    //TODO facciamo una classe utility o un enumerato per gli Ansi
    public static String getAnsiBlackChars() {
        return ANSI_BLACK_CHARS;
    }
    
    public void printPortata() {
        System.out.println(ANSI_BLACK_CHARS + ANSI_CYAN_BACKGROUND + name + " - " + price + ANSI_RESET);
    }
}





















/*

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m"
    private static final String ANSI_BLACK_CHARS = "\u001B[30m";
*/



package pietanze.enumerati;

public enum AnsiUtility {

    ANSI_BLACK_BACKGROUND("\u001B[40m", "sfondo nero"),
    ANSI_RED_BACKGROUND("\u001B[41m", "sfondo rosso"),
    ANSI_GREEN_BACKGROUND("\u001B[42m", "sfondo verde"),
    ANSI_YELLOW_BACKGROUND("\u001B[43m", "sfondo giallo"),
    ANSI_BLUE_BACKGROUND("\u001B[44m", "sfondo blue"),
    ANSI_PURPLE_BACKGROUND("\u001B[45m", "sfondo viola"),
    ANSI_CYAN_BACKGROUND("\u001B[46m", "sfondo azzurro"),
    ANSI_WHITE_BACKGROUND("\u001B[47m", "sfondo grigio/bianco"),
    ANSI_BLACK_CHARS("\u001B[30m", "caratteri neri"),
    ANSI_RESET("\u001B[0m", "resetta tutto/fine");
    private String color;
    private String description;

    AnsiUtility(String color, String description) {
        this.color = color;
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

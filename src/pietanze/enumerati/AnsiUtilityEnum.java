package pietanze.enumerati;

/**
 * @author Stefano Devoti
 */

public enum AnsiUtilityEnum {
    //Sfondi
    ANSI_BLACK_BACKGROUND("\u001B[40m", "sfondo nero"),
    ANSI_RED_BACKGROUND("\u001B[41m", "sfondo rosso"),
    ANSI_GREEN_BACKGROUND("\u001B[42m", "sfondo verde"),
    ANSI_YELLOW_BACKGROUND("\u001B[43m", "sfondo giallo"),
    ANSI_BLUE_BACKGROUND("\u001B[44m", "sfondo blue"),
    ANSI_PURPLE_BACKGROUND("\u001B[45m", "sfondo viola"),
    ANSI_CYAN_BACKGROUND("\u001B[46m", "sfondo azzurro"),
    ANSI_WHITE_BACKGROUND("\u001B[47m", "sfondo grigio/bianco"),
    ANSI_BRIGHT_BLACK_BACKGROUND("\u001B[100m", "sfondo nero chiaro"),
    ANSI_BRIGHT_RED_BACKGROUND("\u001B[101m", "sfondo rosso chiaro"),
    ANSI_BRIGHT_GREEN_BACKGROUND("\u001B[102m", "sfondo verde chiaro"),
    ANSI_BRIGHT_YELLOW_BACKGROUN("\u001B[103m", "sfondo giallo chiaro"),
    ANSI_BRIGHT_BLUE_BACKGROUND("\u001B[104m", "sfondo blue chiaro"),
    ANSI_BRIGHT_PURPLE_BACKGROUND("\u001B[105m", "sfondo viola chiaro"),
    ANSI_BRIGHT_CYAN_BACKGROUND("\u001B[106m", "sfondo azzurro chiaro"),
    ANSI_BRIGHT_WHITE_BACKGROUND("\u001B[107m", "sfondo bianco chiaro"),

    //Stile caratteri
    ANSI_BLACK_CHARS("\u001B[30m", "caratteri neri"),
    ANSI_BOLD("\u001B[1m", "grassetto"),
    ANSI_UNDERLINE("\u001B[4m", "sottolineato"),
    ANSI_ITALIC("\u001B[3m", "corsivo"),
    ANSI_REVERSE("\u001B[7m", "scritto dall'inizio alla fine"),
    ANSI_STRIKETHROUGH("\u001B[9m", "barrato"),

    // modificatori di stato
    ANSI_RESET("\u001B[0m", "resetta tutto/fine"),

    // colori caratteri
    ANSI_BLACK("\u001B[30m", "colore nero"),
    ANSI_RED("\u001B[31m", "rosso"),
    ANSI_GREEN("\u001B[32m", "verde"),
    ANSI_YELLOW("\u001B[33m", "giallo"),
    ANSI_BLUE("\u001B[34m", "blues"),
    ANSI_PURPLE("\u001B[35m", "viola"),
    ANSI_CYAN("\u001B[36m", "azzuro"),
    ANSI_WHITE("\u001B[37m", "bianco"),
    ANSI_BRIGHT_BLACK("\u001B[90m", "nero chiaro"),
    ANSI_BRIGHT_RED("\u001B[91m", "rosso chiaro"),
    ANSI_BRIGHT_GREEN("\u001B[92m", "verde chiaro"),
    ANSI_BRIGHT_YELLOW("\u001B[93m", "giallo chiaro"),
    ANSI_BRIGHT_BLUE("\u001B[94m", "blu chiaro"),
    ANSI_BRIGHT_PURPLE("\u001B[95m", "viola chiaro"),
    ANSI_BRIGHT_CYAN("\u001B[96m", "azzurro chiaro"),
    ANSI_BRIGHT_WHITE("\u001B[97m", "bianco chiaro"),

    // Cursor Movement
//    ANSI_CURSOR_UP = "\u001B[%dA";
//    ANSI_CURSOR_DOWN = "\u001B[%dB";
//    ANSI_CURSOR_FORWARD = "\u001B[%dC";
//    ANSI_CURSOR_BACKWARD = "\u001B[%dD";
//    ANSI_CURSOR_POSITION = "\u001B[%d;%dH";
//    ANSI_ERASE_LINE = "\u001B[2K";
//    ANSI_ERASE_SCREEN = "\u001B[2J";
//    ANSI_SAVE_CURSOR_POSITION = "\u001B[s";
//    ANSI_RESTORE_CURSOR_POSITION = "\u001B[u";

    //emoji
    emoji_smiling_heart_eyes("\uD83D\uDE0D", ""),
    emoji_blowing_kiss("\uD83D\uDE18", ""),
    emoji_thumbs_up("\uD83D\uDC4D", ""),
    emoji_clapping_hands("\uD83D\uDC4F", ""),
    emoji_face_with_tears_of_joy("\uD83D\uDE02", ""),
    emoji_rolling_on_floor_laughing("\uD83E\uDD23", ""),
    emoji_ok_hand("\uD83D\uDC4C", ""),
    emoji_fire("\uD83D\uDD25", ""),
    emoji_party_popper("\uD83C\uDF89", ""),
    emoji_red_heart("\uD83D\uDC9E", ""),
    emoji_sparkles("✨", ""),
    emoji_smiling_sunglasses("\uD83D\uDE0E", ""),
    emoji_rocket("\uD83D\uDE80", ""),
    emoji_money_bag("\uD83D\uDCB0", ""),
    emoji_wrapped_gift("\uD83C\uDF81", ""),
    emoji_globe_meridians("\uD83C\uDF10", ""),
    emoji_smiling_smiling_eyes("\uD83D\uDE04", ""),
    emoji_loudly_crying_face("\uD83D\uDE2D", ""),
    emoji_beer_mug("\uD83C\uDF7A", ""),
    emoji_hamburger("\uD83C\uDF54", ""),
    emoji_pizza("\uD83C\uDF55", ""),
    emoji_tada("\uD83C\uDF89", ""),
    emoji_see_no_evil_monkey("\uD83D\uDE48", ""),
    emoji_hear_no_evil_monkey("\uD83D\uDE49", ""),
    emoji_speak_no_evil_monkey("\uD83D\uDE4A", ""),

    //emoji tema cibo
    EMOJI_PIZZA("\uD83C\uDF55", "pizza"),
    EMOJI_BURGER("\uD83C\uDF54", "burger"),
    EMOJI_TACO("\uD83C\uDF2E", "taco"),
    EMOJI_SUSHI("\uD83C\uDF63", "sushi"),
    EMOJI_SPAGHETTI("\uD83C\uDF5D", "spaghetti"),
    EMOJI_ICE_CREAM("\uD83C\uDF68", "gelato"),
    EMOJI_CAKE("\uD83C\uDF70", "torta"),
    EMOJI_COFFEE("☕", "caffè"),
    EMOJI_TEA("\uD83C\uDF75", "te"),
    EMOJI_BEER("\uD83C\uDF7A", "birra"),
    EMOJI_WINE("\uD83C\uDF77", "vinooooo"),

    // Questo invece usa gli RGB
    ANSI_DESCRIPTION_COLOR_AND_BACKGROUND("\033[38;2;248;244;227;48;2;29;10;28m", "RAINBOWWW");

    private String codice;
    private String description;

    AnsiUtilityEnum(String codice, String description) {
        this.codice = codice;
        this.description = description;
    }

    public String getColor() {
        return codice;
    }

    public void setColor(String color) {
        this.codice = codice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

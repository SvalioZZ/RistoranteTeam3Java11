package pietanze.enumerati;

public enum AnsiUtilityEnum {

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

    AnsiUtilityEnum(String color, String description) {
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
    
    //TODO: qualcosa che vorrei implementare qui dentro :
    
    /*
    // Modifiers
private static final String ANSI_RESET = "\u001B[0m";
private static final String ANSI_BOLD = "\u001B[1m";
private static final String ANSI_UNDERLINE = "\u001B[4m";
private static final String ANSI_ITALIC = "\u001B[3m";
private static final String ANSI_REVERSE = "\u001B[7m";
private static final String ANSI_STRIKETHROUGH = "\u001B[9m";

// Colors
private static final String ANSI_BLACK = "\u001B[30m";
private static final String ANSI_RED = "\u001B[31m";
private static final String ANSI_GREEN = "\u001B[32m";
private static final String ANSI_YELLOW = "\u001B[33m";
private static final String ANSI_BLUE = "\u001B[34m";
private static final String ANSI_PURPLE = "\u001B[35m";
private static final String ANSI_CYAN = "\u001B[36m";
private static final String ANSI_WHITE = "\u001B[37m";
private static final String ANSI_BRIGHT_BLACK = "\u001B[90m";
private static final String ANSI_BRIGHT_RED = "\u001B[91m";
private static final String ANSI_BRIGHT_GREEN = "\u001B[92m";
private static final String ANSI_BRIGHT_YELLOW = "\u001B[93m";
private static final String ANSI_BRIGHT_BLUE = "\u001B[94m";
private static final String ANSI_BRIGHT_PURPLE = "\u001B[95m";
private static final String ANSI_BRIGHT_CYAN = "\u001B[96m";
private static final String ANSI_BRIGHT_WHITE = "\u001B[97m";
// Background Colors
private static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
private static final String ANSI_RED_BACKGROUND = "\u001B[41m";
private static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
private static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
private static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
private static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
private static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
private static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
private static final String ANSI_BRIGHT_BLACK_BACKGROUND = "\u001B[100m";
private static final String ANSI_BRIGHT_RED_BACKGROUND = "\u001B[101m";
private static final String ANSI_BRIGHT_GREEN_BACKGROUND = "\u001B[102m";
private static final String ANSI_BRIGHT_YELLOW_BACKGROUND = "\u001B[103m";
private static final String ANSI_BRIGHT_BLUE_BACKGROUND = "\u001B[104m";
private static final String ANSI_BRIGHT_PURPLE_BACKGROUND = "\u001B[105m";
private static final String ANSI_BRIGHT_CYAN_BACKGROUND = "\u001B[106m";
private static final String ANSI_BRIGHT_WHITE_BACKGROUND = "\u001B[107m";

// Cursor Movement
private static final String ANSI_CURSOR_UP = "\u001B[%dA";
private static final String ANSI_CURSOR_DOWN = "\u001B[%dB";
private static final String ANSI_CURSOR_FORWARD = "\u001B[%dC";
private static final String ANSI_CURSOR_BACKWARD = "\u001B[%dD";
private static final String ANSI_CURSOR_POSITION = "\u001B[%d;%dH";
private static final String ANSI_ERASE_LINE = "\u001B[2K";
private static final String ANSI_ERASE_SCREEN = "\u001B[2J";
private static final String ANSI_SAVE_CURSOR_POSITION = "\u001B[s";
private static final String ANSI_RESTORE_CURSOR_POSITION = "\u001B[u";
String emoji_smiling_heart_eyes = "\uD83D\uDE0D";
String emoji_blowing_kiss = "\uD83D\uDE18";
String emoji_thumbs_up = "\uD83D\uDC4D";
String emoji_clapping_hands = "\uD83D\uDC4F";
String emoji_face_with_tears_of_joy = "\uD83D\uDE02";
String emoji_rolling_on_floor_laughing = "\uD83E\uDD23";
String emoji_ok_hand = "\uD83D\uDC4C";
String emoji_fire = "\uD83D\uDD25";
String emoji_party_popper = "\uD83C\uDF89";
String emoji_red_heart = "\uD83D\uDC9E";
String emoji_sparkles = "\u2728";
String emoji_smiling_sunglasses = "\uD83D\uDE0E";
String emoji_rocket = "\uD83D\uDE80";
String emoji_money_bag = "\uD83D\uDCB0";
String emoji_wrapped_gift = "\uD83C\uDF81";
String emoji_globe_meridians = "\uD83C\uDF10";
String emoji_smiling_smiling_eyes = "\uD83D\uDE04";
String emoji_loudly_crying_face = "\uD83D\uDE2D";
String emoji_beer_mug = "\uD83C\uDF7A";
String emoji_hamburger = "\uD83C\uDF54";
String emoji_pizza = "\uD83C\uDF55";
String emoji_tada = "\uD83C\uDF89";
String emoji_see_no_evil_monkey = "\uD83D\uDE48";
String emoji_hear_no_evil_monkey = "\uD83D\uDE49";
String emoji_speak_no_evil_monkey = "\uD83D\uDE4A";

//FOOD
private static final String EMOJI_PIZZA = "\uD83C\uDF55";
private static final String EMOJI_BURGER = "\uD83C\uDF54";
private static final String EMOJI_TACO = "\uD83C\uDF2E";
private static final String EMOJI_SUSHI = "\uD83C\uDF63";
private static final String EMOJI_SPAGHETTI = "\uD83C\uDF5D";
private static final String EMOJI_ICE_CREAM = "\uD83C\uDF68";
private static final String EMOJI_CAKE = "\uD83C\uDF70";
private static final String EMOJI_COFFEE = "\u2615";
private static final String EMOJI_TEA = "\uD83C\uDF75";
private static final String EMOJI_BEER = "\uD83C\uDF7A";
private static final String EMOJI_WINE = "\uD83C\uDF77";
Questo invece usa gli RGB
private final String ANSI_DESCRIPTION_COLOR_AND_BACKGROUND = "\033[38;2;248;244;227;48;2;29;10;28m";
     */
}

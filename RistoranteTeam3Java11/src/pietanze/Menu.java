package pietanze;

import java.util.ArrayList;
import java.util.List;

import static jdk.jfr.internal.EventWriterKey.getKey;

public class Menu {
    
    //TODO inserire nome tipo(enumerato: vegano ,carn, vegetariano), lista portate, prezzo medio
    
    private List<Portata> portataList;
    private String name;
    private TypeEnumMenu type;
    
    public Menu(String nome, TypeEnumMenu type) {
        
        this.name = nome;
        this.type = type;
        portataList = new ArrayList<>();
        
    }
    
    /*@Override
    public String toString() {
        return "\n*** " + type.getNome() + " ***" + "\n" + " Type of the Menu: " + getType() + "\n";
    }*/
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public TypeEnumMenu getType() {
        return type;
    }
    
    public void setType(TypeEnumMenu type) {
        this.type = type;
    }
    
    public void addPortata(Portata portata) {
        portataList.add(portata);
    }
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private static final String ANSI_BLACK_CHARS = "\u001B[30m";
    private static final String ANSI_RESET = "\u001B[0m";
    
    public void printInfoMenu() {
        System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_BLACK_CHARS + "***" + this.getName() +
                                   "***" + ANSI_RESET + "\n" + ANSI_PURPLE_BACKGROUND + ANSI_BLACK_CHARS +
                                   "Type of the Menu: " + this.getType() + ANSI_RESET);
    }
    
    
    public void printPortata() {

        int prec = 0;
        for (Portata portata : portataList) {
            switch (portata.getType().getKey()){
                case 1:
                        if (prec != portata.getType().getKey()){
                            System.out.println("\n" +PortateTypeEnum.BEVERAGES.getNome());
                        } break;
                case 2:
                    if (prec != portata.getType().getKey()) {
                    System.out.println("\n" +PortateTypeEnum.APPETIZERS.getNome());
                } break;
                case 3:
                    if (prec != portata.getType().getKey()) {
                        System.out.println("\n" +PortateTypeEnum.FIRST.getNome());
                    } break;
                case 4:
                    if (prec != portata.getType().getKey()) {
                    System.out.println("\n" +PortateTypeEnum.SECOND.getNome());
                    } break;
                case 5:
                    if (prec != portata.getType().getKey()){
                        System.out.println("\n" + PortateTypeEnum.DESSERT.getNome());
                    } break;
            }
            portata.printMenuPortata();
            prec = portata.getType().getKey();

        }
    }
}
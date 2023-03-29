package pietanze;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    
    //TODO inserire nome tipo(enumerato: vegano ,carn, vegetariano), lista portate, prezzo medio
    
    private List<Portata> portataList;
    private String name;
    private TypeEnumMenu type;
    
    public Menu(String nome, TypeEnumMenu type) {
        
        this.name = nome;
        this.type = type;
        this.portataList = new ArrayList<>();
        
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
    
    //TODO pensiamo come poter
    public void printPortata() {

        System.out.println("\n" +PortateTypeEnum.BEVERAGES.getNome());
        for (Portata portata : portataList) {
            if (portata.getType() == PortateTypeEnum.BEVERAGES){
                portata.printPortata();
            }
        }
        System.out.println("\n" +PortateTypeEnum.APPETIZERS.getNome());
        for (Portata portata : portataList) {
            if (portata.getType() == PortateTypeEnum.APPETIZERS){
                portata.printPortata();
            }
        }
        System.out.println("\n" +PortateTypeEnum.DESSERT.getNome());
        for (Portata portata : portataList) {
            if (portata.getType() == PortateTypeEnum.DESSERT){
                portata.printPortata();
            }
        }




    }
}
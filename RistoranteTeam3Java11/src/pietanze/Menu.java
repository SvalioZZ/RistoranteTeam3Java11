package pietanze;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static pietanze.AnsiUtility.*;

public class Menu {
    
    private List<Portata> portataList;
    private String name;
    private MenuType type;
    
    public Menu(String nome, MenuType type) {
        
        this.name = nome;
        this.type = type;
        this.portataList = new ArrayList<>();
        
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public MenuType getType() {
        return type;
    }
    
    public void setType(MenuType type) {
        this.type = type;
    }
    
    public void addPortata(Portata portata) {
        portataList.add(portata);
    }
    
    public void printInfoMenu() {
        System.out.println(ANSI_PURPLE_BACKGROUND + ANSI_BLACK_CHARS + "***" + this.getName() +
                                   "***" + ANSI_RESET + "\n" + ANSI_PURPLE_BACKGROUND + ANSI_BLACK_CHARS +
                                   "Type of the Menu: " + this.getType() + ANSI_RESET);
    }
    
    //TODO pensiamo come poter
    public void printMenu() {
        portataList.sort(Comparator.comparing(Portata::getType));
        EnumPortate currentType = null;
        for (Portata portata : portataList) {
            if (portata.getType() != currentType) {
                System.out.println("\n" + portata.getType().getNome());
                currentType = portata.getType();
            }
            portata.printPortata();
        }
        
        
    }
}
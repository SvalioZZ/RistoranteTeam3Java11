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
        portataList = new ArrayList<>();

    }
    @Override
    public String toString() {
        return "\n" +getName() + " Type: " + getType() + "\n";
    }
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

    public void printPortata() {
        for (Portata portata : portataList) {
            portata.printMenuPortata();
        }
    }
}
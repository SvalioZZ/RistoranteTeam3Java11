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

    public void addPortata(Portata portata) {
        portataList.add(portata);
    }

    public void printPortata() {
        for (Portata portata : portataList) {
            portata.printMenuPortata();
        }
    }
}
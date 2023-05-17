package pietanze;

import pietanze.enumerati.PortateEnum;
import pietanze.enumerati.TypeEnum;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static pietanze.enumerati.AnsiUtilityEnum.*;

public class Menu {

    //TODO menù del giorno o la portata dello cuoco
    private List<Portata> portataList;
    private String name;
    private TypeEnum type;

    public Menu(String nome, TypeEnum type) {

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

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public void addPortata(Portata portata) {
        //TODO qui fare la chiamata che aggiunge al database
        //if(portata.getType().equals(PortateEnum.FIRST)){
            //firstCoursesDAO.insert((FirstCourses)portata);
        //}
        portataList.add(portata);
    }

    public void printInfoMenu() {
        System.out.println(ANSI_PURPLE_BACKGROUND.getCodice() + ANSI_BLACK_CHARS.getCodice() + "***" + this.getName() +
                                   "***" + ANSI_RESET.getCodice() + "\n" + ANSI_PURPLE_BACKGROUND.getCodice() + ANSI_BLACK_CHARS.getCodice() +
                                   "Type of the Menu: " + this.getType() + ANSI_RESET.getCodice());
    }
    public void printMenu() {
        portataList.sort(Comparator.comparing(Portata::getType));
        PortateEnum currentType = null;
        for (Portata portata : portataList) {
            if (portata.getType() != currentType) {
                System.out.println("\n" + portata.getType().getNome());
                currentType = portata.getType();
            }
            portata.printPortata();
        }
    }
}
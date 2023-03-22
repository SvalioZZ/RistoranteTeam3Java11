package OldProject.pietanze;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    //TODO inserire nome tipo(enumerato: vegano ,carn, vegetariano), lista portate, prezzo medio

    private List<Portata> portataList;


    private String name;
    private TypeEnum type;



    //TODO cleaning code, non si legge bene questa classe



    //TODO rivedere

    public Menu(String nome, TypeEnum type) {


        portataList = new ArrayList<>();

    }


    public void addPortata(Portata portata) {
        portataList.add(portata);
    }


    public List<Portata> selectPortataList(List<Portata> portataList) {
        List<Portata> portsSelected = new ArrayList<>();
        for (Portata portata : portataList) {
            portata.getPortataType(PortateTypeEnum.BEVERAGES);
            {
                portsSelected.add(portata);
            }
        }
        return portsSelected;
    }
}
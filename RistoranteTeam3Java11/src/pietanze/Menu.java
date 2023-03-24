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
    
    @Override
    public String toString() {
        return "\n*** " + getName() + " ***" + "\n" + " Type of the Menu: " + getType() + "\n";
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

        int prec = 0;
        for (Portata portata : portataList) {


            switch (portata.getType().getKey()){
                case 1:
                        if (prec != portata.getType().getKey()){
                            System.out.println(PortateTypeEnum.BEVERAGES.getNome());
                        }
                    break;
                case 4:
                    if (prec != portata.getType().getKey()) {
                    System.out.println(PortateTypeEnum.SECOND.getNome());
                    }
                    break;
                case 5:
                    if (prec != portata.getType().getKey()){
                        System.out.println(PortateTypeEnum.DESSERT.getNome());
                    }
                    break;
            }
            portata.printMenuPortata();
            prec = portata.getType().getKey();
        }
    }
}
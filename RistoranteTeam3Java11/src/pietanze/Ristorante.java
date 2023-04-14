package pietanze;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ristorante {
    private String name;
    private String address;

    public Ristorante(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void aggiungiEnumAMappa (Map <Integer, Integer> mappaTavoli){

         for (EnumTavoli tavolo : EnumTavoli.values()) {
             mappaTavoli.put(tavolo.getId(), tavolo.getDisponibilitaTable());
         }
     }

     public Map <Integer, Integer>  prenotaTavolo (Integer id, Map <Integer, Integer> mappaTavoli){

         Map <Integer, Integer> newMappaTavoli = mappaTavoli;

         switch (id){

             case 1: newMappaTavoli.replace(1,newMappaTavoli.get(1) -1);
             break;
             case 2: newMappaTavoli.replace(2, newMappaTavoli.get(2)-1);
             break;
             case 3: newMappaTavoli.replace(3, newMappaTavoli.get(3)-1);
             break;
             case 4: newMappaTavoli.replace(4, newMappaTavoli.get(4)-1);
                    break;
             default:
                 System.out.println("Statt accort");
                 break;
         }

         return newMappaTavoli;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

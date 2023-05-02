package pietanze;

import pietanze.enumerati.TavoliEnum;

import java.util.Map;

public class Ristorante {
    
    
    //TODO inserire il tipo
    private String name;
    private String address;

    private Map<Integer, Integer> mappaTavoli;

    //TODO sistemare

    public Ristorante(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public void aggiungiEnumAMappa() {
        for (TavoliEnum tavolo : TavoliEnum.values()) {
            mappaTavoli.put(tavolo.getId(), tavolo.getDisponibilitaTable());
        }
    }

    public Map<Integer, Integer> prenotaTavolo(Integer idTavolo) {
        for (TavoliEnum enumTavoli : TavoliEnum.values()) {
            if (idTavolo == enumTavoli.getId()) {
                this.mappaTavoli.replace(idTavolo, mappaTavoli.get(idTavolo) - 1);
            }
        }
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

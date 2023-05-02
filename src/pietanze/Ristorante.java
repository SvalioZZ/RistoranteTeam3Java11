package pietanze;

import pietanze.enumerati.TavoliEnum;
import pietanze.enumerati.TypeEnum;

import java.util.Map;
import java.util.TreeMap;

public class Ristorante {
    private TypeEnum tipo;
    private String name;
    private String address;
    
    private TreeMap<Integer, Integer> mappaTavoli;
    
    public Ristorante(String name, String address, TypeEnum tipo) {
        this.name = name;
        this.address = address;
        this.mappaTavoli = new TreeMap<>();
        this.tipo = tipo;
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
    
    public TypeEnum getTipo() {
        return tipo;
    }
    
    public void setTipo(TypeEnum tipo) {
        this.tipo = tipo;
    }
    public Map<Integer, Integer> getMappaTavoli() {
        return mappaTavoli;
    }
    
    public void setMappaTavoli(TreeMap<Integer, Integer> mappaTavoli) {
        this.mappaTavoli = mappaTavoli;
    }
    
    public TreeMap<Integer, Integer> aggiungiEnumAMappa() {
        for (TavoliEnum tavolo : TavoliEnum.values()) {
            this.mappaTavoli.put(tavolo.getId(), tavolo.getDisponibilitaTable());
        }
        return this.mappaTavoli;
    }
    
    
    public void prenotaTavolo(Integer idTavolo) {
        printMappaTavoli();
        System.out.println();
        if (idTavolo > 4) System.out.println("Il tavolo selezionato non esiste");
        else for (TavoliEnum enumTavoli : TavoliEnum.values()) {
            if (idTavolo == enumTavoli.getId()) {
                this.mappaTavoli.replace(idTavolo, mappaTavoli.get(idTavolo) - 1);
            }
        }
        printMappaTavoli();
    }
    
    public void printMappaTavoli() {
        for (Map.Entry<Integer, Integer> entry : mappaTavoli.entrySet()) {
            System.out.print("Tavolo: " + entry.getKey() + " - Disponibilità: " + entry.getValue() + "\n");
        }
    }
    
    @Override
    public String toString() {
        return "\nRistorante: " + getName() + "\n" +
                "Tipo di Cucina: " + tipo.getDescription() + "\n" +
                "Indirizzo: " + getAddress();
    }
}

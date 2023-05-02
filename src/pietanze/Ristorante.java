package pietanze;

import pietanze.enumerati.AnsiUtilityEnum;
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
       
            if (idTavolo > TavoliEnum.values().length) System.out.println("Il tavolo selezionato non esiste");
            else for (TavoliEnum enumTavoli : TavoliEnum.values()) {
                if (idTavolo == enumTavoli.getId()) {
                    if (this.mappaTavoli.get(idTavolo) == 0) System.out.println(AnsiUtilityEnum.ANSI_BRIGHT_YELLOW_BACKGROUND.getCodice() +
                                                                                        AnsiUtilityEnum.ANSI_BLACK.getCodice() +
                                                                                        "Non è possibile prenotare il tavolo selezionato" +
                                                                                        AnsiUtilityEnum.ANSI_RESET.getCodice());
                    else this.mappaTavoli.replace(idTavolo, mappaTavoli.get(idTavolo) - 1);
                }
            }
        
    }

    public void printMappaTavoli() {
        for (Map.Entry<Integer, Integer> entry : mappaTavoli.entrySet()) {
            System.out.print("Tavolo: " + entry.getKey() + " - Disponibilità: " + entry.getValue() + "\n");
        }
    }
    public void bigliettoDaVisita() {
        System.out.println("\nRistorante: " + getName() + "\n" +
                                   "Tipo di Cucina: " + tipo.getDescription() + "\n" +
                                   "Indirizzo: " + getAddress());
    }
}

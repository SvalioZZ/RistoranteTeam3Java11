package pietanze;

import pietanze.enumerati.TypeEnum;

import java.util.HashMap;
import java.util.Map;

public class Ristorante {
    private TypeEnum tipo;
    private String name;
    private String address;
    private HashMap<Cliente, Tavolo> mappaTavoli;

    public Ristorante(String name, String address, TypeEnum tipo) {
        this.name = name;
        this.address = address;
        this.mappaTavoli = new HashMap<>();
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

    public Map<Cliente, Tavolo> getMappaTavoli() {
        return mappaTavoli;
    }

    public void setMappaTavoli(HashMap<Cliente, Tavolo> mappaTavoli) {
        this.mappaTavoli = mappaTavoli;
    }


    public HashMap<Cliente, Tavolo> prenotaOrdineRistorante(Cliente cliente, Tavolo tavolo) {

        this.mappaTavoli.put(cliente, tavolo);

        printMappaTavoli();

        tavolo.setDisponibilitaTavolo(tavolo.getDisponibilitaTavolo() - 1);

        return this.mappaTavoli;

    }


//    //TODO rifattorizzare tutti i tipi primitivi come oggetti ovunque


    public void printMappaTavoli() {
        System.out.println();
        for (Map.Entry<Cliente, Tavolo> entry : mappaTavoli.entrySet()) {
            System.out.print(entry.getKey() + "\nTavolo: " + entry.getValue().getTavoloId() + "\n\n");
        }
    }

    public void bigliettoDaVisita() {
        System.out.println("\nRistorante: " + getName() + "\n" +
                "Tipo di Cucina: " + tipo.getDescription() + "\n" +
                "Indirizzo: " + getAddress());
    }
}

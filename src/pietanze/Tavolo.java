package pietanze;

/**
 * la classe Tavolo
 * @author Kristian
 */
public class Tavolo {
    private int tavoloId;
    private int disponibilitaTavolo;
    private String descrizione;

    /**
     * costruttore della classe Tavolo
     * @param tavoloId
     * @param disponibilitaTavolo
     * @param descrizione
     */

    public Tavolo(int tavoloId, int disponibilitaTavolo, String descrizione) {
        this.tavoloId = tavoloId;
        this.disponibilitaTavolo = disponibilitaTavolo;
        this.descrizione = descrizione;
    }

    /**
     * getter e setter
     */

    public int getTavoloId() {
        return tavoloId;
    }

    public void setTavoloId(int tavoloId) {
        this.tavoloId = tavoloId;
    }

    public int getDisponibilitaTavolo() {
        return disponibilitaTavolo;
    }

    public void setDisponibilitaTavolo(int disponibilitaTavolo) {
        this.disponibilitaTavolo = disponibilitaTavolo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }


    @Override
    public String toString() {
        return  descrizione + " - disponibilita: "  + disponibilitaTavolo;
    }
}

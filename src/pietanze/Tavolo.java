package pietanze;

/**
 * la classe Tavolo
 * @author Kristian
 */
public class Tavolo {
    private Integer tavoloId;
    private Integer disponibilitaTavolo;
    private String descrizione;

    /**
     * costruttore della classe Tavolo
     * @param tavoloId
     * @param disponibilitaTavolo
     * @param descrizione
     */

    public Tavolo(Integer tavoloId, Integer disponibilitaTavolo, String descrizione) {
        this.tavoloId = tavoloId;
        this.disponibilitaTavolo = disponibilitaTavolo;
        this.descrizione = descrizione;
    }

    /**
     * getter e setter
     */

    public Integer getTavoloId() {
        return tavoloId;
    }

    public void setTavoloId(Integer tavoloId) {
        this.tavoloId = tavoloId;
    }

    public Integer getDisponibilitaTavolo() {
        return disponibilitaTavolo;
    }

    public void setDisponibilitaTavolo(Integer disponibilitaTavolo) {
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

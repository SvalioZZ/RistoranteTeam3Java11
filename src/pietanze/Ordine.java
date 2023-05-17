package pietanze;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe ordine al cui interno troveremo metodi per far comporre il proprio ordine al cliente
 *
 * @author Giovanni Mauro
 * @version 1.0
 */
public class Ordine {

    /**
     * Copro della classe ordine al cui interno troviamo campi come la percentuale di mancia
     * da selezionare e una mappa che ci servirà per accoppiare nome della portata e prezzo della stessa.
     *
     *  @param perc1
     *  @param perc2
     *  @param perc3
     *  @param ordine
     *
     * @return una mappa contenente le portate ordinate dal cliente, basate su Nome della portata
     * come chiave, e prezzo della stessa come valore.
     */
    private final Integer perc1 = 15;
    private final Integer perc2 = 18;
    private final Integer perc3 = 22;

    public Map<String, Double> ordine = new HashMap();

    /**
     * Questo metodo andrà ad aggiungere a seconda della scelta del cliente, una portata alla nostra mappa
     * Prima di farlo verrà fatto un controllo sulla portata: nel caso in cui ci sia già questa portata
     * nella nostra mappa, molto semplicemente andremo ad aggiungere alla chiave già esistente il valore vecchio
     * più quello nuovo; in caso contrario si andrà ad aggiungere normalmente.
     *
     * @param portata
     *
     */
    public void addPortataToOrder(Portata portata){

        if (ordine.containsKey(portata.getName())){
            ordine.put(portata.getName(), portata.getPrice()*2);
        } else
            ordine.put(portata.getName(), portata.getPrice());
    }

    /**
     * Qui invece andremo a rimuovere una portata dall'ordine. Quindi prenderà come input il nome (la chiave)
     * e andrà ad eliminare dalla mappa la portata avente quella chiave.
     *
     * @param name
     */
    public void removePortataInOrder (String name){
        ordine.remove(name);
    }

    /**
     * Di seguito troviamo un metodo per stampare l'ordine una volta completato, in modo da farci un riassunto
     * di quello che abbiamo scelto.
     * @return stamperà tutte le chiavi presenti nella mappa, e quindi i nomi dei piatti che abbiamo ordinato
     */
    public void printOrder (){
        System.out.println(ordine.keySet());
    }

    /**
     *  Il metodo che segue andrà a prendere tutti i valori della mappa e quindi i prezzi sommandoli tra loro.
     * @return una variabile double contenente il prezzo totale dell'ordine
     */
    public double calculateTotalImport(){
        Double total = 0.0;
        for (Double value: ordine.values()) {
            total += value;
        }
        return total;
    }

    /**
     * @return Il metodo ci andrà a stampare le varie scelte di tip che abbiamo
     */
    public void chooseTip (){
        System.out.println(perc1);
        System.out.println();
        System.out.println(perc2);
        System.out.println();
        System.out.println(perc3);
    }

    /**
     * Il metodo applica la percentuale della mancia scelta
     * @param perc
     * @return calcola e ritorna il prezzo finale con l'aggiunta della mancia scelta.
     */
    public String applyTipPerc (Integer perc){
        Double total = (calculateTotalImport()*perc)/100;
        return "The total import is: " + total;
    }
}



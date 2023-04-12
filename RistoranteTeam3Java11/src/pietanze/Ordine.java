package pietanze;

import java.util.HashMap;
import java.util.Map;


//TODO parliamone la prossima volta
public class Ordine {

    private final int perc1 = 15;
    private final int perc2 = 18;
    private final int perc3 = 22;

    public Map<String, Double> ordine = new HashMap();


    public void addPortataToOrder(Portata portata){

        if (ordine.containsKey(portata.getName())){
            ordine.put(portata.getName(), portata.getPrice()*2);
        } else
            ordine.put(portata.getName(), portata.getPrice());
    }

    public void removePortataInOrder (String name){
        ordine.remove(name);
    }

    public void printOrder (){
        System.out.println(ordine.keySet());
    }
    public double calculateTotalImport(){
        double total = 0;
        for (double value: ordine.values()) {
            total += value;
        }
        return total;
    }

    public void chooseTip (){
        System.out.println(perc1);
        System.out.println();
        System.out.println(perc2);
        System.out.println();
        System.out.println(perc3);
    }
    public String applyTipPerc (int perc){
        double total = (calculateTotalImport()*perc)/100;
        return "The total import is: " + total;
    }
}



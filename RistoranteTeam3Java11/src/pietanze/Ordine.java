package pietanze;

import java.util.HashMap;
import java.util.Map;

public class Ordine {

    private final int perc1 = 15;
    private final int perc2 = 18;
    private final int perc3 = 22;

    public Map<String, Double> ordine = new HashMap();


    public void addPortataToOrder (String portataName, double price){

        if (ordine.containsKey(portataName)){
            ordine.put(portataName, price*2);
        }else
        ordine.put(portataName, price);
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



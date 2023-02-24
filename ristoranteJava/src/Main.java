import pietanze.Beverage;

import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        
        ArrayList<Beverage> beverages = new ArrayList<>();
        
        Beverage newBaverage = new Beverage("Beer", 7.99);
        Beverage BavaregeBello = new Beverage("Coka ina", 2.99);
        
        beverages.add(newBaverage);
        beverages.add(BavaregeBello);
    
        System.out.println(beverages);
//        System.out.println(newBaverage);
//        Beverage oldBeverage = new Beverage();
//        oldBeverage.setName("Chocolate Shake");
//        oldBeverage.setPrice(5.99);
//        System.out.println(oldBeverage);
//        System.out.println("Client ordered: " + oldBeverage.getName() + " that costs $" + oldBeverage.getPrice());
    
    }
    
}
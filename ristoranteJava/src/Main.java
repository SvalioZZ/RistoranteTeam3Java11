import pietanze.Beverage;
import pietanze.Second_Courses;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Beverage> beverages = new ArrayList<>();
        System.out.println("Meat Based Menu:");
        Beverage coca_cola = new Beverage("Coca-Cola", "33cl", 2.99);
        Beverage sprite = new Beverage("\nSprite", "33cl", 2.99);
        Beverage sevenUp = new Beverage("\nSevenUp", "33cl", 2.99);
        Beverage sparkling_water = new Beverage("\nSparkling Water", "1,5l", 2.99);
        Beverage strill_water = new Beverage("\nCoca-Cola", "1,5l", 2.99);

        beverages.add(coca_cola);
        beverages.add(sprite);
        beverages.add(sevenUp);
        beverages.add(sparkling_water);
        beverages.add(strill_water);

        System.out.println("\nBeverages: \n" + beverages);

        ArrayList<Second_Courses> secondCourses = new ArrayList<>();
        secondCourses.add(new Second_Courses("Scallops with white wine", 15.00));
        secondCourses.add(new Second_Courses("\nFillet with porcine mushrooms", 24.99));
        secondCourses.add(new Second_Courses("\nSliced beef with rucola and grana", 18.99));
        secondCourses.add(new Second_Courses("\nDolphin Thread", 29.99));
        secondCourses.add(new Second_Courses("\nKobe's Thread (not Bryant)", 129.99));

        System.out.println("\nThe second Courses are : \n" + secondCourses);
    }

}
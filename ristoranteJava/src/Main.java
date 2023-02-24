import pietanze.Beverage;
import pietanze.Second_Courses;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Beverage> beverages = new ArrayList<>();

        Beverage coca_cola = new Beverage("Coca-Cola", "33cl", 2.99);
        Beverage sprite = new Beverage("Sprite", "33cl", 2.99);
        Beverage sevenUp = new Beverage("SevenUp", "33cl", 2.99);
        Beverage sparkling_water = new Beverage("Sparkling Water", "1,5l", 2.99);
        Beverage strill_water = new Beverage("Coca-Cola", "1,5l", 2.99);

        beverages.add(coca_cola);
        beverages.add(sprite);
        beverages.add(sevenUp);
        beverages.add(sparkling_water);
        beverages.add(strill_water);

        System.out.println(beverages);

        ArrayList<Second_Courses> secondCourses = new ArrayList<>();
        secondCourses.add(new Second_Courses("Scallops with white wine", 15.00));
        secondCourses.add(new Second_Courses("Fillet with porcine mushrooms", 24.99));
        secondCourses.add(new Second_Courses("Sliced beef with rucola and grana", 18.99));
        secondCourses.add(new Second_Courses("Dolphin Thread", 29.99));
        secondCourses.add(new Second_Courses("Kobe's Thread (not Bryant)", 129.99));

        System.out.println("The second Courses are : \n" + secondCourses);
    }

}
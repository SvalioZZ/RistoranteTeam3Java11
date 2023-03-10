import pietanze.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        Menu menu = new Menu();
        
        ArrayList<Beverage> beverages = new ArrayList<>();
        System.out.println("Meat Based Menu:");
        Beverage coca_cola = new Beverage("Coca-Cola", "33cl", 2.99);
        Beverage sprite = new Beverage("Sprite", "33cl", 2.99);
        Beverage sevenUp = new Beverage("SevenUp", "33cl", 2.99);
        Beverage sparkling_water = new Beverage("Sparkling Water", "1,5l", 2.99);
        Beverage still_water = new Beverage("Still Water", "1,5l", 2.99);
        menu.addToMenuBeverages(coca_cola);
        menu.addToMenuBeverages(sprite);
        menu.addToMenuBeverages(sevenUp);
        menu.addToMenuBeverages(sparkling_water);
        menu.addToMenuBeverages(still_water);
        
        // Valerio out
        
        ArrayList<FirstCourses> firstCourses = new ArrayList<>();
        firstCourses.add(new FirstCourses("Pasta Pasta Rigatoni with Carbonara sauce", 14.50));
        firstCourses.add(new FirstCourses("Pasta Bucatini with Amatriciana sauce", 14.50));
        firstCourses.add(new FirstCourses("Pasta Pappardella with Ragù Boar sauce", 12.50));
        firstCourses.add(new FirstCourses("Pasta Spaghetti with Bolognese sauce", 12.50));
        firstCourses.add(new FirstCourses("Pasta Spaghetti with Shrimp and Porcini Mushrooms", 18.00));

        menu.addToMenuSecondCourses(new SecondCourses("Scallops with white wine", 15.00));
        menu.addToMenuSecondCourses(new SecondCourses("Fillet with porcine mushrooms", 24.99));
        menu.addToMenuSecondCourses(new SecondCourses("Sliced beef with rucola and grana", 18.99));
        menu.addToMenuSecondCourses(new SecondCourses("Dolphin Thread", 29.99));
        menu.addToMenuSecondCourses(new SecondCourses("Kobe's Thread (not Bryant)", 129.99));
        
        ArrayList<Desserts> desserts = new ArrayList<>();
        Desserts strawberriesCheesecake = new Desserts("Strawberries Cheesecake", 8.00);
        Desserts chocolateCheesecake = new Desserts("Chocolate Cheesecake", 8.00);
        Desserts tiramisu = new Desserts("Tiramisù", 10.00);
        Desserts applePie = new Desserts("Apple Pie", 6.00);
        Desserts redVelvetCake = new Desserts("Red Velvet Cake", 8.00);
        Desserts brownie = new Desserts("Brownie", 5.00);

        desserts.add(strawberriesCheesecake);
        desserts.add(chocolateCheesecake);
        desserts.add(tiramisu);
        desserts.add(applePie);
        desserts.add(redVelvetCake);
        desserts.add(brownie);

        ArrayList<Appetizers> appetizers = new ArrayList<>();
        appetizers.add(new Appetizers("Liver crouton", 10.00));
        appetizers.add(new Appetizers("Crouton with tomatoes", 9.99));
        appetizers.add(new Appetizers("Chicken wings", 21.00));
        appetizers.add(new Appetizers("Golden cheese", 120.00));
        appetizers.add(new Appetizers("A whole boar", 23.99));
        

        menu.printMenu();


    }
    
    
    
}
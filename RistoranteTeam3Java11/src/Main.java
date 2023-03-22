import pietanze.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
    
        Menu menu = new Menu();
    
        System.out.println("Meat Based Menu:");
    
        menu.addToMenuBeverages(new Beverage("Coca-Cola", "33cl", 2.99));
        menu.addToMenuBeverages(new Beverage("Sprite", "33cl", 2.99));
        menu.addToMenuBeverages(new Beverage("SevenUp", "33cl", 2.99));
        menu.addToMenuBeverages(new Beverage("Sparkling Water", "1,5l", 2.99));
        menu.addToMenuBeverages(new Beverage("Still Water", "1,5l", 2.99));
    
        // Valerio out
    
        menu.addToMenuFirstCourses(new FirstCourses("Pasta Pasta Rigatoni with Carbonara sauce", 14.50));
        menu.addToMenuFirstCourses(new FirstCourses("Pasta Bucatini with Amatriciana sauce", 14.50));
        menu.addToMenuFirstCourses(new FirstCourses("Pasta Spaghetti with Bolognese sauce", 12.50));
        menu.addToMenuFirstCourses(new FirstCourses("Pasta Spaghetti with Shrimp and Porcini Mushrooms", 18.00));
    
        // Daniele out
    
    
        menu.addToMenuSecondCourses(new SecondCourses("Scallops with white wine", 15.00));
        menu.addToMenuSecondCourses(new SecondCourses("Fillet with porcine mushrooms", 24.99));
        menu.addToMenuSecondCourses(new SecondCourses("Sliced beef with rucola and grana", 18.99));
        menu.addToMenuSecondCourses(new SecondCourses("Dolphin Thread", 29.99));
        menu.addToMenuSecondCourses(new SecondCourses("Kobe's Thread (not Bryant)", 129.99));
    
        // Giovanni ha frnut (he finished)
    
        menu.addToMenuDesserts(new Desserts("Strawberries Cheesecake", 8.00));
        menu.addToMenuDesserts(new Desserts("Chocolate Cheesecake", 8.00));
        menu.addToMenuDesserts(new Desserts("Tiramisù", 10.00));
        menu.addToMenuDesserts(new Desserts("Apple Pie", 6.00));
        menu.addToMenuDesserts(new Desserts("Red Velvet Cake", 8.00));
        menu.addToMenuDesserts(new Desserts("Brownie", 5.00));
    
        // Stefano out

//        ArrayList<Appetizers> appetizers = new ArrayList<>();
    
        //TODO per Kris devi modificare il metodo di aggiunta degli appetizers con "menu.addToMenu"
//        appetizers.add(new Appetizers("Liver crouton", 10.00));
//        appetizers.add(new Appetizers("Crouton with tomatoes", 9.99));
//        appetizers.add(new Appetizers("Chicken wings", 21.00));
//        appetizers.add(new Appetizers("Golden cheese", 120.00));
//        appetizers.add(new Appetizers("A whole boar", 23.99));
    
    
        System.out.println("Choose what you rather");
    
        Scanner scanner = new Scanner(System.in);
    
        List<Portata> ports = menu.addAllToPortataList();
    
        String input;
        do {
            input = scanner.nextLine();
            Portate portate = Portate.valueOf(input.toUpperCase());
            List<Portata> newSelectedPortataList;
            switch (portate) {
                case BEVERAGES:
                    newSelectedPortataList = menu.selectPortataList(ports);
                    for (Portata beverage : newSelectedPortataList) {
                        beverage.printMenuPortata();
                    }
                    input = scanner.nextLine();
                    break;
                default:
                    System.out.println("Please enter a valid value");
            }
        
        } while (!Objects.equals(String.valueOf(input), "exit"));

//                case SECOND -> {
//                    menu.printMenuSecondCourses();
//                    input = scanner.nextLine();
//                }
    
    }
}
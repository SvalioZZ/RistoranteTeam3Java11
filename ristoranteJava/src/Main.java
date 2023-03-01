import pietanze.*;

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


        ArrayList<First_Courses> firstCourses = new ArrayList<>();
        firstCourses.add(new First_Courses("Pasta Pasta Rigatoni with Carbonara sauce", 14.50));
        firstCourses.add(new First_Courses("\nPasta Bucatini with Amatriciana sauce", 14.50));
        firstCourses.add(new First_Courses("\nPasta Pappardella with Ragù Boar sauce", 12.50));
        firstCourses.add(new First_Courses("\nPasta Spaghetti with Bolognese sauce", 12.50));
        firstCourses.add(new First_Courses("\nPasta Spaghetti with Shrimp and Porcini Mushrooms", 18.00));

        ArrayList<SecondCourses> secondCourses = new ArrayList<>();
        secondCourses.add(new SecondCourses("Scallops with white wine", 15.00));
        secondCourses.add(new SecondCourses("Fillet with porcine mushrooms", 24.99));
        secondCourses.add(new SecondCourses("Sliced beef with rucola and grana", 18.99));
        secondCourses.add(new SecondCourses("Dolphin Thread", 29.99));
        secondCourses.add(new SecondCourses("Kobe's Thread (not Bryant)", 129.99));

        System.out.println("\n----------------------------\n Second Courses: \n----------------------------");
        for (int i = 0; i <secondCourses.size() ; i++) {
            System.out.println(secondCourses.get(i));
        }

        ArrayList<Desserts> desserts = new ArrayList<>();
        Desserts strawberriesCheesecake = new Desserts("Strawberries Cheesecake", 8.00);
        Desserts chocolateCheesecake = new Desserts("\nChocolate Cheesecake", 8.00);
        Desserts tiramisu = new Desserts("\nTiramisù", 10.00);
        Desserts applePie = new Desserts("\nApple Pie", 6.00);
        Desserts redVelvetCake = new Desserts("\nRed Velvet Cake", 8.00);
        Desserts brownie = new Desserts("\nBrownie", 5.00);

        desserts.add(strawberriesCheesecake);
        desserts.add(chocolateCheesecake);
        desserts.add(tiramisu);
        desserts.add(applePie);
        desserts.add(redVelvetCake);
        desserts.add(brownie);

        ArrayList<Appetizers> appetizers = new ArrayList<>();
        appetizers.add(new Appetizers("Liver crouton", 10.00));
        appetizers.add(new Appetizers("\nCrouton with tomatoes", 9.99));
        appetizers.add(new Appetizers("\nChicken wings", 21.00));
        appetizers.add(new Appetizers("\nGolden cheese", 120.00));
        appetizers.add(new Appetizers("\nA whole boar", 23.99));
    
        System.out.println(
                "----------------------------\n Beverages: \n----------------------------\n" +
                        beverages +
                        "\n----------------------------\n Appetizers: \n----------------------------\n" +
                        appetizers +
                        "\n----------------------------\n First Courses: \n----------------------------\n" +
                        firstCourses +
                        "\n----------------------------\n Desserts: \n----------------------------\n" +
                        desserts
        );
    }
    
    
    
}
import pietanze.*;


public class Main {
    
    public static void main(String[] args) {


        Menu menu = new Menu("GinoBiscottino", MEAT);
    
        System.out.println("Meat Based Menu:");
    
        menu.addPortata(new Beverage("Coca-Cola", "33cl", 2.99));
        menu.addPortata(new Beverage("Sprite", "33cl", 2.99));
        menu.addPortata(new Beverage("SevenUp", "33cl", 2.99));
        menu.addPortata(new Beverage("Sparkling Water", "1,5l", 2.99));
        menu.addPortata(new Beverage("Still Water", "1,5l", 2.99));
    
        // Valerio out
    
        menu.addPortata(new FirstCourses("Pasta Pasta Rigatoni with Carbonara sauce", 14.50));
        menu.addPortata(new FirstCourses("Pasta Bucatini with Amatriciana sauce", 14.50));
        menu.addPortata(new FirstCourses("Pasta Spaghetti with Bolognese sauce", 12.50));
        menu.addPortata(new FirstCourses("Pasta Spaghetti with Shrimp and Porcini Mushrooms", 18.00));
    
        // Daniele out
    
    
        menu.addPortata(new SecondCourses("Scallops with white wine", 15.00));
        menu.addPortata(new SecondCourses("Fillet with porcine mushrooms", 24.99));
        menu.addPortata(new SecondCourses("Sliced beef with rucola and grana", 18.99));
        menu.addPortata(new SecondCourses("Dolphin Thread", 29.99));
        menu.addPortata(new SecondCourses("Kobe's Thread (not Bryant)", 129.99));
    
        // Giovanni ha frnut (he finished)
    
        menu.addPortata(new Desserts("Strawberries Cheesecake", 8.00));
        menu.addPortata(new Desserts("Chocolate Cheesecake", 8.00));
        menu.addPortata(new Desserts("Tiramisù", 10.00));
        menu.addPortata(new Desserts("Apple Pie", 6.00));
        menu.addPortata(new Desserts("Red Velvet Cake", 8.00));
        menu.addPortata(new Desserts("Brownie", 5.00));
    
        // Stefano out

//        ArrayList<Appetizers> appetizers = new ArrayList<>();
    
        //TODO per Kris devi modificare il metodo di aggiunta degli appetizers con "menu.addToMenu"
//        appetizers.add(new Appetizers("Liver crouton", 10.00));
//        appetizers.add(new Appetizers("Crouton with tomatoes", 9.99));
//        appetizers.add(new Appetizers("Chicken wings", 21.00));
//        appetizers.add(new Appetizers("Golden cheese", 120.00));
//        appetizers.add(new Appetizers("A whole boar", 23.99));
    
    


    
    }
}
import pietanze.*;


public class Main {
    
    public static void main(String[] args) {
    
        Menu menu = new Menu("GinoBiscottino", MenuType.MEAT);
    
        menu.addPortata(new Beverage("Coca-Cola", "33cl", 2.99, false));
        menu.addPortata(new Beverage("Sprite", "33cl", 2.99, false));
        menu.addPortata(new Beverage("SevenUp", "33cl", 2.99, false));
        menu.addPortata(new Beverage("Ginger Beer", "66cl", 2.99, false));
        menu.addPortata(new Beverage("Sparkling Water", "1,5l", 2.99, false));
        menu.addPortata(new Beverage("Still Water", "1,5l", 2.99, false));
    
        menu.addPortata(new Beverage("Kozel Beer, anche alla spina", "66cl", 6.99, 6));
        menu.addPortata(new Beverage("MA.MA, anche alla spina", "66cl", 9.99, 9));
        menu.addPortata(new Beverage("White Wine", "75cl", 12.99, 12));
        menu.addPortata(new Beverage("Red Wine", "75cl", 12.99, 12));
        menu.addPortata(new Beverage("Mirto", "30ml", 3.99, 40));
        menu.addPortata(new Beverage("Amaro Del Capo", "30ml", 3.99, 40));
    
    
        // Valerio out
    
        menu.addPortata(new Appetizers("Liver crouton", 10.00, 0.4, false));
        menu.addPortata(new Appetizers("Crouton with tomatoes", 9.99, 0.05, false));
        menu.addPortata(new Appetizers("Chicken wings", 21.00, 1.4, true));
        menu.addPortata(new Appetizers("Golden cheese", 120.00, 0.1, false));
        menu.addPortata(new Appetizers("A whole boar", 23.99, 200, true));
    
        // Kris out
    
        menu.addPortata(new FirstCourses("Pasta Pasta Rigatoni with Carbonara sauce", 14.50,false ,429.7, 1));
        menu.addPortata(new FirstCourses("Pasta Bucatini with Amatriciana sauce", 14.50,false,241.0,1.5));
        menu.addPortata(new FirstCourses("Pasta Spaghetti with Bolognese sauce", 12.50,false ,205.8,1));
        menu.addPortata(new FirstCourses("Pasta Spaghetti with Shrimp and Porcini Mushrooms", 18.00,false ,250.0,0.5));
        menu.addPortata(new FirstCourses("PastaPasticciata", 10,false ,400.0,1));
    
        // Daniele out
    
        menu.addPortata(new SecondCourses("Scallops with white wine", 15.00, false));
        menu.addPortata(new SecondCourses("Fillet with porcine mushrooms", 24.99, true));
        menu.addPortata(new SecondCourses("Sliced beef with rucola and grana", 18.99, false));
        menu.addPortata(new SecondCourses("Dolphin Thread", 29.99, true));
        menu.addPortata(new SecondCourses("Kobe's Thread (not Bryant)", 129.99, true));
    
        // Giovanni ha frnut (he finished)
    
        menu.addPortata(new Desserts("Strawberries Cheesecake", 8.00, false, false, true));
        menu.addPortata(new Desserts("Chocolate Cheesecake", 8.00, false, false, true));
        menu.addPortata(new Desserts("Tiramisù", 10.00, false, false, true));
        menu.addPortata(new Desserts("Apple Pie", 6.00, true, false, false));
        menu.addPortata(new Desserts("Red Velvet Cake", 8.00, true, false, false));
        menu.addPortata(new Desserts("Brownie", 5.00, true, true, false));
    
        // Stefano out

        menu.printInfoMenu();
        menu.printMenu();
    }
}
import pietanze.*;
import pietanze.enumerati.IngredientiEnum;
import pietanze.enumerati.SapiditaEnum;
import pietanze.enumerati.TypeEnum;

import java.sql.*;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu("GinoBiscottino", TypeEnum.MEAT);




        menu.addPortata(new Beverage("Coca-Cola", "33cl", 2.99, 0, false));
        menu.addPortata(new Beverage("Sprite", "33cl", 2.99, 0, false));
        menu.addPortata(new Beverage("SevenUp", "33cl", 2.99, 0, false));
        menu.addPortata(new Beverage("Ginger Beer", "66cl", 2.99, 0, false));
        menu.addPortata(new Beverage("Sparkling Water", "1,5l", 2.99, 0, false));
        menu.addPortata(new Beverage("Still Water", "1,5l", 2.99, 0, false));

        menu.addPortata(new Beverage("Kozel Beer, anche alla spina", "66cl", 6.99, 6, true));
        menu.addPortata(new Beverage("MA.MA, anche alla spina", "66cl", 9.99, 9, true));
        menu.addPortata(new Beverage("Capiroska", "50cl", 7.99, 15, true));
        menu.addPortata(new Beverage("Aperol Spritz", "50cl", 7.99, 12, true));
        menu.addPortata(new Beverage("Moscow Mule", "50cl", 7.99, 14, true));
        menu.addPortata(new Beverage("Amaro Del Capo", "30ml", 3.99, 40, true));


        menu.addPortata(new Appetizers("Liver crouton", 10.00, 0.4, false, 10));
        menu.addPortata(new Appetizers("Crouton with tomatoes", 9.99, 0.05, false, 5));
        menu.addPortata(new Appetizers("Chicken wings", 21.00, 1.4, true, 32));
        menu.addPortata(new Appetizers("Golden cheese", 120.00, 0.1, false, 220));
        menu.addPortata(new Appetizers("A whole boar", 23.99, 200, true, 1));


        menu.addPortata(new FirstCourses("Pasta Pasta Rigatoni with Carbonara sauce", 14.50, false, 429.7, 1));
        menu.addPortata(new FirstCourses("Pasta Bucatini with Amatriciana sauce", 14.50, false, 241.0, 1.5));
        menu.addPortata(new FirstCourses("Pasta Spaghetti with Bolognese sauce", 12.50, false, 205.8, 1));
        menu.addPortata(new FirstCourses("Pasta Spaghetti with Shrimp and Porcini Mushrooms", 18.00, false, 250.0, 0.5));
        menu.addPortata(new FirstCourses("PastaPasticciata", 10, false, 400.0, 1));


        menu.addPortata(new SecondCourses("Scallops with white wine", 15.00, false));
        menu.addPortata(new SecondCourses("Fillet with porcine mushrooms", 24.99, true));
        menu.addPortata(new SecondCourses("Sliced beef with rucola and grana", 18.99, false));
        menu.addPortata(new SecondCourses("Dolphin Thread", 29.99, true));
        menu.addPortata(new SecondCourses("Kobe's Thread (not Bryant)", 129.99, true));


        menu.addPortata(new Desserts("Strawberries Cheesecake", 8.00, false, false, false,
                SapiditaEnum.DOLCE, Set.of(IngredientiEnum.STRAWBERRIES, IngredientiEnum.EGGS, IngredientiEnum.CREAM_CHEESE,
                IngredientiEnum.BUTTER, IngredientiEnum.DRY_BISCUITS, IngredientiEnum.SUGAR)));
        menu.addPortata(new Desserts("Chocolate Cheesecake", 8.00, false, false, false,
                SapiditaEnum.DOLCE, Set.of(IngredientiEnum.CHOCALATE, IngredientiEnum.EGGS, IngredientiEnum.CREAM_CHEESE,
                IngredientiEnum.BUTTER, IngredientiEnum.DRY_BISCUITS, IngredientiEnum.SUGAR)));
        menu.addPortata(new Desserts("Tiramisù", 10.00, false, false, false,
                SapiditaEnum.DOLCE, Set.of(IngredientiEnum.COFFEE, IngredientiEnum.EGGS, IngredientiEnum.MASCARPONE_CHEESE,
                IngredientiEnum.SAVOIARDI_BISCUITS, IngredientiEnum.SUGAR, IngredientiEnum.COCOA)));
        menu.addPortata(new Desserts("Apple Pie", 6.00, true, false, false,
                SapiditaEnum.AGRODOLCE, Set.of(IngredientiEnum.FLOUR, IngredientiEnum.APPLES, IngredientiEnum.EGGS,
                IngredientiEnum.SUGAR, IngredientiEnum.YEAST, IngredientiEnum.BUTTER, IngredientiEnum.VANILLA)));
        menu.addPortata(new Desserts("Red Velvet Cake", 8.00, true, false, false,
                SapiditaEnum.DOLCISSIMO, Set.of(IngredientiEnum.FLOUR, IngredientiEnum.EGGS, IngredientiEnum.BUTTER,
                IngredientiEnum.SUGAR, IngredientiEnum.MILK_CREAM, IngredientiEnum.RED_FOOD_COLORING)));
        menu.addPortata(new Desserts("Hazelnuts and chocolate Brownies", 5.00, true, true, true,
                SapiditaEnum.AMARO, Set.of(IngredientiEnum.CHOCALATE, IngredientiEnum.HAZELNUTS, IngredientiEnum.COCOA,
                IngredientiEnum.SUGAR, IngredientiEnum.EGGS, IngredientiEnum.YEAST)));

        menu.printInfoMenu();
        menu.printMenu();


        Ristorante ristorante = new Ristorante("Gianfrancos Rosticceries", "Via dalle palle sudate", TypeEnum.MEAT);

        Tavolo tavoloPer2 = new Tavolo(1, 4, "Tavolo per 2");
        Tavolo tavoloPer4 = new Tavolo(2, 3, "Tavolo per 4");
        Tavolo tavoloPer6 = new Tavolo(3, 5, "Tavolo per 6");
        Tavolo tavoloPer10 = new Tavolo(4, 1, "Tavolo per 10");

        Set<Tavolo> setTavoli = new HashSet<>();

        setTavoli.add(tavoloPer2);
        setTavoli.add(tavoloPer4);
        setTavoli.add(tavoloPer6);
        setTavoli.add(tavoloPer10);

        Cliente cliente = new Cliente ((int)Math.round(Math.random()*100), 19, "Giovanni", "provola123", "Via casa mia",
                    "Vegano", "giomauro27@gmail.com", 3331327482L, 52133127897L);

        System.out.println(setTavoli);

        HashMap<Cliente, Tavolo> mappaTavoli = ristorante.prenotaOrdineRistorante(cliente, tavoloPer4);

        System.out.println(setTavoli);


            // Open a connection
            try{
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/main", "Giovanni", "");
                Statement stmt = conn.createStatement();

                ResultSet rs = stmt.executeQuery("SELECT * FROM MEAL" );
                ResultSetMetaData rsmd = rs.getMetaData();
                int columnsNumber = rsmd.getColumnCount();
                while (rs.next()) {
                    for (int i = 1; i <= columnsNumber; i++) {
                        if (i > 1) System.out.print(",  ");
                        String columnValue = rs.getString(i);
                        System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
                    }
                    System.out.println("");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }




//
//        ristorante.printMappaTavoli();
//
//        ristorante.prenotaTavolo(4);
//
//        ristorante.printMappaTavoli();
        
//        ristorante.bigliettoDaVisita();
    }
}
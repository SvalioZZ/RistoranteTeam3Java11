import pietanze.*;
import pietanze.DAO.BeverageDAO;
import pietanze.DAO.DessertDAO;
import pietanze.enumerati.IngredientiEnum;
import pietanze.enumerati.PortateEnum;
import pietanze.enumerati.SapiditaEnum;
import pietanze.enumerati.TypeEnum;

import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {

        Menu menu = new Menu("GinoBiscottino", TypeEnum.MEAT);


        //Creazione menù
        //creazione portate con chiave esterna sull'id del menu che avete creato

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
        
//        Connessioni.selectQuery("name, price, calories", "meal");

        DessertDAO desserts = new DessertDAO();
        desserts.createTable();

        //desserts.insertDessert("Hazelnuts chocolate Brownies", 5.00, true, true, true, SapiditaEnum.AMARO);
        desserts.printAllDesserts();
        
        BeverageDAO bevDao = new BeverageDAO();
        bevDao.create("beverage", Arrays.asList(
                "ID int auto_increment primary key",
                "name varchar(255) not null",
                "price double not null",
                "tipo varchar(255) not null",
                "capienza varchar(255) not null",
                "alcolico boolean not null",
                "percentualeAlcohol int not null")
        );
        
        bevDao.insertInto(
                "beverage",
                Arrays.asList("name", "price", "tipo", "capienza", "alcolico", "percentualeAlcohol"),
                Arrays.asList("Coca-Cola", "2.99", String.valueOf(PortateEnum.BEVERAGES),"33cl", "false", "0")
        );

    }
}
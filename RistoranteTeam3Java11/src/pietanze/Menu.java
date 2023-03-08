package pietanze;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Beverage> beverages;
    private static List<SecondCourses> secondCourses;


    public static void printMenu (){
        //Printmenu primi piatti
        printMenuSecondCourses();
    }

    public Menu() {
       beverages = new ArrayList<>();
       secondCourses = new ArrayList<>();

    }

    //TODO ognuno inserirà la propria lista qui dentro , il metodo per gestirla, e il metodo per stamparla
    //TODO e poi ci sarà un metodo per la stampa globale


    public static void addToMenuSecondCourses(SecondCourses secondCourse){
        secondCourses.add(secondCourse);
    }
    public static void printMenuSecondCourses (){
        System.out.println(secondCourses);
    }

}

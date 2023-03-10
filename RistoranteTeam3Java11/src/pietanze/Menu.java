package pietanze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {
    
    private List<Beverage> beverages;
    private List<SecondCourses> secondCourses;
    
    private Beverage beverage;
    
    
    public void printMenu() {
        printMenuBeverages();
        //Printmenu primi piatti
        printMenuSecondCourses();
    }
    
    public Menu() {
        beverages = new ArrayList<>();
        secondCourses = new ArrayList<>();
    }
    
    //TODO ognuno inserirà la propria lista qui dentro , il metodo per gestirla, e il metodo per stamparla
    //TODO e poi ci sarà un metodo per la stampa globale
    
    
    public void addToMenuSecondCourses(SecondCourses secondCourse) {
        secondCourses.add(secondCourse);
    }
    
    public void printMenuSecondCourses() {
        System.out.println("""
                --------------------------------
                Second Courses:\s
                --------------------------------"""
        );
        for (SecondCourses course: secondCourses) {
            System.out.println(course);
        }
    }
    
    public void addToMenuBeverages(Beverage beverage) {
        beverages.add(beverage);
    }
    
    public void printMenuBeverages() {
        System.out.println("""
                --------------------------------
                Beverages:\s
                --------------------------------"""
        );
        for (Beverage beverage : beverages) {
            System.out.println(beverage);
        }
    }
}
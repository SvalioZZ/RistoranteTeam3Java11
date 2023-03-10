package pietanze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {

    private List<Beverage> beverages;
    private List<FirstCourses> firstCourses;
    private List<SecondCourses> secondCourses;
    private List<Desserts> desserts;



    public void printMenu() {
        printMenuBeverages();
        printMenuFirstCourses();
        printMenuSecondCourses();
        printMenuDesserts();
    }

    public Menu() {
        beverages = new ArrayList<>();
        firstCourses = new ArrayList<>();
        secondCourses = new ArrayList<>();
        desserts = new ArrayList<>();
    }

    //TODO ognuno inserirà la propria lista qui dentro , il metodo per gestirla, e il metodo per stamparla
    //TODO e poi ci sarà un metodo per la stampa globale

    public void addToMenuFirstCourses(FirstCourses  firstCourse) {firstCourses.add(firstCourse);}
    public void printMenuFirstCourses() {
        System.out.println("""
                --------------------------------
                First Courses:\s
                --------------------------------"""
        );
        for (FirstCourses course: firstCourses) {
            System.out.println(course);
        }
    }
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

    public void addToMenuDesserts(Desserts dessert) {
        desserts.add(dessert);
    }

    public void printMenuDesserts() {
        System.out.println("""
                --------------------------------
                Desserts:\s
                --------------------------------"""
        );
        for (Desserts dessert : desserts) {
            System.out.println(dessert);
        }
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
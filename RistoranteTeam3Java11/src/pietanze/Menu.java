package pietanze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {

    //TODO inserire nome tipo(enumerato: vegano ,carn, vegetariano), lista portate, prezzo medio

    private List<Portata> portataList;
    private List<Beverage> beverages;
    private List<Appetizers> appetizers;
    private List<FirstCourses> firstCourses;
    private List<SecondCourses> secondCourses;
    private List<Desserts> desserts;


    public void printOptions(){
        System.out.println("""
                --------------------------------
                4 -> Second Courses:\s
                --------------------------------"""
        );
    }

    public void printMenu() {
        printMenuBeverages();
        printMenuAppetizers();
        printMenuFirstCourses();
        printMenuSecondCourses();
        printMenuDesserts();

    }


    public Menu() {
        portataList = new ArrayList<>();
        beverages = new ArrayList<>();
        firstCourses = new ArrayList<>();
        secondCourses = new ArrayList<>();
        desserts = new ArrayList<>();
    }

    public void addToPortataList (SecondCourses secondCourse){
        portataList.add(secondCourse);
    }
    public void printPortata (){

    }



    //TODO ognuno inserirà la propria lista qui dentro , il metodo per gestirla, e il metodo per stamparla
    //TODO e poi ci sarà un metodo per la stampa globale

    public void addToMenuAppetizers(Appetizers  appetizer) {appetizers.add(appetizer);}
    public void printMenuAppetizers() {
        System.out.println("""
                --------------------------------
                Appetizers:\s
                --------------------------------"""
        );
        for (Appetizers appetizer: appetizers) {
            System.out.println(appetizer);
        }
    }
    public void addToMenuFirstCourses(FirstCourses  firstCourse) {firstCourses.add(firstCourse);}
    public void printMenuFirstCourses() {
        System.out.println("""
                --------------------------------
                First Courses:\s
                --------------------------------"""
        );
        for (FirstCourses course: firstCourses) {
            //TODO si chiama sempre il metodo sull'oggetto
            System.out.println(course);
            course.printPortata();
            course.printInfo();
        }
    }
//    public void addToMenuSecondCourses(SecondCourses secondCourse) {
//        secondCourses.add(secondCourse);
//    }

    public void printMenuSecondCourses() {

        for (SecondCourses course: secondCourses) {
//            System.out.println(course);
            course.printMenuSecondCourses();
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
package OldProject.pietanze;

import java.util.ArrayList;
import java.util.List;

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
                SECOND -> Second Courses:\s
                --------------------------------"""
        );
    }

    //TODO cleaning code, non si legge bene questa classe

    public void printMenu() {
        printMenuBeverages();
//        printMenuAppetizers();
        printMenuFirstCourses();
        printMenuSecondCourses();
        printMenuDesserts();
    }


    //TODO rivedere

    public Menu(String nome, TypeEnum type) {


        portataList = new ArrayList<>();


    }

//    public void addToPortataList (List<SecondCourses> secondCourses){
//        portataList.addAll(secondCourses);
//    }

    public void addPortata(Portata portata) {
        portataList.add(portata);
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
//            System.out.println(course);
            course.printPortata();
//            course.printInfo();
        }
    }
    public void addToMenuSecondCourses(SecondCourses secondCourse) {
        secondCourses.add(secondCourse);
    }

    public void printMenuSecondCourses() {

        for (SecondCourses course: secondCourses) {
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
    
    // provo a vedere se sta cosa funziona
    
    public List<Portata> selectPortataList (List<Portata> portataList){
        List<Portata> portsSelected = new ArrayList<>();
        for (Portata portata : portataList){
            portata.getPortataType(PortateTypeEnum.BEVERAGES);
            {
                portsSelected.add(portata);
            }
        }
        return portsSelected;
    }
}
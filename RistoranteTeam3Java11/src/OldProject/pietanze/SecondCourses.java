package OldProject.pietanze;



public class SecondCourses extends Portata {


    public SecondCourses(String name, double price) {
        super(name, price);

    }

    public void printMenuSecondCourses() {
        System.out.println(super.getName() + " - " + super.getPrice());
    }
}

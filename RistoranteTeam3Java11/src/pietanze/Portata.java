package pietanze;

public class Portata {

    private String name;
    private double price;

    public Portata(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMenuPortata() {
        System.out.println(name + " - " + price);
    }
}

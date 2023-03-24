package pietanze;

public class Portata {

    private String name;
    private double price;
    private PortateTypeEnum type;
    
    public Portata(String name, double price, PortateTypeEnum type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }
    
    public PortateTypeEnum getType() {
        return type;
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
        for (PortateTypeEnum type : PortateTypeEnum.values()) {
            System.out.println(name + " - " + price);
        }
    }
}

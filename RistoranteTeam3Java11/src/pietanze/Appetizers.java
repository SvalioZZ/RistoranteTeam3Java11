package pietanze;

public class Appetizers extends Portata{

    public Appetizers(String name, double price) {
        super(name, price, PortateTypeEnum.APPETIZERS);
    }

    @Override
    public void printMenuPortata() {
        super.printMenuPortata();
    }
}

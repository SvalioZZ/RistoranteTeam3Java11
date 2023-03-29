package pietanze;

public class Appetizers extends Portata{

    //TODO dobbiamo iniziare a inserire personalizzazioni delle classi, un campo tipo antipasto, rustico,campano,
    //oppure inserire un campo che dice se contiene glutine
    public Appetizers(String name, double price) {
        super(name, price, PortateTypeEnum.APPETIZERS);
    }

    @Override
    public void printPortata() {
        super.printPortata();
    }
}

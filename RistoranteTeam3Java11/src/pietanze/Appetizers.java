package pietanze;

public class Appetizers extends Portata{

    //TODO dobbiamo iniziare a inserire personalizzazioni delle classi, un campo tipo antipasto, rustico,campano,
    //oppure inserire un campo che dice se contiene glutine
    private double weightAppetizerKg;
    private boolean canExplode;
    public Appetizers(String name, double price,double weightAppetizer,boolean canExplode) {
        super(name, price, EnumPortate.APPETIZERS);
        this.weightAppetizerKg = weightAppetizerKg;
        this.canExplode= canExplode;
    }

    @Override
    public void printPortata() {
        super.printPortata();
    }
}

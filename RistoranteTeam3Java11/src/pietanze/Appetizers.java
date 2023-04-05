package pietanze;

public class Appetizers extends Portata{

    //TODO dobbiamo iniziare a inserire personalizzazioni delle classi, un campo tipo antipasto, rustico,campano,
    //oppure inserire un campo che dice se contiene glutine
    private double weightAppetizerKg;
    private boolean canExplode;
    public Appetizers(String name, double price,double weightAppetizerKg,boolean canExplode) {
        super(name, price, EnumPortate.APPETIZERS);
        this.weightAppetizerKg = weightAppetizerKg;
        this.canExplode= canExplode;
    }

    //TODO inserire getter e setter
    public double getWeightAppetizerKg() {
        return weightAppetizerKg;
    }

    //TODO però quando andiamo a ridefinire un metodo nel figlio vanno poi inseriti anche i field del figlio weightAppetizerKg
    @Override
    public void printPortata() {
        super.printPortata();
    }
}

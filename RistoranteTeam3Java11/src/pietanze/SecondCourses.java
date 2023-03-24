package pietanze;

public class SecondCourses extends Portata {
    private PortateTypeEnum type;

    public SecondCourses(String name, double price) {
        super(name, price);
        this.type = PortateTypeEnum.SECOND;
    }
}

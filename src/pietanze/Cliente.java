package pietanze;

public class Cliente {
    private int ID;
    private int age;
    private String name;
    private String password;
    private String address;
    private String dieta;
    private String email;
    private long numeroDiTelefono;
    private long numeroCartaDiCredito;

    public Cliente(int ID, int age, String name, String password, String address, String dieta, String email, long numeroDiTelefono, long numeroCartaDiCredito) {
        this.ID = ID;
        this.age = age;
        this.name = name;
        this.password = password;
        this.address = address;
        this.dieta = dieta;
        this.email = email;
        this.numeroDiTelefono = numeroDiTelefono;
        this.numeroCartaDiCredito = numeroCartaDiCredito;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getNumeroDiTelefono() {
        return numeroDiTelefono;
    }

    public void setNumeroDiTelefono(long numeroDiTelefono) {
        this.numeroDiTelefono = numeroDiTelefono;
    }

    public long getNumeroCartaDiCredito() {
        return numeroCartaDiCredito;
    }

    public void setNumeroCartaDiCredito(long numeroCartaDiCredito) {
        this.numeroCartaDiCredito = numeroCartaDiCredito;
    }


    @Override
    public String toString() {
        return "Cliente: " +
                "ID: " + ID +
                ", name: '" + name + '\'' +
                ", email: '" + email + '\'' ;
    }
}

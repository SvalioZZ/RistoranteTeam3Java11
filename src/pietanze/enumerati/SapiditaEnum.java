package pietanze.enumerati;

public enum SapiditaEnum {
    AMARISSIMO(1, "Amarissimo"), AMARO(2, "Amaro"), DOLCE(3, "Dolce"),
    DOLCISSIMO(4, "Dolcissimo"), SALATO(5, "Salato"), SALATISSIMO(6, "Salatissimo"),
    SCIAPO(7, "Senza Sale"), AGRODOLCE(8, "Agrodolce");

    private Integer id;
    private String name;

    SapiditaEnum(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package pietanze;

public enum EnumSapidita {
    AMARISSIMO(1), AMARO(2), DOLCE(3), DOLCISSIMO(4), SALATO(5), SALATISSIMO(6), SCIAPO(7), AGRODOLCE(8);

    private int id;

    EnumSapidita(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

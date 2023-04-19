package pietanze.enumerati;

public enum EnumPrenotazioniAsporti {
    PRENOTAZIONI_ASPORTI_1( 1, 4, 20.00),
    PRENOTAZIONI_ASPORTI_2( 2, 4, 21.00),
    PRENOTAZIONI_ASPORTI_3( 3, 4, 22.00),
    PRENOTAZIONI_ASPORTI_4( 4, 4, 23.00);

    private int ordinazioniPossibili;
    private double orario;
    private int id;

    EnumPrenotazioniAsporti(int id, int ordinazioniPossibili, double orario) {
        this.ordinazioniPossibili = ordinazioniPossibili;
        this.id = id;
        this.orario = orario;
    }

    public int getOrdinazioniPossibili() {
        return ordinazioniPossibili;
    }

    public void setOrdinazioniPossibili(int ordinazioniPossibili) {
        this.ordinazioniPossibili = ordinazioniPossibili;
    }

    public double getOrario() {
        return orario;
    }

    public void setOrario(double orario) {
        this.orario = orario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

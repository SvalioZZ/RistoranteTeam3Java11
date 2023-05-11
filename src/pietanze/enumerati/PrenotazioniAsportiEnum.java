package pietanze.enumerati;

public enum PrenotazioniAsportiEnum {
    PRENOTAZIONI_ASPORTI_1( 1, 4, 20.00),
    PRENOTAZIONI_ASPORTI_2( 2, 4, 21.00),
    PRENOTAZIONI_ASPORTI_3( 3, 4, 22.00),
    PRENOTAZIONI_ASPORTI_4( 4, 4, 23.00);

    private Integer ordinazioniPossibili;
    private Double orario;
    private Integer id;

    PrenotazioniAsportiEnum(Integer id, Integer ordinazioniPossibili, Double orario) {
        this.ordinazioniPossibili = ordinazioniPossibili;
        this.id = id;
        this.orario = orario;
    }

    public Integer getOrdinazioniPossibili() {
        return ordinazioniPossibili;
    }

    public void setOrdinazioniPossibili(int ordinazioniPossibili) {
        this.ordinazioniPossibili = ordinazioniPossibili;
    }

    public Double getOrario() {
        return orario;
    }

    public void setOrario(double orario) {
        this.orario = orario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

package pietanze;

public enum TypeEnumMenu {
    //TODO mettiamo gli altri tipi
    MEAT ("Meat Based Menu");

    //TODO enum del tipo di menu


    private final String nome;
    TypeEnumMenu(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}

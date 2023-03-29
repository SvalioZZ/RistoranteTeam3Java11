package pietanze;

public enum TypeEnumMenu {
    //TODO mettiamo gli altri tipi
    MEAT("Meat Based Menu"),
    VEGAN("No Meat Menu"),
    GLUTENFREE("No Gluten Menu"),
    LACTOSEFREE("No Lactose Menu"),
    EXPLOSIVE("Maybe your final menu");

    //TODO enum del tipo di menu


    private final String nome;
    TypeEnumMenu(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}

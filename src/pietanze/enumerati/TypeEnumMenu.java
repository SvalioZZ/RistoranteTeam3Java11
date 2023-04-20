package pietanze.enumerati;

public enum TypeEnumMenu {
    
    MEAT("Meat Based Menu"),
    VEGAN("Vegan Based Menu"),
    GLUTENFREE("No Gluten Menu"),
    LACTOSEFREE("No Lactose Menu"),
    EXPLOSIVE("Maybe your final menu");
    
    private final String nome;
    TypeEnumMenu(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}

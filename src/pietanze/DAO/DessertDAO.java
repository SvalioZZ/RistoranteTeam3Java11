package pietanze.DAO;

import pietanze.Desserts;
import pietanze.enumerati.SapiditaEnum;

import java.sql.*;
import static pietanze.enumerati.AnsiUtilityEnum.*;

public class DessertDAO {
    private static final String url = "jdbc:mysql://localhost:3306/my_database";
    private static final String username = "root";
    private static final String password = "password";

    public void createTable() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();

        String createQuery = """
                CREATE TABLE IF NOT EXISTS Desserts
                ( id_dessert INTEGER NOT NULL AUTO_INCREMENT,
                  name VARCHAR(50) NOT NULL,
                  price DOUBLE NOT NULL,
                  containFrozenIngredients BOOLEAN NOT NULL,
                  glutenFree BOOLEAN NOT NULL,
                  lactoseFree BOOLEAN NOT NULL,
                  dolcezza VARCHAR(30) NOT NULL,
                  ingredienti varchar(30),
                  CONSTRAINT Desserts_pk PRIMARY KEY (id_dessert)
                );
                """;
        statement.executeUpdate(createQuery);
        conn.close();
        System.out.println("Tabella Desserts creata");
    }

    //TODO sistamare
    public void insertDessert(Desserts desserts) throws SQLException {

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO my_database.desserts (name, price, containFrozenIngredients, glutenFree, lactoseFree, dolcezza)" +
                " VALUES ('" + desserts.getName() + "', " + desserts.getPrice() + ", " + containFrozenIngredients + ", " + glutenFree +
                ", " + lactoseFree + ", '" + dolcezza.getDescrizione() + "');";

        statement.executeUpdate(insertQuery);
        conn.close();
        System.out.println("Tabella Desserts popolata");
    }

    public void printAllDesserts() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();

        String printQuery = """
                SELECT * from Desserts;
                """;
        ResultSet resultSet = statement.executeQuery(printQuery);

        int i = 0;

        while (resultSet.next()) {
            i = i + 1;
            System.out.println(ANSI_RED_BACKGROUND.getCodice() + resultSet.getString("name") + ANSI_RESET.getCodice());
            System.out.println("PREZZO: " + resultSet.getDouble("price"));
            System.out.println("containFrozenIngredients: " + resultSet.getBoolean("containFrozenIngredients"));
            System.out.println("glutenFree: " + resultSet.getBoolean("glutenFree"));
            System.out.println("lactoseFree: " + resultSet.getBoolean("lactoseFree"));
            System.out.println("Livello di dolcezza: " + resultSet.getString("dolcezza"));
            System.out.println("Ingredienti: " + resultSet.getString("ingredienti") + "\n");
        }
        conn.close();
    }


}

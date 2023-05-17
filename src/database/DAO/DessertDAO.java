package database.DAO;

import database.utility.Connector;
import pietanze.Desserts;

import java.sql.*;
import static pietanze.enumerati.AnsiUtilityEnum.*;

public class DessertDAO {
    public void createTable() throws SQLException {
        Connection conn = Connector.getConnection();

        Statement statement = conn.createStatement();

        String createQuery = """
                CREATE TABLE IF NOT EXISTS Desserts
                ( id_dessert INTEGER NOT NULL AUTO_INCREMENT,
                  name VARCHAR(50) UNIQUE NOT NULL,
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

    public void insertDessert(Desserts desserts) throws SQLException {
        Connection conn = Connector.getConnection();
        Statement statement = conn.createStatement();

        String insertQuery = "INSERT INTO my_database.desserts (name, price, containFrozenIngredients, glutenFree, lactoseFree, dolcezza)" +
                " VALUES ('" + desserts.getName() + "', " + desserts.getPrice() + ", " + desserts.getContainFrozenIngredients() +
                ", " + desserts.isGlutenFree() + ", " + desserts.isLactoseFree()+ ", '" + desserts.getDolcezza().getDescrizione() + "');";

        statement.executeUpdate(insertQuery);
        conn.close();
        System.out.println("Tabella Desserts popolata");
    }

    public void deleteAllDesserts() throws SQLException {
        Connection conn = Connector.getConnection();
        Statement statement = conn.createStatement();

        String deleteQuery = "DELETE * FROM my_database.Desserts";

        statement.executeUpdate(deleteQuery);
        conn.close();
        System.out.println("Tabella Dessert svuotata");
    }

    public void printAllDesserts() throws SQLException {
        Connection conn = Connector.getConnection();
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

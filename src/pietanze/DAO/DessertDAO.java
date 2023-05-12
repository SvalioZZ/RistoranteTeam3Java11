package pietanze.DAO;

import pietanze.Desserts;
import pietanze.enumerati.SapiditaEnum;

import java.sql.*;

public class DessertDAO {
    private static final String url = "jdbc:mysql://localhost:3306/my_database";
    private static final String username = "root";
    private static final String password = "password";

    public void createTable() throws SQLException {
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();

        String createQuery = """
                CREATE TABLE IF NOT EXISTS Desserts
                ( id_dessert INTEGER(10) NOT NULL AUTO_INCREMENT,
                  name VARCHAR(30) NOT NULL,
                  price DOUBLE NOT NULL,
                  containFrozenIngredients BOOLEAN NOT NULL,
                  glutenFree BOOLEAN NOT NULL,
                  lactoseFree BOOLEAN NOT NULL,
                  dolcezza VARCHAR(30) NOT NULL,
                  CONSTRAINT Desserts_pk PRIMARY KEY (id_dessert)
                );
                """;
        statement.executeUpdate(createQuery);
        conn.close();
        System.out.println("Tabella Desserts creata");
    }

    public void insertDessert(String name, Double price, Boolean containFrozenIngredients, Boolean glutenFree, Boolean lactoseFree,
                              SapiditaEnum dolcezza) throws SQLException {

        Connection conn = DriverManager.getConnection(url, username, password);
        Statement statement = conn.createStatement();

        //chiedere per il Set<IngredientiEnum>, non fa fare il getName()
        String insertQuery = "INSERT INTO Desserts (name, price, containFrozenIngredients, glutenFree, lactoseFree, dolcezza) VALUES ('"
                + name + "', " + price + "', " + containFrozenIngredients + "', " + glutenFree + "', "
                + lactoseFree + "', " + dolcezza.getName() + "');";

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
            System.out.println(" name " + resultSet.getString("name") + i);
            System.out.println(" price " + resultSet.getString("price") + i);
            System.out.println(" containFrozenIngredients " + resultSet.getString("containFrozenIngredients") + i);
            System.out.println(" glutenFree " + resultSet.getString("glutenFree") + i);
            System.out.println(" lactoseFree " + resultSet.getString("lactoseFree") + i);
            System.out.println(" dolcezza " + resultSet.getString("dolcezza") + i);
            System.out.println(" ingredienti " + resultSet.getString("ingredienti") + i);
        }
        conn.close();
    }


}

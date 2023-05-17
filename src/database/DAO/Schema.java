package database.DAO;

import database.utility.Connector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;


public class Schema {
    public void build() throws SQLException {
        Connection conn = Connector.getConnection();
        Statement statment = conn.createStatement();

        String dessertsQuery = """
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
        statment.executeUpdate(dessertsQuery);

        // IDEA: prima dopo da continuare con tutte le tabelle per creare solo lo schema del database,
        // le insert e i metodi li lasciamo nelle loro classi DAO

        conn.close();

    }
}

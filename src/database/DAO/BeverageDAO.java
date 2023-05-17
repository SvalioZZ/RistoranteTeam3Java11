package database.DAO;

import database.utility.ConnUtilityEnum;

import java.sql.*;
import java.util.Collections;
import java.util.List;

/**
 * Classe DAO per il management delle istanze di tipo beverage
 *
 * @author Valerio Corallini
 * @version 1.0
 */
public class BeverageDAO {
    /**
     * Costruttore di default per lanciare le varie istruzioni sql
     *
     * @throws SQLException
     */
    
    public BeverageDAO() throws SQLException {
    
    }
    
    /**
     * Istanza di connessione attiva
     *
     * @param conn = connessione al database tramite riferimento
     * alla classe ConnUtilityEnum;
     */
    private final Connection conn = DriverManager.getConnection(
            ConnUtilityEnum.URL.getSqlUtil(),
            ConnUtilityEnum.USERNAME.getSqlUtil(),
            ConnUtilityEnum.PASSWORD.getSqlUtil()
    );
    
    /**
     * METODI CRUD
     * <p>
     * Questo metodo generale legge la query quando viene richiamato il metodo,
     * crea in base alla stessa ciò che viene chiesto, all'interno del
     * database di riferimento.
     *
     * @param query
     * @param tableName
     * @throws Exception
     */
    public void commandUpdate(String query, String tableName) throws Exception {
        PreparedStatement ps = this.conn.prepareStatement(query);
        ps.executeUpdate();
        System.out.println("Query executed: " + query + ";\nOn (new) table: " +
                                   tableName + "\n*** SUCCESS ***");
        ps.close();
        conn.close();
    }
    
    /**
     * Questo metodo invece di creare come l'update poco più su, in
     * questo caso chiama una query di read dei dati
     *
     * @param query
     * @throws Exception
     */
    public void commandQuery(String query) throws Exception {
        PreparedStatement ps = this.conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();
        ResultSetMetaData rsmt = rs.getMetaData();
        int columnCount = rsmt.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                if (i > 1) System.out.print(", ");
                String columnName = rsmt.getColumnName(i);
                String columnValue = rs.getString(i);
                System.out.print(columnName + ": " + columnValue);
            }
            System.out.println();
        }
        ps.close();
        conn.close();
    }
    
    /**
     * Questo metodo crea una tabella
     *
     * @param tableName
     * @param columns
     * @throws SQLException
     */
    public void create(String tableName, List<String> columns) throws SQLException {
        PreparedStatement ps = this.conn.prepareStatement(
                "create table if not exists my_database." + tableName +
                        " (" + String.join(", ", columns) + ");"
        );
        System.out.println(
                "Query executed successfully: \n" +
                        "Query: \n" +
                        ps.toString()
        );
        ps.executeUpdate();
        ps.close();
    }
    
    /**
     * Questo metodo selezione tutto da una tabella
     *
     * @param tableName
     * @throws Exception
     */
    public void selectAllQuery(String tableName) throws Exception {
        Statement stmt = this.conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from " + tableName + ";");
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNum = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i <= columnsNum; i++) {
                if (i > 1) System.out.print(" - ");
                String columnValue = rs.getString(i);
                System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
            }
            System.out.println();
        }
        conn.close();
    }
    
    /**
     * Questo metodo seleziona specificatamente colonne della tabella
     * o se c'è un match per la stringa pointer con il valore '*'
     * esegui direttamente la selectAllQuery()
     *
     * @param pointer
     * @param tableName
     * @throws Exception
     */
    public void selectQuery(String pointer, String tableName) throws Exception {
        Statement stmt = this.conn.createStatement();
        if (!pointer.equals("*")) {
            ResultSet rs = stmt.executeQuery("SELECT " + pointer + " FROM " + tableName + ";");
            ResultSetMetaData rsmd = rs.getMetaData();
            int columnsNum = rsmd.getColumnCount();
            while (rs.next()) {
                for (int i = 1; i <= columnsNum; i++) {
                    if (i > 1) System.out.print(" - ");
                    String columnValue = rs.getString(i);
                    System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
                }
                System.out.println();
            }
        } else selectAllQuery(tableName);
        conn.close();
    }
    
    /**
     * Questo metodo cancella tutto da una tabella e notifica l'utente
     *
     * @param tableName
     * @throws Exception
     */
    public void deleteAllFromQuery(String tableName) throws Exception {
        PreparedStatement ps = this.conn.prepareStatement("delete from " + tableName);
        int rowsDeleted = ps.executeUpdate();
        System.out.println(rowsDeleted + " rows deleted from table " + tableName);
        ps.close();
        conn.close();
    }
    
    /**
     * Questo metodo utilizza la clausola where per indicare cosa andare ad eliminare
     * nella tabella
     *
     * @param tableName
     * @param pointer
     * @param dataValue
     * @throws Exception
     */
    public void deleteWhereQuery(String tableName, String pointer, String dataValue) throws Exception {
        PreparedStatement ps = this.conn.prepareStatement(
                "delete from " + tableName + " where " + pointer + " = ?;"
        );
        ps.setString(1, dataValue);
        int rowsDeleted = ps.executeUpdate();
        System.out.println(
                rowsDeleted + " rows deleted from " + tableName +
                        "\nWhere " + pointer + " is " + dataValue
        );
        ps.close();
        conn.close();
    }
    
    /**
     * Inserisce i valori nelle tabelle
     *
     * @param columns
     * @param values
     * @throws SQLException
     */
    public void insertInto(List<String> columns, List<String> values) throws SQLException {
        PreparedStatement ps = null;
        try {
            ps = this.conn.prepareStatement(
                    "insert into beverage (" + String.join(", ", columns) + ") " +
                            "values (" + String.join(", ", Collections.nCopies(columns.size(), "?")) + ")"
            );
        for (int i = 0; i < values.size(); i++) {
            ps.setString(i + 1, values.get(i));
        }
        int rowsInserted = ps.executeUpdate();
        System.out.println(rowsInserted + " row(s) inserted into beverage");
        } finally {
            if (ps != null) ps.close();
            if (conn != null) conn.close();
        }
    }
}

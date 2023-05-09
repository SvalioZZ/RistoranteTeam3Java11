package pietanze.connections;


import java.sql.*;
import java.util.Collections;
import java.util.List;

public class Connessioni {
    
    private static String url = "jdbc:mysql://localhost:3306/my_database";
    private static String username = "root";
    
    private static String password = "password";
    
    public static Connection connect() throws Exception {
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }
    
    public static void selectAllQuery(String tableName) throws Exception {
        Connection conn = connect();
        Statement stmt = conn.createStatement();
        
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
    }
    
    public static void selectQuery(String pointer, String tableName) throws Exception {
        Connection conn = connect();
        Statement stmt = conn.createStatement();
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
        } else {
            System.out.println("Select another command, there's a method for that: " +
                                       "\nPointer used: " + pointer);
        }
        stmt.close();
        conn.close();
    }
    
    public static void deleteWhereQuery(String tableName, String pointer, String dataValue) throws Exception {
        Connection conn = connect();
        PreparedStatement ps = conn.prepareStatement(
                "delete from " + tableName + " where " + pointer + " = ?;"
        );
        ps.setString(1, dataValue);
        int rowsDeleted = ps.executeUpdate();
        System.out.println(
                rowsDeleted + " rows eleted from " + tableName +
                        "\nWhere " + pointer + " is " + dataValue
        );
        ps.close();
        conn.close();
    }
    
    public static void deleteAllFromQuery(String tableName) throws Exception {
        Connection conn = connect();
        PreparedStatement ps = conn.prepareStatement("delete from " + tableName);
        int rowsDeleted = ps.executeUpdate();
        System.out.println(rowsDeleted + " rows deleted from table " + tableName);
        ps.close();
        conn.close();
    }
    
    public static void insertQuery(String tableName, List<String> columnNames, List<String> values) throws Exception {
        Connection conn = connect();
        PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO " + tableName + " (" + String.join(", ", columnNames) + ") VALUES (" +
                        String.join(", ", Collections.nCopies(columnNames.size(), "?")) + ")"
        );
        for (int i = 0; i < values.size(); i++) {
            ps.setString(i + 1, values.get(i));
        }
        int rowsInserted = ps.executeUpdate();
        System.out.println(rowsInserted + " row(s) inserted into " + tableName);
        ps.close();
        conn.close();
    }
    
}

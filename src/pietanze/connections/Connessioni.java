package pietanze.connections;


import java.sql.*;

public class Connessioni {

    private static String url = "jdbc:mysql://localhost:3306/my_database";
    private static String username = "root";
    
    private static String password = "password";
    
    public static Connection connect() throws Exception {
        Connection conn = DriverManager.getConnection(url, username, password);
        return conn;
    }
    
    public static void selectAllQuery( String tableName) throws Exception {
        Connection conn = connect();
        Statement stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery("select * from " + tableName);
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNum = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i < columnsNum; i++) {
                if (i > 1) System.out.print(" - ");
                String columnValue = rs.getString(i);
                System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
            }
            System.out.println();
        }
    }public static void selectQuery(String pointer, String tableName) throws Exception {
        Connection conn = connect();
        Statement stmt = conn.createStatement();
        
        ResultSet rs = stmt.executeQuery("select " + pointer + " from " + tableName + ";");
        ResultSetMetaData rsmd = rs.getMetaData();
        int columnsNum = rsmd.getColumnCount();
        while (rs.next()) {
            for (int i = 1; i < columnsNum; i++) {
                if (i > 1) System.out.print(" - ");
                String columnValue = rs.getString(i);
                System.out.print(rsmd.getColumnName(i) + ": " + columnValue);
            }
            System.out.println();
        }
    }

}

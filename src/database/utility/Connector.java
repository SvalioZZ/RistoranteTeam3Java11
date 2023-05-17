package database.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                ConnUtilityEnum.URL.getSqlUtil(),
                ConnUtilityEnum.USERNAME.getSqlUtil(),
                ConnUtilityEnum.PASSWORD.getSqlUtil()
        );
    }

}

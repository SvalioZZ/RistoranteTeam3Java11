package database.utility;

public enum ConnUtilityEnum {
    
    URL("jdbc:mysql://localhost:3306/my_database"),
    USERNAME("root"),
    PASSWORD("password");
    private String sqlUtil;
    ConnUtilityEnum(String sqlUtil) {
        this.sqlUtil = sqlUtil;
    }
    public String getSqlUtil() {
        return sqlUtil;
    }
}

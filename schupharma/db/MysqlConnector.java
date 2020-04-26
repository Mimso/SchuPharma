package schupharma.db;

import java.sql.*;

public class MysqlConnector {

    private static String mysqlDriver = "jdbc:mysql://";
    private static String dbhost      = "localhost";
    private static String dbport      = "3306";
    private static String dbname      = "mydb";
    private static String dbuser      = "root";
    private static String dbpass      = "";

    public static Statement getCon() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(mysqlDriver + dbhost + ':' + dbport + "/" + dbname + "?useServerPrepStmts=true", dbuser, dbpass);
            Statement stmt = con.createStatement();
            return stmt;
        } catch(Exception e) {
            return (Statement) e;
        }
    }
}

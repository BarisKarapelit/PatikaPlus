package week7.patikaClone.Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private Connection connection = null;
    public Connection connectDB() throws SQLException {
        this.connection = DriverManager.getConnection(Contanst.DB_URL, Contanst.DB_USERNAME, Contanst.DB_PASSWORD);
        return this.connection;
    }
    public static  Connection getConnection() throws SQLException {
        DBConnector dbConnector = new DBConnector();
        return dbConnector.connectDB();
    }
}

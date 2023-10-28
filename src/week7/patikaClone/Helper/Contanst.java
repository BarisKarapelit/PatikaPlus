package week7.patikaClone.Helper;

public class Contanst {
    public static final String APP_NAME = "Patika.dev Clone";
    public static final String APP_VERSION = "0.1";
    public static final String DB_NAME = "u621395494_patika";
    public static final String DB_URL = "jdbc:mysql://193.203.168.8:3306/" + DB_NAME;
    public static final String DB_USERNAME = "u621395494_patikadev";
    public static final String DB_PASSWORD = "04603Sb312.";
    public static final String LIST_QUERY = "SELECT * FROM user";
    public static final String SEARCH_QUERY = "SELECT * FROM user WHERE name LIKE '%{{name}}%' " +
            "AND username LIKE '%{{username}}%' ";
}

package week7.patikaClone.Helper;

public class Contanst {
    public static final String APP_NAME = "Patika.dev Clone";
    public static final String APP_VERSION = "0.2";
    public static final String DB_NAME = "u621395494_patika";
    public static final String DB_URL = "jdbc:mysql://193.203.168.8:3306/" + DB_NAME;
    public static final String DB_USERNAME = "u621395494_patikadev";
    public static final String DB_PASSWORD = "04603Sb312.";
    public static final String SEARCH_QUERY = "SELECT * FROM user WHERE name LIKE '%{{name}}%' " +
            "AND username LIKE '%{{username}}%' ";
    public static final String ADD_QUERY_PATIKA = "INSERT INTO patika (name) VALUES (?)";
    public static final String TITLE_PATIKA_UPDATE = "PatiKa Güncelle";
    public static final String UPDATE_QUERY_PATIKA = "UPDATE patika SET name = ? WHERE id = ?";
    public static final String DELETE_QUERY_PATIKA = "DELETE FROM patika WHERE id = ?";
    public static String LIST_QUERY(String table) {
        return "SELECT * FROM " + table;
    }
}

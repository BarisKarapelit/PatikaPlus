package week7.patikaClone.Model;

import week7.patikaClone.Helper.Contanst;
import week7.patikaClone.Helper.DBConnector;
import week7.patikaClone.Helper.Helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class User {
    private int id;
    private String name;
    private String username;
    private String password;
    private String type;

    public User() {
    }

    public User(int id, String name, String username, String password, String type) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static ArrayList<User> getList() {
        return databaseRun(Contanst.LIST_QUERY("user"), new ArrayList<>());
    }

    private static ArrayList<User> databaseRun(String query, ArrayList<User> userList) {
        try (Statement statement = DBConnector.getConnection().createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            User user;
            while (resultSet.next()) {
                user = setUser(resultSet);
                userList.add(user);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return userList;
    }

    private static User setUser(ResultSet resultSet) throws SQLException {
        User user;
        user = new User();
        user.setId(resultSet.getInt("id"));
        user.setName(resultSet.getString("name"));
        user.setUsername(resultSet.getString("username"));
        user.setPassword(resultSet.getString("password"));
        user.setType(resultSet.getString("type"));
        return user;
    }


    public static boolean add(String name, String username, String password, String type) {
        String query = "INSERT INTO user (name, username, password, type) VALUES(" +
                "'" + name + "'," +
                "'" + username + "'," +
                "'" + password + "'," +
                "'" + type + "'" +
                ")";
        User findUser = User.getFetch(username, password);
        if (findUser != null) {
            Helper.showMessage("Bu kullanici zaten var", "UYARI", 2);
            System.out.println("User already exists");
            return false;
        }
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            int response = statement.executeUpdate(query);
            if (response < 0) {
                Helper.showMessage("Kullanici eklenemedi", "UYARI", 2);
            }
            return response > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static User getFetch(String username, String password) {
        User user = null;
        String query = "SELECT * FROM user WHERE username = '" + username + "'";
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                user = setUser(resultSet);
                if (!user.getPassword().equals(password)) {
                    System.out.println("Different password");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
    public static User getFetch(int id) {
        User user = null;
        String query = "SELECT * FROM user WHERE id = '" + id + "'";
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                user = setUser(resultSet);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    public static boolean delete(int id) {
        String query = "DELETE FROM user WHERE id = " + id;
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            int response = statement.executeUpdate(query);
            return response > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean update(User user) {
        String query = "UPDATE user SET " +
                "name = '" + user.getName() + "'," +
                "username = '" + user.getUsername() + "'," +
                "password = '" + user.getPassword() + "'," +
                "type = '" + user.getType() + "'" +
                "WHERE id = " + user.getId();
        User findUser = User.getFetch(user.getUsername(), user.getPassword());
        ArrayList<String> userTypes = new ArrayList<>() {
            {
                add("operator");
                add("student");
                add("educator");
            }
        };
        if (findUser != null && findUser.getId() != user.getId()) {
            Helper.showMessage("Bu kullanici zaten var", "UYARI", 2);
            System.out.println("User already exists");
            return false;
        } else if (!userTypes.contains(user.getType())) {
            Helper.showMessage("Kullanici tipi gecersiz", "UYARI", 2);
            System.out.println("User type is invalid");
            return false;
        }
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            int response = statement.executeUpdate(query);
            return response > 0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static ArrayList<User> search(String name, String username, String type) {
        String searchQuery = Contanst.SEARCH_QUERY;
        searchQuery = searchQuery.replace("{{name}}", name != null ? name : "");
        searchQuery = searchQuery.replace("{{username}}", username != null ? username : "");
        searchQuery += !type.isEmpty() ? "AND type = '{{type}}' " : " ";
        searchQuery = searchQuery.replace("{{type}}", type != null ? type : "");
        String expected = searchQuery; // Set the expected variable to the updated searchQuery
        return databaseRun(searchQuery, new ArrayList<>());
    }


}

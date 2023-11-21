package week7.patikaClone.Model;

import week7.patikaClone.Helper.Contanst;
import week7.patikaClone.Helper.DBConnector;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Patika {
    private int id;
    private String name;

    public Patika(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static boolean delete(int id) {
        String query = Contanst.DELETE_QUERY_PATIKA;
        ArrayList<Course> courseArrayList = Course.getList();
        try {
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setInt(1, id);
            if ( preparedStatement.executeUpdate() != -1){
                for (Course course : courseArrayList) {
                    if (course.getPatika_id() == id) {
                       return Course.delete(course.getId());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
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

    public static ArrayList<Patika> getList() {
        ArrayList<Patika> patikaArrayList = new ArrayList<>();
        Patika patikaObject;
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(Contanst.LIST_QUERY("patika"));
            while (resultSet.next()) {
                patikaObject = new Patika(resultSet.getInt("id"), resultSet.getString("name"));
                patikaArrayList.add(patikaObject);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return patikaArrayList;
    }

    public static boolean addPatika(String name) {
        String query = Contanst.ADD_QUERY_PATIKA;
        try {
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setString(1, name);
            return preparedStatement.executeUpdate() != -1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean updatePatika(int id, String name) {
        String query = Contanst.UPDATE_QUERY_PATIKA;
        try {
            PreparedStatement preparedStatement = DBConnector.getConnection().prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, id);
            return preparedStatement.executeUpdate() != -1;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static Patika getFetch(int id) {
        String query = "SELECT * FROM patika WHERE id = '" + id + "'";
        return getPatika(null, query);
    }

    private static Patika getPatika(Patika patika, String query) {
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                patika = new Patika(resultSet.getInt("id"), resultSet.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return patika;
    }

    public static Patika getFetch(String name) {
        Patika patika = null;
        String query = "SELECT * FROM patika WHERE name = '" + name + "'";
        return getPatika(patika, query);
    }
}

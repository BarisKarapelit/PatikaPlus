package week7.patikaClone.Model;

import week7.patikaClone.Helper.Contanst;
import week7.patikaClone.Helper.DBConnector;

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
    public static ArrayList<Patika> getList(){
        ArrayList<Patika> patikaArrayList = new ArrayList<>();
        Patika patikaObject;
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(Contanst.LIST_QUERY_PATIKA);
            while (resultSet.next()){
                patikaObject = new Patika(resultSet.getInt("id"),resultSet.getString("name"));
                patikaArrayList.add(patikaObject);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return patikaArrayList;
    }
}

package week7.patikaClone.Model;

import week7.patikaClone.Helper.Contanst;
import week7.patikaClone.Helper.DBConnector;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Course {
    private int id;
    private int patika_id;
    private int user_id;
    private String name;
    private String language;
    private Patika patika;
    private User educator;

    public Course(int id, int patika_id, int user_id, String name, String language) {
        this.id = id;
        this.patika_id = patika_id;
        this.user_id = user_id;
        this.name = name;
        this.language = language;
        this.patika = Patika.getFetch(patika_id);
        this.educator = User.getFetch(user_id);
    }

    public static ArrayList<Course> getList() {
        ArrayList<Course> courseList = new ArrayList<>();
        Course course;
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            String query = Contanst.LIST_QUERY("course");
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                course = new Course(
                        resultSet.getInt("id"),
                        resultSet.getInt("patika_id"),
                        resultSet.getInt("user_id"),
                        resultSet.getString("name"),
                        resultSet.getString("language")
                );
                courseList.add(course);
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return courseList;
    }

    public static boolean add(int patika_id, int user_id, String name, String language) {
        String query = Contanst.INSERT_QUERY("course",
                new String[] {"patika_id", "user_id", "name", "language"},
                String.valueOf(patika_id),
                String.valueOf(user_id),
                name,
                language);
        try {
            Statement statement = DBConnector.getConnection().createStatement();
            statement.executeUpdate(query);
            return true;
        }catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPatika_id() {
        return patika_id;
    }

    public void setPatika_id(int patika_id) {
        this.patika_id = patika_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Patika getPatika() {
        return patika;
    }

    public void setPatika(Patika patika) {
        this.patika = patika;
    }

    public User getEducator() {
        return educator;
    }

    public void setEducator(User educator) {
        this.educator = educator;
    }
}

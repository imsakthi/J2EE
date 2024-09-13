package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBMethods {

    static String driver = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/user_db";
    static String user = "root";
    static String password = "sakthi";

    public void save(User u) throws Exception {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?,?,?,?)");
        ps.setInt(1, u.getId());
        ps.setString(2, u.getFirst_name());
        ps.setString(3, u.getLast_name());
        ps.setString(4, u.getEmail());
        ps.setString(5, u.getPassword());
        ps.setString(6, u.getDob());
        ps.setLong(7, u.getPhone());

        ps.executeUpdate();
        System.out.println("Data saved");
    }

    public User findById(int id) throws Exception {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps = con.prepareStatement("select * from user where id = ?");
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int uId = rs.getInt("id");
            String fname = rs.getString("fname");
            String lname = rs.getString("lname");
            String email = rs.getString("email");
            String password = rs.getString("password");
            String dob = rs.getString("dob");
            long phone = rs.getLong("phone");

            User u = new User();
            u.setId(uId);
            u.setFirst_name(fname);
            u.setLast_name(lname);
            u.setEmail(email);
            u.setPassword(password);
            u.setDob(dob);
            u.setPhone(phone);

            return u;
        } else {
            return null;
        }
    }

    public ArrayList<User> fetchAll() throws Exception {
        ArrayList<User> al = new ArrayList<>();
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, password);
        Statement s = con.createStatement();

        ResultSet rs = s.executeQuery("select * from user");

        while (rs.next()) {
            int id = rs.getInt("id");
            String fname = rs.getString("fname");
            String lname = rs.getString("lname");
            String email = rs.getString("email");
            String password = rs.getString("password");
            String dob = rs.getString("dob");
            long phone = rs.getLong("phone");

            User u = new User();
            u.setId(id);
            u.setFirst_name(fname);
            u.setLast_name(lname);
            u.setEmail(email);
            u.setPassword(password);
            u.setDob(dob);
            u.setPhone(phone);
            al.add(u);
        }

        return al;
    }

    public void delete(int id) throws Exception {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps = con.prepareStatement("delete from user where id = ?");
        ps.setInt(1, id);
        ps.executeUpdate();
        System.out.println("Data deleted");
    }

    public void Update(User u) throws Exception {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps = con.prepareStatement(
            "update user set fname = ?, lname = ?, email = ?, password = ?, dob = ?, phone = ? where id = ?");
        ps.setString(1, u.getFirst_name());
        ps.setString(2, u.getLast_name());
        ps.setString(3, u.getEmail());
        ps.setString(4, u.getPassword());
        ps.setString(5, u.getDob());
        ps.setLong(6, u.getPhone());
        ps.setInt(7, u.getId());

        ps.executeUpdate();
        System.out.println("Data updated");
    }

    public User findByEmail(String email) throws Exception {
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, password);
        PreparedStatement ps = con.prepareStatement("select * from user where email = ?");
        ps.setString(1, email);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int id = rs.getInt("id");
            String fname = rs.getString("fname");
            String lname = rs.getString("lname");
            String emailStr = rs.getString("email");
            String password = rs.getString("password");
            String dob = rs.getString("dob");
            long phone = rs.getLong("phone");

            User u = new User();
            u.setId(id);
            u.setFirst_name(fname);
            u.setLast_name(lname);
            u.setEmail(emailStr);
            u.setPassword(password);
            u.setDob(dob);
            u.setPhone(phone);

            return u;
        } else {
            return null;
        }
    }
}


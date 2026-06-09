package SMS;

import java.sql.*;
public class StudentDAOImpl implements StudentDAO{

    @Override
    public void addStudent(Student s){      // add_Student;

        try{
            Connection con = DBConnection.getConnection();

            // SQL Query;

            String sql = "INSERT INTO student VALUES(?,?,?)";

            // Create PreparedStatements;
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,s.getId());
            ps.setString(2,s.getName());
            ps.setString(3,s.getCity());

            ps.execute();

            System.out.println("Student Added Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



}

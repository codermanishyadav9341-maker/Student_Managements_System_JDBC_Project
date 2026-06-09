package SMS;

import com.mysql.cj.protocol.Resultset;

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



    // ---------:View Student:-----------

    @Override
    public void viewStudent(){

         try{
             Connection con = DBConnection.getConnection();


             PreparedStatement ps = con.prepareStatement("SELECT *FROM student");

             ResultSet rs = ps.executeQuery();

             while(rs.next()){
                 System.out.println(
                         rs.getInt(1)+ " " +
                                 rs.getString(2)+ " " +
                                 rs.getString(3)


                 );
             }

             con.close();

         }
          catch(Exception e){

             e.printStackTrace();
          }
    }


    //:-----------------------------------------Search Student:---------------------------------------------------:

    @Override
    public void searchStudent(int id){

        try{
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT *FROM student WHERE id = ?");

            ps.setInt(1,id);

            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()){
                System.out.println(
                        resultSet.getInt(1)+ " " +
                                resultSet.getString(2)+ " " +
                                resultSet.getString(3)
                );
            }
            con.close();
        }
          catch(Exception e){
            e.printStackTrace();
          }
    }

    //---------------------------------------------Update Student:----------------------------------------------------;
    @Override
    public void updateStudent(int id ,String name,String city){

        try{
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("UPDATE student SET city = ? WHERE id = ?");

            ps.setString(1,city);
            ps.setInt(2,id);

            ps.executeUpdate();

            System.out.println("Update Student");

            con.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}

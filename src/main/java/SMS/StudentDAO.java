package SMS;

public interface StudentDAO {

    void addStudent(Student s);

    void viewStudent();

    void searchStudent(int id);

    void updateStudent(int id, String name,String city);

    void deleteStudent(int id);

}

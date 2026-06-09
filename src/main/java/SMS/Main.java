package SMS;

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        StudentDAO dao = new StudentDAOImpl();
        while(true){

            System.out.println(":---------------------:STUDENT MANAGEMENTS SYSTEM:------------------------:");
            System.out.println("1.Add Student");
            System.out.println("2.View Student");
            System.out.println("3.Search Student");
            System.out.println("4.Update Student");
            System.out.println("5.Delete Student");
            System.out.println("5.Exit");


            System.out.print("Enter Choice:- ");
            int choice = scan.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter ID:- ");
                    int id = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Student Name:- ");
                    String name = scan.nextLine();

                    System.out.print("Enter City:- ");
                    String city = scan.nextLine();

                    dao.addStudent(
                            new Student(id,name,city)
                    );

                    break;

                case 2:
                    dao.viewStudent();
                    break;

                case 3:
                    System.out.print("Enter id:- ");
                     id = scan.nextInt();
                dao.searchStudent(id);
                break;

                case 4:
                    System.out.print("New ID:- ");
                    id = scan.nextInt();

                    System.out.print("Enter new Student Name:- ");
                    name = scan.nextLine();

                    System.out.print("New City:- ");
                    city = scan.nextLine();
                    dao.updateStudent(id,name,city);
                    break;

                case 5:
                    System.out.print("Enter id:- ");
                    id = scan.nextInt();


            }
        }

    }
}

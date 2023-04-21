package labapi;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementModule {

    ArrayList<Student> stdList = new  ArrayList<Student>();
    public ArrayList<Student> createStudentList(){
        stdList.add(new Student("1111", "Thana", 3.0));
        stdList.add(new Student("2211", "Somchai ", 2.10));
        stdList.add(new Student("3331", "Supansa ", 3.1));

        return stdList;
    }
    public int addStudent(){
        Scanner sc =new Scanner(System.in);
        int num = 0;
        char ans = 'y';
        System.out.println("*** Add new student ***");
        do {
            System.out.print("Enter ID:");
            String id = sc.next();
            sc.nextLine();
            System.out.print("Enter Name:");
            String name = sc.nextLine();
            System.out.print("Enter GPA:");
            double gpa = sc.nextDouble();
            Student sobj = new Student(id, name, gpa);
            stdList.add(sobj);
            num++;
            System.out.print("Add more? [y|n]: ");
            ans = sc.next().charAt(0);
        } while (ans == 'y');
        return num;
    }
    public void printStudentsList(){

        for (int i = 0; i < stdList.size(); i++) {
            System.out.print((i+1) + ". ");
            stdList.get(i).printStudentInfo();
        }
    }

    public void updateStudent(){
        //search student in ArrayList and remove
        Scanner sc = new Scanner(System.in);
        System.out.print("Search student by ID: ");
        String id = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < stdList.size(); i++) {
            if (stdList.get(i).id.equals(id)) {
                stdList.get(i).printStudentInfo();
                found = true;
                System.out.print("Do you want to delete or edit GPA? [d|e]: ");
                char ans = sc.nextLine().charAt(0);
                if (ans == 'd') {
                    stdList.remove(i);
                    System.out.println("Deleted successfully.");
                }
                if (ans == 'e'){
                    System.out.print("Enter new GPA: ");
                    double newgpa = sc.nextDouble();
                    stdList.get(i).gpa = newgpa;
                    System.out.println("Update successfully.");
                }

            }
        }
        if (!found) {
            System.out.println("Not found.");
        }


    }
    public void searchStudentByName(String keyword){
        Student std = null;
        for (int i = 0; i < stdList.size(); i++) {
            if (stdList.get(i).name.contains(keyword)) {
                stdList.get(i).printStudentInfo();
            }
        }
    }

}

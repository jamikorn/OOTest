package labapi;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistrationSystem {

    static ArrayList<Subject> sbjList = new ArrayList<Subject>();
    static ArrayList<Student> stdList = new ArrayList<Student>();

    public static void showMenu(){
        System.out.println("**** REGISTRATION SYSTEM ****");
        System.out.println("1 : Show student list");
        System.out.println("2 : Add new student");
        System.out.println("3 : Edit/delete student");
        System.out.println("4 : Search student by name");
        System.out.println("5 : Show subject list");
        System.out.println("6 : Register");
        System.out.println("9 : Exit");
        System.out.println("******************************");
        System.out.print("Select menu: ");
    }
    public static void addSubjectList(){
        sbjList.add(new Subject("977-210", "OOP", 3));
        sbjList.add(new Subject("977-200", "Calculus", 3));
        sbjList.add(new Subject("977-216", "Computer Architecture", 3));
        sbjList.add(new Subject("969-092", "E-Sport", 1));
        sbjList.add(new Subject("980-096", "Scuba Diving", 1));
        sbjList.add(new Subject("969-061", "Systematic Solving", 2));
        sbjList.add(new Subject("988-061", "Logical Thinking", 2));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementModule smm = new StudentManagementModule();
        stdList = smm.createStudentList();
        addSubjectList();

        showMenu();
        int menu = sc.nextInt();

        do  {
            switch (menu) {
                case 1:
                    System.out.println("Student List...");
                    smm.printStudentsList();
                    break;
                case 2:

                    int num = smm.addStudent();
                    System.out.println("Added " + num + " record(s) successfully.");
                    smm.printStudentsList();
                    break;
                case 3:
                    System.out.println("Edit/delete student..");
                    smm.updateStudent();
                    smm.printStudentsList();
                    break;
                case 4:
                    System.out.println("Search student by name...");
                    System.out.print("Enter name:");
                    String keyword = sc.next();
                    smm.searchStudentByName(keyword);
                    break;
                case 5:
                    System.out.println("Subject List...");
                    for (Subject sbj : sbjList ) {
                        sbj.printSubject();
                    }

                    break;

                case 6:
                    RegisterModule rm = new RegisterModule(stdList, sbjList);
                    rm.register();
                    break;
            }
            showMenu();
            menu = sc.nextInt();
        } while (menu != 9);

        System.out.println("Bye...");
    }
}

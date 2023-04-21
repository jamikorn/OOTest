package labapi;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayListDemo {

        public static void main(String[] args) {

            ArrayList<Student> stdList = new ArrayList<Student>();
            System.out.println("stdList size = " + stdList.size());

            //add new student object to stdList
            stdList.add(new Student("1111", "Thana", 3.0));
            stdList.add(new Student("2211", "Somchai ", 2.10));
            stdList.add(new Student("3331", "Supansa ", 3.1));

            //assign student object to stdList
            Student sobj;
            sobj = new Student("4444", "Yamada Taro", 4.0);
            stdList.add(sobj);

            sobj = new Student("5555", "Harry Potter", 3.5);
            stdList.add(sobj);

            //print size of array list
            System.out.println("stdList size = " + stdList.size());

            //print the forth student (index = 3)
            System.out.println(stdList.get(3).id + " " + stdList.get(3).name);
            stdList.get(3).printStudentInfo();

            //print all students in array list
            System.out.println("Print student in stdList with for-loop");
            for (int i = 0; i < stdList.size(); i++) {
                stdList.get(i).printStudentInfo();
            }

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

            //print all students in array list with for-each
            System.out.println("Print student in stdList with for-each");
            for (Student std : stdList) {
                std.printStudentInfo();
            }

            //print with toString()
            System.out.println(stdList);
            String test = "Java8 makes Java more powerful";
            boolean isFound = test.contains("Jav"); // true

            System.out.println(isFound);
        }
    }



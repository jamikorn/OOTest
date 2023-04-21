package labapi;
import java.util.ArrayList;
import java.util.Scanner;


public class RegisterModule {
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> stdlist;
    ArrayList<Subject> sbjlist;
    StudentRegistResult stdRegRsl;

    public RegisterModule(ArrayList<Student> stdlist, ArrayList<Subject> sbjlist){
        this.stdlist = stdlist;
        this.sbjlist = sbjlist;

    }


    public Subject searchSubject() {

        System.out.print("Enter subject ID:" );
        String subjectId = sc.nextLine();

        for (Subject s : sbjlist) {
            if (s.id.equals(subjectId)) {
                s.printSubject();
                return (Subject) s;
            }
        }

        return null;
    }

        public Student searchStudent(){

            System.out.print("Enter student ID:");
            String studentId = sc.nextLine();

            for (Student s : stdlist) {
                if (s.id.equals(studentId)) {
                    s.printStudentInfo();
                    return (Student) s;
                }
            }

            return null;
        }



    public void register() {
        Student std = null;
        char ans;
        do {
            ans = 'y';
            std = searchStudent();
            if (std != null) {
                stdRegRsl = new StudentRegistResult(std.id, std.name);
                stdRegRsl.sbjlist = new ArrayList<Subject>();

                break;
            } else {
                System.out.print("Student ID not found. Do you want to search again? [y|n]:");
                ans = sc.nextLine().charAt(0);
                if (ans == 'n')
                    break;
            }

        } while (ans == 'y');


        if (std != null){
            System.out.println("**Select subjects for registration**");

            //search subject if found -> confirm regist
            Subject sbj = null;

            //subject = searchSubject();
            do {
                ans = 'y';
                sbj = searchSubject();
                if (sbj != null) {

                    System.out.print("Do you want to enroll this subject? [y|n]:");
                    ans = sc.nextLine().charAt(0);
                    if (ans == 'n')
                        continue;
                    if (ans == 'y')
                        stdRegRsl.sbjlist.add(sbj);
                } else {
                    System.out.print("Subject ID not found. Do you want to search again? [y|n]:");
                    ans = sc.nextLine().charAt(0);
                    if (ans == 'n')
                        break;
                }

            } while (ans == 'y');

        }

        stdRegRsl.printRegisterResult();
        }



}

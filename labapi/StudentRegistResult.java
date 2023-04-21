package labapi;

import java.util.ArrayList;

public class StudentRegistResult {
    String id;
    String name;
    ArrayList<Subject> sbjlist;

    public StudentRegistResult(String id, String name) {
        this.id = id;
        this.name = name;

    }
    public void printRegisterResult(){
        int totalCredit = 0;
        System.out.println("****REGISTRATION RESULT OF SEMESTER 2/2022***");
        System.out.println("Student ID: " + id + " Name: " + name);
        System.out.println("-------------------------------------");
        for (Subject sbj : sbjlist){
            sbj.printSubject();
            totalCredit += sbj.credit;
        }
        System.out.println("-------------------------------------");
        System.out.println("Total credits = "  + totalCredit);
        System.out.println("-------------------------------------");


    }
}

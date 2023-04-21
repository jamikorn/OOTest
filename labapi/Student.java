package labapi;
class Student {
    String id;
    String name;
    double gpa;

    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;

    }
    public void printStudentInfo(){
        System.out.println("Student ID:" + id + " Name:"+name+" GPA: "+ gpa);

    }
}

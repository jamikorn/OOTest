package labapi;
public class Subject {
    String id;
    String title;
    int credit;

    public Subject(String id, String title, int credit) {
        this.id = id;
        this.title = title;
        this.credit = credit;
    }
    public void printSubject(){
        System.out.println("Subject: " + id + " " + title + "("+ credit+ " credits)");
    }

}
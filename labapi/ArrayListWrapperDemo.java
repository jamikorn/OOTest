import java.util.ArrayList;

public class ArrayListWrapperDemo {
    public static void main(String[] args) {

        //declare a reference to ArrayList of String
        ArrayList<Integer> intlist = new ArrayList<Integer>();

        intlist.add(4);
        intlist.add(10);
        intlist.add(67);
        intlist.add(34);
        intlist.add(8);
        System.out.println(intlist);

        ArrayList<Double> dlist = new ArrayList<Double>();
        dlist.add(4.5);
        dlist.add(10D);
        dlist.add(1,20d);
        System.out.println(dlist);

    }
}

import java.util.ArrayList;

public class ArrayListStringDemo {
    public static void main(String[] args) {

        //declare a reference to ArrayList of String
        ArrayList<String> myList = new ArrayList<String>();

        //add String to ArrayList
        myList.add("Eric");
        myList.add("Bob");
        myList.add("Steve");

        //get number of elements in ArrayList
        myList.size();

        //get element by its index
        myList.get(1);

        //print all elements with for-loop
        System.out.println("print with for-loop");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        //print all element with for-each loop
        System.out.println("print with for-each");
        for (String name : myList) {
            System.out.println(name);
        }

        /* print with toString() */
        System.out.println(myList.toString());

        //่insert element at index 1
        myList.add(1, "Mary");
        System.out.println("insert Marry at index 1");
        System.out.println(myList);

        //replace an existing item, use the set method:
        myList.set(2, "Becky");
        System.out.println("Replace Becky at index 2");
        System.out.println(myList);

        // remove the first element
        myList.remove(0);
        System.out.println("remove element at index 0");
        System.out.println(myList);

        //Removes all of the elements from this list.
        myList.clear();
        System.out.println(myList);
        System.out.println(myList.size());
    }
    }

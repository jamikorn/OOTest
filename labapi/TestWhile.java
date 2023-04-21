package labapi;

import java.util.Scanner;

public class TestWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        String x = "y";

        do {
            System.out.println("test");
            System.out.println("Enter x");
            x = sc.nextLine();
        } while (x.equals("y"));
        System.out.println(".....");
    }
}

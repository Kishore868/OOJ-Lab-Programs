package CIE;

import java.util.Scanner;

public class Internals extends Student {
    protected int marks[] = new int[5];

    public void inputCIEmarks() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Internal Marks for 5 courses:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for course " + (i + 1) + ": ");
            marks[i] = s.nextInt();
        }
    }
}

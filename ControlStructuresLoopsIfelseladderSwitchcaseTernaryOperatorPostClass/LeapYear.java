package Assignments.ControlStructuresLoopsIfelseladderSwitchcaseTernaryOperatorPostClass;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Capture the user's input
        Scanner scanner = new Scanner(System.in);
        //Storing the captured value in a variable
        int n = scanner.nextInt();
        leapYear(n);
    }

    static void leapYear(int year) {
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

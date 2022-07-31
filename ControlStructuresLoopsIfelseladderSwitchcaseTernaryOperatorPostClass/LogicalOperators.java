package Assignments.ControlStructuresLoopsIfelseladderSwitchcaseTernaryOperatorPostClass;

import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print((a <= 10) && (b >= 10));
        if ((a % 2 == 0) || (b % 2 == 0)) {
            System.out.print(" " + "true");
        } else {
            System.out.print(" " + "false");
        }
        System.out.print(" " + !(a == b));
    }
}

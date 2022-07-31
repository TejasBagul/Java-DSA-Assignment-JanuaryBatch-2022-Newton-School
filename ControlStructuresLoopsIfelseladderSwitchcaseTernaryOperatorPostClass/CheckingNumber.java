package Assignments.ControlStructuresLoopsIfelseladderSwitchcaseTernaryOperatorPostClass;

import java.util.Scanner;

public class CheckingNumber {
    public static int checkResult(int n) {
        if (n > 0) {
            return 1;
        } else if (n < 0) {
            return 0;
        } else {
            return -1;
        }
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = checkResult(n);

        switch (result) {
            case 0 -> {
                System.out.print("Negative");
            }
            case 1 -> System.out.print("Positive");
            default -> System.out.print("Zero");
        }

    }
}

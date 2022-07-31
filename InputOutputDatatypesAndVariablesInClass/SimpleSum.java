package Assignments.InputOutputDatatypesAndVariablesInClass;

import java.util.Scanner;

public class SimpleSum {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int sum = A + B + C;
        System.out.println(sum);
    }
}

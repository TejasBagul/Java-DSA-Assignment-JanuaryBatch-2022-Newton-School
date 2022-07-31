package Assignments.FunctionsDSAInClass;

import java.util.Scanner;

public class MohitAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Storing the captured value in a variable
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int result = Average(A, B, C);
        System.out.println(result);
    }

    static int Average(int A, int B, int C) {
        return (A + B + C) / 3;
    }
}

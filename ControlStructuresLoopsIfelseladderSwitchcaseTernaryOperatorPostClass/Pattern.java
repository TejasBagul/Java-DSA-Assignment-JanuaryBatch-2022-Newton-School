package Assignments.ControlStructuresLoopsIfelseladderSwitchcaseTernaryOperatorPostClass;

import java.util.Scanner;


public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternStar(n);
    }

    static void patternStar(int N) {
        //Enter your code here
        System.out.println("*");
        for (int row = 0; row < N - 2; row++) {
            System.out.print("*");
            for (int col = 0; col <= row; col++) {
                System.out.print("^");
            }
            System.out.println("*");
        }
        for (int i = 0; i <= N; i++) {
            System.out.print("*");
        }
    }
}

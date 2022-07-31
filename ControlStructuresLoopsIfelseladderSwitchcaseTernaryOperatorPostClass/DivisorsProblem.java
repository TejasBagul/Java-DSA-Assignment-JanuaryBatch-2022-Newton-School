package Assignments.ControlStructuresLoopsIfelseladderSwitchcaseTernaryOperatorPostClass;

import java.util.Scanner;

public class DivisorsProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(DivisorProblem(N));
    }

    static int DivisorProblem(int N) {

        int count = 0;
        while (N > 1) {
            N = second_max(N);
            count++;
        }
        return count;
    }

    public static int second_max(int N) {
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return N / i;
            }
        }
        return 1;
    }
}

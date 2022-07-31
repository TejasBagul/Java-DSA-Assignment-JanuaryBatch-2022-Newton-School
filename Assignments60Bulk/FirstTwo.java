package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class FirstTwo {
    static int firstTwo(int N) {
        int revNum = 0;
        while (N > 100) {
            int remider = N % 10;
            N = N / 10;
        }
        while (N > 0) {
            int remider = N % 10;
            N = N / 10;
            revNum = revNum * 10 + remider;
        }
        return revNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(firstTwo(N));
    }
}

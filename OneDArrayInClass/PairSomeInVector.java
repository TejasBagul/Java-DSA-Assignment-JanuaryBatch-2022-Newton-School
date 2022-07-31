package Assignments.OneDArrayInClass;

import java.util.Scanner;

public class PairSomeInVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[2 * N];
        for (int i = 0; i < 2 * N; i++) {
            arr[i] = sc.nextInt();
        }

        long sum = 0;
        for (int i = 0; i < 2 * N; i++) {
            if (i % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }
}

package Assignments.Contest;

import java.util.Scanner;

public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        for (int k = 0; k < n; k++) {
            if (arr[k] > 0) {
                sum = sum + arr[k];
            }
        }
        System.out.println(sum);

    }
}

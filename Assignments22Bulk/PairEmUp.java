package Assignments.Assignments22Bulk;

import java.util.Arrays;
import java.util.Scanner;

public class PairEmUp {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int left = 0, right = N - 1;
        int maxValue = -1;

        while (left < right) {
            maxValue = Math.max(maxValue, arr[left] + arr[right]);
            left++;
            right--;
        }
        System.out.println(maxValue);
    }
}

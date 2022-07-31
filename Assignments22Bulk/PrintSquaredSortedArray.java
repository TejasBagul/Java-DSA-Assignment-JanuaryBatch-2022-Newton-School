package Assignments.Assignments22Bulk;

import java.util.Scanner;

public class PrintSquaredSortedArray {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int left = 0, right = n - 1;
            int[] ans = new int[n];
            int idx = n - 1;
            while (left <= right) {
                if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                    ans[idx] = arr[left] * arr[left];
                    idx--;
                    left++;
                } else {
                    ans[idx] = arr[right] * arr[right];
                    idx--;
                    right--;
                }
            }

            for (int i : ans) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}

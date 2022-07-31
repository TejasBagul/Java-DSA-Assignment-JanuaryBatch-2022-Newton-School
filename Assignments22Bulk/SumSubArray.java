package Assignments.Assignments22Bulk;

import java.util.Scanner;

public class SumSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        int arr[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 1;
        long s = 0;
        int ans = n;
        for (int i = 1; i <= n; ++i) {
            while (s < k && j <= n) {
                s += arr[j];
                ++j;
            }
            if (s >= k) {
                ans = Math.min(ans, j - i);
            }
            s -= arr[i];
        }
        System.out.print(ans);
    }
}

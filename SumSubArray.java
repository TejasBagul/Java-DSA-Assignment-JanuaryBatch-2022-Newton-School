package Assignments;

import java.util.Scanner;

public class SumSubArray {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        int[] arr = new int[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minGoodArray(arr, n, k));
    }

    public static int minGoodArray(int[] arr, long n, long k) {
        int res = Integer.MAX_VALUE;
        long sum = 0;
        int l = 0, r = 0;
        while (r < n) {
            while (sum < k && r < n) {
                sum = sum + arr[r];
                r++;
            }
            while (sum >= k && l < n) {
                res = Math.min(res, r - l);
                sum = sum - arr[l];
                l++;
            }
        }
        return res;
    }
}

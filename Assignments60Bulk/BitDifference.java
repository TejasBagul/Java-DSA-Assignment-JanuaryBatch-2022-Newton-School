package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class BitDifference {
    public static long solution(int[] a) {
        long res = 0;
        for (int i = 0; i < 32; i++) {
            long count = 0;
            for (int val : a) {
                if ((val & (1 << i)) != 0) {
                    count++;
                }
            }
            long countoff = a.length - count;
            long diff = count * countoff * 2;
            res += diff;
        }
        return res % 1000000007;
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(solution(a));
    }
}

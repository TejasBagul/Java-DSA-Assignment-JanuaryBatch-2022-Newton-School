package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class SimpleNumber {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long L = sc.nextLong();
        long R = sc.nextLong();
        long K = sc.nextLong();
        long count = 0;
        count = L / K;
        if (L % K == 0) {
            count--;
        }
        count = (R / K) - count;
        System.out.println(count);
    }
}

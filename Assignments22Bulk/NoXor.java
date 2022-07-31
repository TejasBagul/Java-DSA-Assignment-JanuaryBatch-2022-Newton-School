package Assignments.Assignments22Bulk;

import java.util.Scanner;

public class NoXor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        long sum = 0;
        for(int i = 1; i < n + 1; i++){
            sum = sum + ((n - i) ^ a[i - 1]);
        }
        System.out.println(sum);
        sc.close();
    }
}

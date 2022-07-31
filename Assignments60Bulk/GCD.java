package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class GCD {
    public static long gcd(long n, long m){
        if(m == 0){
            return n;
        }
        return gcd(m, n % m);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(gcd(n, m));
    }
}

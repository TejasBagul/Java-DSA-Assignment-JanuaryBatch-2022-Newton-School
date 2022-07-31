package Assignments;

import java.util.Scanner;

public class DeadlyExponentiation {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        int modulo = 1000000007;
        long result = (long) Math.pow(c, d);
        //long result = exponentiation(c,d,modulo-1);
        result = exponentiation(b, result, modulo - 1);
        result = exponentiation(a, result, modulo);
        System.out.println(result);

    }

    public static long exponentiation(long x, long y, int modulo) {
        long res = 1;
        while (y > 0) {
            if ((y & 1) == 1) {
                res = ((res) * (x % modulo)) % modulo;
            }
            y = y >> 1;
            x = ((x) * (x)) % modulo;
        }
        return res;
    }

}

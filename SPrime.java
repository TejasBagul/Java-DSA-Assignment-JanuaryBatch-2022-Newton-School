package Assignments;

import java.util.Arrays;
import java.util.Scanner;

class  SPrime{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean[] prime = new boolean[10000001];
        Arrays.fill(prime, true);
        for (int i = 2; i * i < prime.length; i++) {
            if (prime[i]) {
                for (int j = i * i; j < prime.length; j += i) {
                    prime[j] = false;
                }
            }
        }

        int t = s.nextInt();
        while (t > 0) {
            int count = 0;
            int n = s.nextInt();
            for (int i = (n / 2 + 1); i <= n; i++) {
                if (prime[i]) {
                    count++;
                }
            }
            System.out.println(count);
            t--;
        }
    }
}
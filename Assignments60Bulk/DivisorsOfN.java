package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class DivisorsOfN {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            int N = sc.nextInt();
            int count = 0;
            for (int i = 1; i <= Math.sqrt(N); i++) {
                if ((N % i) == 0) {
                    if ((i % 2) == 0) {
                        count++;
                    }
                    if (i * i != N) {
                        if ((N / i) % 2 == 0) {
                            count++;
                        }
                    }

                }
            }
            System.out.println(count);
            T--;
        }
    }
}

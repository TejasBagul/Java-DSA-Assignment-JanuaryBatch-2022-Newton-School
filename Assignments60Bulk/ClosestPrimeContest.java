package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class ClosestPrimeContest {
    private static boolean checkIfNumberIsPrime(int n) {
        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("2");
        } else {
            boolean isNPrime = checkIfNumberIsPrime(n);

            if (isNPrime) {
                System.out.println(n);
            } else {
                //find prime number before n
                int primeNumberBeforeN;

                for (int i = n - 1; ; i--) {
                    if (checkIfNumberIsPrime(i)) {
                        primeNumberBeforeN = i;
                        break;
                    }
                }

                //find prime number after n
                int primeNumberAfterN;
                for (int i = n + 1; ; i++) {
                    if (checkIfNumberIsPrime(i)) {
                        primeNumberAfterN = i;
                        break;
                    }
                }

                if (n - primeNumberBeforeN < primeNumberAfterN - n) {
                    System.out.println(primeNumberBeforeN);
                } else if (n - primeNumberBeforeN > primeNumberAfterN - n) {
                    System.out.println(primeNumberAfterN);
                } else {
                    System.out.println(primeNumberBeforeN);
                }
            }
        }
    }
}

package Assignments.Assignments22Bulk;

import java.util.Scanner;

public class FindIt {
    public static int findInteger(long givenInteger) {
        for (long i = 1; i < (long)(Math.sqrt(givenInteger)); i++) {
            long calculatedEquation = (i * i) + (3 * i);
            if (calculatedEquation == givenInteger) return (int)(i);
        }

        return -1;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        long givenInteger = sc.nextLong();

        System.out.println(findInteger(givenInteger));

        sc.close();
    }
}

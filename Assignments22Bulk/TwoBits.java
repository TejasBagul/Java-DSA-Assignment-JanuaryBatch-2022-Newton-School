package Assignments.Assignments22Bulk;

import java.util.Scanner;

public class TwoBits {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = Long.MAX_VALUE;

        for(long i = 0; i < 63; i++){
            long first = (1L << i);
            for(long j = i + 1; j < 63; j++){
                long second = (1L << j);
                long number = first | second;
                y = Math.min(y, Math.abs(x - number));
            }
        }
        System.out.println(y);

    }
}

package Assignments.Assignments22Bulk;

import java.util.Scanner;

public class MohitAndArray {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N-1];
        for (int index = 0; index < N - 1; index++){
            arr[index] = in.nextInt();
        }

        long totalSum = ((long) N * (N + 1)) / 2;
        long SumOfValue = 0;
        for (int i = 0; i < N - 1; i++){
            SumOfValue = SumOfValue + arr[i];
        }
        long res = totalSum - SumOfValue;
        System.out.println(res);
    }
}

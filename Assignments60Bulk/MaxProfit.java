package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class MaxProfit {
    static int maxProfit(int[] A, int n) {
        int[] profit = new int[n];
        for (int i = 0; i < n; i++) {
            profit[i] = 0;
        }

        int maxPrice = A[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (A[i] > maxPrice)
                maxPrice = A[i];
            profit[i] = Math.max(profit[i + 1], maxPrice - A[i]);
        }

        int minPrice = A[0];
        for (int i = 1; i < n; i++) {
            if (A[i] < minPrice)
                minPrice = A[i];
            profit[i] = Math.max(profit[i - 1], profit[i] + (A[i] - minPrice));
        }
        int result = profit[n - 1];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        System.out.println(maxProfit(A, N));
    }
}

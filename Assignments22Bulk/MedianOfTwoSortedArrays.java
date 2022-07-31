package Assignments.Assignments22Bulk;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }
        System.out.printf("%.2f", Median(arr, brr));
    }

    static double Median(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;
        if (n > m)
            return Median(B, A);

        int start = 0;
        int end = n;
        int midMergedArray = (n + m + 1) / 2;

        while (start <= end) {
            int mid = (start + end) / 2;
            int leftBSize = midMergedArray - mid;
            int leftA
                    = (mid > 0)
                    ? A[mid - 1]
                    : Integer.MIN_VALUE;
            int leftB
                    = (leftBSize > 0) ? B[leftBSize - 1] : Integer.MIN_VALUE;
            int rightA
                    = (mid < n) ? A[mid] : Integer.MAX_VALUE;
            int rightB
                    = (leftBSize < m) ? B[leftBSize] : Integer.MAX_VALUE;
            if (leftA <= rightB && leftB <= rightA) {
                if ((m + n) % 2 == 0)
                    return (Math.max(leftA, leftB)
                            + Math.min(rightA, rightB))
                            / 2.0;
                return Math.max(leftA, leftB);
            } else if (leftA > rightB) {
                end = mid - 1;
            } else
                start = mid + 1;
        }
        return 0.0;
    }
}

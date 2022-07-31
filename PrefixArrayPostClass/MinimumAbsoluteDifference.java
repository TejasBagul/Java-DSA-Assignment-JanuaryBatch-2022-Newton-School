package Assignments.PrefixArrayPostClass;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifference {
    static int minimumAbsoluteDifference(int[] arr) {
        int minAbsDiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);
            if (diff < minAbsDiff) {
                minAbsDiff = diff;
            }
        }
        return minAbsDiff;
    }

    /*
     * Method 1 will take O(n2)
     *
     * @param arr
     * @return
     */
    static int minimumAbsoluteDifferenceBruteForce(int[] arr) {
        int minAbsDiff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < minAbsDiff) {
                    minAbsDiff = diff;
                }
            }
        }
        return minAbsDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int m = minimumAbsoluteDifference(arr);
        System.out.println(m);
    }
}

package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfMinAbsDifferences(arr, n));

    }

    static int sumOfMinAbsDifferences(int[] arr, int n) {

        // sort the given array
        Arrays.sort(arr);

        // initialize sum
        int sum = 0;

        // min absolute difference for
        // the 1st array element
        sum += Math.abs(arr[0] - arr[1]);

        // min absolute difference for
        // the last array element
        sum += Math.abs(arr[n - 1] - arr[n - 2]);

        // find min absolute difference for
        // rest of the array elements and
        // add them to sum
        for (int i = 1; i < n - 1; i++)
            sum += Math.min(Math.abs(arr[i] - arr[i - 1]),Math.abs(arr[i] - arr[i + 1]));

        // required sum
        return sum;
    }
}

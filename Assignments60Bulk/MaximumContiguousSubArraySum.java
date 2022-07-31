package Assignments.Assignments60Bulk;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaximumContiguousSubArraySum {
    static long maxSum(int a[], int n) {
        long maxsum = -100000;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
            if (maxsum < sum)
                maxsum = sum;
            if (sum < 0)
                sum = 0;
        }
        return maxsum;
    }

    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {

            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(maxSum(arr, n));
        }
    }
}

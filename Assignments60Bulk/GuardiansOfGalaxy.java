package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class GuardiansOfGalaxy {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long low = 0;
        long high = Integer.MAX_VALUE;
        long ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long newThrust = mid;
            newThrust = gameThrust(arr, newThrust);
            if (newThrust >= 0) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(ans);
    }

    private static long gameThrust(int[] arr, long newThrust) {
        for (int j : arr) {
            newThrust = newThrust * 2 - j;
            if (newThrust >= Integer.MAX_VALUE) {
                return 1;
            }
            if (newThrust < 0) {
                return -1;
            }
        }
        return newThrust;
    }
}

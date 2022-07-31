package Assignments.Assignments60Bulk;

import java.util.Arrays;
import java.util.Scanner;

public class DTriplets {
    public static void main(String[] args) {
        // Your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        Arrays.sort(a);
        int i = 0, j = 2;

        long ans = 0;
        while (j != n) {
            if (i == j - 1) {
                j++;
                continue;
            }

            if ((a[j] - a[i]) > p)
                i++;
            else {
                int x = j - i;
                ans += ((long) x * (x - 1)) / 2;
                j++;
            }
        }
        System.out.print(ans);

    }
}

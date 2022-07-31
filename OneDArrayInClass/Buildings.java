package Assignments.OneDArrayInClass;

import java.util.Scanner;

public class Buildings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 1;
        int max = arr[0];

        for (int i = -1; i < n - 1; i--) {
            if (arr[i] < max) {
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }
}

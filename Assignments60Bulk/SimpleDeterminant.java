package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class SimpleDeterminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        int i, j, determinant;

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        determinant = (arr[0][0] * arr[1][1]) - (arr[1][0] * arr[0][1]);
        System.out.println(determinant);
    }
}

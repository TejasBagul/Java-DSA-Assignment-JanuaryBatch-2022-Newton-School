package Assignments.Contest;

import java.util.Scanner;

public class BalancedNeighborhood {
    static String balancedMatrix(int[][] mat, int N, int M) {

        // Flag for check matrix is balanced
        // or unbalanced
        boolean is_balanced = true;

        // Iterate row until condition is true
        for (int i = 0; i < N && is_balanced; i++) {

            // Iterate cols until condition is true
            for (int j = 0; j < M && is_balanced; j++) {

                // Check for corner edge elements
                if ((i == 0 || i == N - 1) &&
                        (j == 0 || j == M - 1)) {
                    if (mat[i][j] >= 2)
                        is_balanced = false;
                }

                // Check for border elements
                else if (i == 0 || i == N - 1 ||
                        j == 0 || j == M - 1) {
                    if (mat[i][j] >= 3)
                        is_balanced = false;
                } else {

                    // Check for the middle ones
                    if (mat[i][j] >= 4)
                        is_balanced = false;
                }
            }
        }

        // Return balanced or not
        if (is_balanced)
            return "NO";
        else
            return "YES";
    }

    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Function Call
        System.out.print(balancedMatrix(arr, N, M));
    }
}

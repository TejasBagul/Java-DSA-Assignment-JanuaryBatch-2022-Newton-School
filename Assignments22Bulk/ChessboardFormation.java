package Assignments.Assignments22Bulk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessboardFormation {
    public static void main(String[] args) throws IOException {
        // Your code here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String[] str = read.readLine().trim().split(" ");
            int N = Integer.parseInt(str[0]);
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                str = read.readLine().trim().split(" ");
                for (int j = 0; j < N; j++)
                    arr[i][j] = Integer.parseInt(str[j]);
            }
            System.out.println(movesToChessboard(arr));
        }
    }


    public static int movesToChessboard(int[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return -1;
        }
        int N = board.length;

        for (int[] ints : board) {
            for (int j = 0; j < N; ++j) {
                if ((board[0][0] ^ ints[0] ^ board[0][j] ^ ints[j]) == 1) {
                    return -1;
                }
            }
        }
        int rowSum = 0;
        int colSum = 0;
        int rowSwap = 0;
        int colSwap = 0;
        for (int i = 0; i < N; ++i) {
            rowSum += board[0][i];
            colSum += board[i][0];
            if (board[i][0] == i % 2) {
                ++rowSwap;
            }
            if (board[0][i] == i % 2) {
                ++colSwap;
            }
        }
        if (N / 2 > rowSum || N / 2 > (N - rowSum) ||
                N / 2 > colSum || N / 2 > (N - colSum)) {
            return -1;
        }
        if (N % 2 == 0) {
            rowSwap = Math.min(rowSwap, N - rowSwap);
            colSwap = Math.min(colSwap, N - colSwap);
        } else {
            if (colSwap % 2 == 1) {
                colSwap = N - colSwap;
            }
            if (rowSwap % 2 == 1) {
                rowSwap = N - rowSwap;
            }
        }
        return (rowSwap + colSwap) / 2;
    }

}

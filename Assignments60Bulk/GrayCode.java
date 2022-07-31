package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class GrayCode {
    static int grayCode(int n) {

        return n ^ (n >> 1);

    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();


            System.out.println(grayCode(n));
        }
    }
}

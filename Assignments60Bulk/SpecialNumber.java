package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        char[] singleint = x.toCharArray();
        int totalsum = 0;
        for (int i = 0; i < singleint.length; i++) {
            totalsum = singleint[i] + totalsum;
        }
        if (totalsum % 3 == 0) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }

}

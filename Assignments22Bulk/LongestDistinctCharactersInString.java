package Assignments.Assignments22Bulk;

import java.util.Scanner;

public class LongestDistinctCharactersInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase > 0) {
            String s = sc.next();
            int n = s.length();
            int[] arr = new int[256];
            // char to int convert
            // count a, b, c
            int ans = 0;
            int left = 0, right = 0;
            while (left < n && right < n) {
                char ch = s.charAt(right);
                //can I add curr char into my distinct list?
                if (arr[ch] != 0) {
                    // curr char is already present in the distinct string
                    while (left < n && arr[ch] != 0) {
                        char char2 = s.charAt(left);
                        arr[char2] = arr[char2] - 1;
                        left++;
                    }
                }
                arr[ch] = arr[ch] + 1;
                if (ans < (right - left + 1)) {
                    ans = right - left + 1;
                }
                right++;
                // find length of substring

            }
            System.out.println(ans);
            testcase--;
        }
    }
}

package Assignments;

import java.util.Scanner;

public class LongestDistinctCharacterInString {
    static boolean isDistinct(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase > 0) {
            String s = sc.next();
            int n = s.length();
            int arr[] = new int[256];

            int r = 0;
            int l = 0;
            while (r < n && arr[(int) s.charAt(r)] == 0) {
                char ch = s.charAt(r); //'a'
                int idx = (int) ch;
                arr[idx] = arr[idx] + 1;
                r++;
            }
            int max = l;
            // int r = l+1;

            while (r < n && l < n) {
                if (arr[(int) s.charAt(r)] != 0) {
                    while (!isDistinct(arr)) {
                        while (l < r) {
                            arr[(int) s.charAt(l)]--;
                            l++;
                        }
                    }
                }
                if ((r - l) > max)
                    max = r - l;
                arr[(int) s.charAt(r)]++;
                r++;

            }
            System.out.println();
            System.out.println(max);
            testcase--;
        }
    }
}

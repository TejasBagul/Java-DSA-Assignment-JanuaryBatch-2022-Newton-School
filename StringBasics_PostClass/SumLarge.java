package Assignments.StringBasics_PostClass;

import java.util.Scanner;

public class SumLarge {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] strNumbs = sc.nextLine().split(" ");
            System.out.print(findSum(strNumbs[0], strNumbs[1]));
    }

    static String findSum(String str1, String str2) {
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        StringBuilder str = new StringBuilder();

        int n1 = str1.length(), n2 = str2.length();

        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++) {
            int sum = ((str1.charAt(i) - '0') +
                    (str2.charAt(i) - '0') + carry);
            str.append((char) (sum % 10 + '0'));

            carry = sum / 10;
        }

        for (int i = n1; i < n2; i++) {
            int sum = ((str2.charAt(i) - '0') + carry);
            str.append((char) (sum % 10 + '0'));
            carry = sum / 10;
        }

        if (carry > 0)
            str.append((char) (carry + '0'));

        str = new StringBuilder(new StringBuilder(str.toString()).reverse().toString());

        return str.toString();

    }
}

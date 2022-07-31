package Assignments.StringBasics_PostClass;

import java.util.Scanner;

public class Dalindrome {
    public static boolean checkPalindrome(String s) {
        StringBuilder s2 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            s2.append(s.charAt(i));
        }
        return s2.toString().equals(s);
    }

    public static boolean dalindrome(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                String s = input.substring(i, j);
                if (s.length() > 1)
                    if (checkPalindrome(s))
                        return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (dalindrome(input) || input.length() == 1)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

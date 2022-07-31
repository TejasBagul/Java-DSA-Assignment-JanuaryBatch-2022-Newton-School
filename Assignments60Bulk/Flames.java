package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class Flames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder s1 = new StringBuilder(sc.next());
        StringBuilder s2 = new StringBuilder(sc.next());
        char c, d;
        int e;

        for (int i = 0; i < s1.length(); i++) {
            c = s1.charAt(i);
            for (int j = 0; j < s2.length(); j++) {
                d = s2.charAt(j);
                if (c == d) {
                    s1.deleteCharAt(i);
                    s2.deleteCharAt(j);
                    i--;
                    break;
                }
            }
        }

        s1.append(s2);

        e = s1.length() % 6;
        switch (e) {
            case 1:
                System.out.println("Friends");
                break;
            case 2:
                System.out.println("Love");
                break;
            case 3:
                System.out.println("Affection");
                break;
            case 4:
                System.out.println("Marriage");
                break;
            case 5:
                System.out.println("Enemy");
                break;
            case 0:
                System.out.println("Siblings");
                break;
            default:
                break;
        }
    }
}

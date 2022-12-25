package Assignments.Contest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CompletelyDifferent {

    public static int countDiffString(String str) {
        Set<String> res = new HashSet<>();
        for (int i = 0; i <= str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                res.add(str.substring(i, j));
            }
        }
        return res.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countDiffString(str));
    }
}

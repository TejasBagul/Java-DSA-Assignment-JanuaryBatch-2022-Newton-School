package Assignments.Contest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
ICE admission (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
N students want to get admission into the Imperial College of Engineering(ICE). Each student will get a roll number generated using the Name and Birth year of the student.

Roll number = First character of the name + last character of the name + last 2 digits of the birth year

If the generated roll number is already in use then the student is moved to the waiting list otherwise the student is given admission into ICE.

Given the names and birth years of N students. Print the size of the waiting list after the admission process.
Input
The first line contains N.
Each of the next N lines contains a string and an integer denoting the name and birth year of each student.

Constraints
1 ≤ N ≤ 105
1 ≤ | name | ≤ 20
1900 ≤ |birth year| ≤ 2100
Output
Print the length of waiting list.
Example
Input:
6
aman 2001
prince 2000
ayan 2001
jace 2005
jeharyse 2005
y 1980

Output:
2

Explanation:
name & DOB Roll number
aman 2001 => a + n + 01 => an01
prince 2000 => p + c + 00 => pc00
ayan 2001 => a + n + 00 => an00 => already existing, move to waiting list
jace 2005 => j + e + 05 => je05
jeharyse 2005 =>j+e+05 => je05 =>already existing, move to waiting list
y 1980 => y + y + 80 => yy80
 */

public class ICEAdmission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
            arr[i] = sc.nextInt();
        }

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String s = str[i];
            int d = s.length() - 1;
            String y = String.valueOf(arr[i]);
            String z = y.substring(y.length() - 2);
            String temp = s.charAt(0) + "" + s.charAt(d) + "" + z;
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }
        int ans = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                ans = ans + entry.getValue() - 1;
            }
        }
        System.out.println(ans);
    }
}

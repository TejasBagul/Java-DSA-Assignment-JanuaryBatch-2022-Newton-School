package Assignments.Contest;

/*
Good buildings
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
In Newton City, there are N buildings in a line. A building is considered good if the height of the building is greater than or equal to all the buildings in its right side.
Given the height of N buildings in the line, your task is to print the good buildings in the same order as they are given.

Note:- The rightmost building will always be good as their is no building in its right side
Input
The first line of input contains a single integer N. The next line of input contains N space- separated integers depicting the values of the array.

Constraints:-
1 <= N <= 100000
1 <= Arr[i] <= 100000
Output
Print all the good buildings as they appear in the array.
Example
Sample Input:-
6
3 7 4 1 2 1

Sample Output:-
7 4 2 1

Explanation:-
There is no greater element than 7 4 2 1 on their right side.

Sample Input:-
5
1 2 3 4 5

Sample Output:-
5
 */

import java.util.ArrayList;
import java.util.Scanner;

public class GoodBuildings {
    static void goodBuildings(int[] arr) {
        int greaterTillNow = 0;
        ArrayList<Integer> ls = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] > greaterTillNow) {
                greaterTillNow = arr[i];
                ls.add(arr[i]);
            }
        }
        for (int i = ls.size() - 1; i >= 0; i--) {
            System.out.print(ls.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        // int[] arr= {3,7,6,1,2,1};
        goodBuildings(arr);

    }
}

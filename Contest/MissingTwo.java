package Assignments.Contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Missing two
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array in which all numbers except two are repeated once. (i. e. we have 2N+2 numbers and N numbers are occurring twice and remaining two have occurred once). Find those two numbers.
Input
First line of input contains a single integer N. The next line of input contains 2*N+2 space separated integers.

Constraints:-
1 < = N < = 10000
1 < = Arr[i] < = 100000000
Output
Print the two elements separated by space (print the lower element first).
Example
Sample Input:-
2
1 3 4 1 5 3

Sample Output:-
4 5

Sample Input:-
3
1 2 3 5 4 3 2 1

Sample Output:-
4 5
 */


//Not working code

public class MissingTwo {
    static ArrayList<Integer> repeatedOnce(int[] arr, int n) {
        Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n - 1; i = i + 2) {
            if (arr[i] != arr[i + 1]) {
                list.add(arr[i]);
                i--;
            }
        }

        if (list.size() == 1) {
            list.add(arr[n - 1]);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < (2 * N) + 2; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = repeatedOnce(arr, N);
        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}

package Assignments.Contest;

import java.util.Scanner;

/*
Lexographical Rotation (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of length N. Print the lexographically minimum rotation of the array Arr.
All the elements of the array are distinct.
Input
First line of input contains a single integer N.
Second line of input contains N integers denoting the array Arr.

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 1000000000
Output
Print the lexographically minimum rotation of the array Arr.
Example
Sample Input
5
2 3 1 4 10

Sample Output
1 4 10 2 3
 */

public class LexographicalRotationContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int smallest = 100000000;
        int index = 0;

        for (int i = 0; i < N; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                index = i;
            }
        }

        for (int i = 0; i < N; i++) {
            int res = index % N;
            System.out.print(arr[res] + " ");
            index++;
        }
    }
}

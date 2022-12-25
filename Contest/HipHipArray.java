package Assignments.Contest;

/*
Hip Hip Array
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You will be given an array of N numbers. Your task is to first reverse the array (first number becomes last, 2nd number becomes 2nd from the last and so on) and then print the sum of the numbers at even indices and print the product of the numbers at odd indices.

Note : 1 based indexing is followed .
Input
First line contains single integer N: number of elements
Second line contains N different integers separated by spaces

constraints:-
1 <= N <= 35
1 <= a[i] <= 10
Output
Two space separated integers representing sum of the numbers at even places and the product of the numbers at odd places.

Example
Sample Input:
6
1 2 3 4 5 6

Sample Output:
9 48

Explanation:-
After reversing 1 2 3 4 5 6 becomes 6 5 4 3 2 1
Hence sum of the numbers at even indices : 5+3+1=9
product of the numbers at odd indices: 6*4*2=48

Sample Input:
3
1 2 3

Sample Output:
2 3
 */

import java.util.Scanner;

public class HipHipArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int start = 0;
        int end = N - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        int sum = 0;
        long product = 1;
        for (int i = 0; i < N; i++) {
            if ((i + 1) % 2 == 0) {
                sum += arr[i];
            } else {
                product *= arr[i];
            }
        }
        System.out.println(sum + " " + product);
    }
}

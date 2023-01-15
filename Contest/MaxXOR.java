package Assignments.Contest;

/*
Max XOR
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array Arr of non- negative integers of size N. The task is to find the maximum possible xor between two numbers present in the array.
Input
First line of input contains integer N (length of array). Next line contains N space separated integers which are numbers of array.

Constraints
2 <= N <= 100000
1 <= Arr[i] <= 10^9
Output
Print the the maximum possible xor between two numbers present in the array.
Example
Sample Input
6
25 10 2 8 5 3

Sample Output
28

Explanation
5^25=28
 */

import java.util.HashSet;
import java.util.Scanner;

public class MaxXOR {
    public static int findMaximumXOR(int[] arr) {
        int max = 0, mask = 0;
        for (int i = 31; i >= 0; i--) {
            mask = mask | (1 << i);
            HashSet<Integer> set = new HashSet<>();
            for (int num : arr) {
                set.add(mask & num);
            }
            int temp = max | (1 << i);
            for (int prefix : set) {
                if (set.contains(temp ^ prefix)) {
                    max = temp;
                    break;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findMaximumXOR(arr));
    }
}

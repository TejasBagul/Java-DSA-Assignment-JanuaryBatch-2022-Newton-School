package Assignments.Contest;

/*
Subarray with given sum
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.
Input
Each test case consists of two lines. The first line of each test case is N and S, where N is the size of the array and S is the sum. The second line of each test case contains N space-separated integers denoting the array elements.

Constraints:-
1 ≤ N ≤ 105
1 ≤ Ai ≤ 105
Output
Print the starting and ending positions (1 indexing) of first such occurring subarray from the left if sum equals to subarray, else print -1.
Example
Sample Input
5 12
1 2 3 7 5

Sample Output
2 4

Explanation:
subarray starting from index 2 and ending at index 4 => {2 , 3 , 7}
sum = 2 + 3 + 7 = 12

Sample Input
10 15
1 2 3 4 5 6 7 8 9 10

Sample Output
1 5
 */

import java.util.HashMap;
import java.util.Scanner;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long S = sc.nextLong();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long currentSum = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        int start = 0;
        int end;
        for (int i = 0; i < N; i++) {
            currentSum += A[i];
            if (currentSum == S) {
                start++;
                end = i + 1;
                System.out.println(start + " " + end);
                return;
            }
            if (map.containsKey(currentSum - S)) {
                start = map.get(currentSum - S) + 2;
                end = i + 1;
                System.out.println(start + " " + end);
                return;
            } else {
                map.put(currentSum, i);
            }
        }
        System.out.println("-1");
    }

}

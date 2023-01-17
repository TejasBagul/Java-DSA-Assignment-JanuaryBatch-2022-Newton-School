package Assignments.Contest;

import java.util.Arrays;
import java.util.Scanner;

/*
Food Line (Group Contest April '21)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
N people are waiting in line to get food. The ith person takes Arr[i] amount of time to get food. A person is happy if the amount of time he has to wait is less than or equal to the amount of time he takes to get food. The time a person waits is the sum of time people in front of him take to get food. Now you have to rearrange the people in the line such that the maximum number of people in the line are happy and report the maximum number of people that can be happy.
Input
The first line of input contains a single integer N.
The second line of input contains N integers denoting Arr[i].

Constraints:
1 <= N <= 100000
1 <= Arr[i] <= 1000000000
Output
Print the maximum number of people that can be happy after the rearrangement.
Example
Sample Input
4
3 1 3 10

Sample Output
3

Explanation:
The optimal arrangement is 1 3 10 3
This way person 1 waits 0 units so he is happy.
Person 2 waits for 1 unit so he is happy.
Person 3 waits for 4 units so is happy.
Person 4 waits 14 units so he is unhappy.
 */
public class FoodLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int res = 1;
        long wait = arr[0];
        for (int i = 1; i < N; i++) {
            long curr = arr[i];
            if (wait <= curr) {
                res++;
                wait += curr;
            }
        }
        System.out.println(res);
    }
}

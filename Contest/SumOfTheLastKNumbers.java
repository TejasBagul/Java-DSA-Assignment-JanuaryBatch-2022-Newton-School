package Assignments.Contest;

/*
Sum of the Last K Numbers (Contest)
easy

Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an integer Q representing the number of queries and an integer K. There are two types of queries:
(i) 1 x : Add the number x to the stream
(ii) 2 : Print the sum of last K numbers of the stream. If there are less than K numbers in the stream, print the sum of current stream.
Process all the queries.
Input
First line contains two integers Q and K.
Next Q lines contains the queries.

Constraints
1 <= Q <= 10^5
1 <= x <= 10^5
1 <= K <= Q
There is least one query of 2nd type.
Output
For each query of type 2, print the sum of last K numbers of the stream on a new line.
Example
Sample Input 1:
5 2
1 4
2
1 1
1 3
2

Output
4
4

Explanation:
Initial Stream = {}
Add 4. Stream = {4}
Sum of last two elements = 4
Add 1. Stream = {4, 1}
Add 3. Stream = {4, 1, 3}
Sum of last two elements = 4

Sample Input 2:
3 1
1 1
2
2

Output
1
1

Explanation
Initial Stream = {}
Add 1. Stream = {1}
Sum of last element = 1
Sum of last element = 1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfTheLastKNumbers {
    public static void main(String[] args) throws IOException {
        // Your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = br.readLine().split(" ");
        int t = Integer.parseInt(line1[0]);
        int k = Integer.parseInt(line1[1]);
        int[] arr = new int[t];
        int size = 0;
        while (t-- > 0) {
            String[] line = br.readLine().split(" ");
            int x = Integer.parseInt(line[0]);
            if (x == 1) {
                int n = Integer.parseInt(line[1]);
                arr[size++] = n;

            } else {
                int sum = 0;
                if (size < k) {
                    for (int i = 0; i < size; i++) {
                        sum += arr[i];
                    }
                    System.out.println(sum);
                } else {
                    for (int i = size - k; i < size; i++) {
                        sum += arr[i];
                    }
                    System.out.println(sum);
                }
            }
        }
    }
}

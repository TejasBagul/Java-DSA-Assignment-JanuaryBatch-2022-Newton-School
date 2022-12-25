package Assignments.Contest;

import java.util.ArrayList;
import java.util.Collections;

/*
Three way partitioning
easy
Problem Statement
Given an array A[] and a range [a, b]. The task is to partition the array around the range such that array is divided in three parts.
1) All elements smaller than a come first.
2) All elements in range a to b come next.
3) All elements greater than b appear in the end.
The individual elements of three sets can appear in any order. You are required to return the modified arranged array.

Note:- In case of custom input you will get 1 if your code is correct else get a 0.
Input
User Task:
Since this is a functional problem you don't have to worry about the input. You just have to complete the function threeWayPartition() which contains following arguments.

A: input array list
low: starting integer of range
high: ending integer of range

Constraints:
1 <= T <= 100
1 <= N <= 10000
1 <= A[i] <= 100000
1 <= low <= high <= 100000

Sum of N over all test case doesn't exceed 10^5
Output
For each test case return the modified array.
Example
Sample Input:
2
5
1 8 3 3 4
3 5
3
1 2 3
1 3

Sample Output:
1 3 3 4 8
1 2 3

Explanation:
Testcase 1: First, array has elements less than or equal to 3. Then , elements between 3 and 5. And, finally elements greater than 5. So, one of possible output is 1 3 3 4 8.
Testcase 2: First, array has elements less than or equal to 1. Then, elements between 1 and 3. And, finally elements greater than 3. So, output is 1 2 3.
 */
public class ThreeWayPartitioning {
    public static ArrayList<Integer> threeWayPartition(ArrayList<Integer> A, int lowVal, int highVal)
    {
        int left = 0, m = 0, rigth = A.size() - 1;
        while (m <= rigth) {
            int value;
            if (A.get(m) < lowVal) {
                value = 0;
            } else if (A.get(m) >= lowVal && A.get(m) <= highVal) {
                value = 1;
            } else {
                value = 2;
            }
            switch(value) {
                case 0:
                    Collections.swap(A, m, left);
                    m++;
                    left++;
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    Collections.swap(A, m, rigth);
                    rigth--;
                    break;
            }
        }
        return A;

    }
}

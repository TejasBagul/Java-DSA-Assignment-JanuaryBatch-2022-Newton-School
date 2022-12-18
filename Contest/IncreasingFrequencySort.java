package Assignments.Contest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

/*
Increasing Frequency Sort
easy
asked in interviews by 1 company
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given an array of integers nums, sort the array in increasing order based on the frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
Input
The first line of the input contains n ( length of num )
The second line contains the array num.

Constraints
1 <= nums. length <= 100
-100 <= nums[i] <= 100
Output
Print the sorted array
Example
Sample Input
6
1 1 2 2 2 3

Sample Output
3 1 1 2 2 2

Explanation: '
3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
 */

public class IncreasingFrequencySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrsize = sc.nextInt();
        int[] arr = new int[arrsize];
        for (int i = 0; i < arrsize; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arrsize; i++) {
            if (hash.containsKey(arr[i])) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else {
                hash.put(arr[i], 1);
            }
        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int i = 0; i < arrsize; i++) {
            arr2.add(arr[i]);
        }
        arr2.sort((num1, num2) -> {
            if (Objects.equals(hash.get(num1), hash.get(num2))) return num2 - num1;
            else return (hash.get(num1) - hash.get(num2));
        });
        for (Integer elem : arr2) {
            System.out.print(elem + " ");
        }
    }
}

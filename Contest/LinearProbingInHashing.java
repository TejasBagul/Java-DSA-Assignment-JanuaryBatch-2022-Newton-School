package Assignments.Contest;

import java.util.Arrays;
import java.util.Scanner;

/*
Linear Probing in Hashing
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Linear probing is a collision handling technique in hashing. Linear probing says that whenever a collision occurs, search for the immediate next position.

In this question, we'll learn how to fill up the hash table using linear probing technique. You are given hash table size which you'll use to insert elements into their correct position in the hash table i.e.(arr[i]%hashSize). You are also given an array arr of size n. You need to fill up the hash table using linear probing and print the resultant hash table.

Note: All the positions that are unoccupied are denoted by -1 in the hash table.
If there is no more space to insert, then just drop that element.
Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase contains 2 lines of input. The first line contains size of the hashtable and size of array. The third line contains elements of the array.

Constraints:
1 <= T <= 100
1 <= hashSize <= 10^3
1 <= sizeOfArray <= 10^3
0 <= Array[] <= 10^5
Output
For each testcase, in a new line, print the hash table as shown in example.
Example
Input:
2
10 4
4 14 24 44
10 4
9 99 999 9999

Output:
-1 -1 -1 -1 4 14 24 44 -1 -1
99 999 9999 -1 -1 -1 -1 -1 -1 9

Explanation:
Testcase1: 4%10=4. So put 4 in hashtable[4]. Now, 14%10=4, but hashtable[4] is already filled so put 14 in the next slot and so on.
Testcase2: 9%10=9. So put 9 in hashtable[9]. Now, 99%10=9, but hashtable[9] is already filled so put 99 in the (99+1)%10 =0 slot so 99 goes into hashtable[0] and so on.
 */

public class LinearProbingInHashing {
    static int LinearProbing(int num, int hashSize) {
        return num % hashSize;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int hashSize = sc.nextInt();
            int nums = sc.nextInt();
            int[] ht = new int[hashSize];
            Arrays.fill(ht, -1); // -?> arr[i] = -1;

            for (int j = 0; j < nums; j++) {
                int num = sc.nextInt();
                int hash = LinearProbing(num, hashSize);
                int i = 0;

                while (i < hashSize && ht[(hash + i) % hashSize] != -1) {
                    i++; // linear probing
                }
                if (i < hashSize) {
                    ht[(hash + i) % hashSize] = num;
                }
            }

            for (int i = 0; i < hashSize; i++) {
                System.out.print(ht[i] + " ");
            }
            System.out.println();

        }
    }
}

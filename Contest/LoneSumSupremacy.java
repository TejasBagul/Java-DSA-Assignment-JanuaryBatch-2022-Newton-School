package Assignments.Contest;

/*
Lone Sum Supremacy (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array of N integers A1, A2,... , AN (1 <= A[i]. length <= 105). You have to find the lone sum of each of these integers.
To find the lone sum of any integer a, following steps are a must:

Take an integer b = Sum of digits of x.

If b < 10, lone sum = b and break

If b is at least 10, replace a with b, repeat from step 1.


For example:
Lone Sum of 799:
7 + 9 + 9 = 25
2 + 5 = 7.
Therefore, the lone Sum of 799 is 7.

For each integer j from 1 to 9, print the number of integers Ai (1 <= i <= N) having their lone sum as j.
Input
First line of the input contains N, the size of array.
Second line of the input contains N space- separated integers.

Constraints
1 <= N <= 105
1 <= A[i]. length <= 105
Sum of lengths of A[i] over all i from 1 to N doesn't exceed 5*105.
Output
Print 9 integers B1, B2,. , B9 where Bi is the number of integers Ai whose lone sum is i.
Example
Sample Input:
5
79752 12793 13471 31973 113

Sample Output:
0 0 1 1 2 0 1 0 0

Explanation:
Lone sum of 79752 = 7 + 9 + 7 + 5 + 2 = 30
= 3 + 0 = 3
Lone sum of 12793 = 1 + 2 + 7 + 9 + 3 = 22
= 2 + 2 = 4
Lone sum of 13471 = 1 + 3 + 4 + 7 + 1 = 16
= 1 + 6 = 7
Lone sum of 31973 = 3 + 1 + 9 + 7 + 3 = 23
= 2 + 3 = 5
Lone sum of 113 = 1 + 1 + 3 = 5
 */

import java.util.Scanner;

public class LoneSumSupremacy {
    static long digitSum(String num) {
        long sum = 0;
        for (int i = 0; i < num.length(); i++) {
            int curr = num.charAt(i) - '0'; // '1' -> 1
            sum += curr;
        }
        return sum;
    }
    //""+10 -> "10"


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String num = sc.next();
            long sum = digitSum(num); //123456
            while (sum > 9) {
                num = String.valueOf(sum);
                sum = digitSum(num);
            }
            arr[(int) sum]++;
        }

        for (int i = 1; i < 10; i++)
            System.out.print(arr[i] + " ");
    }
}

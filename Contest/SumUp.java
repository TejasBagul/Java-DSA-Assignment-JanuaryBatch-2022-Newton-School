package Assignments.Contest;

/*
Sum Up(Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two integers a and b. Your task is to find the sum of all the even divisors of each number from a to b inclusive.
Input
The input contains two integers a and b.

Constraints:-
1 <= a <= b <= 108
Output
Print the sum of even divisors.
Example
Sample Input:-
1 10

Sample Output:-
38

Explanation:
Even divisors for 1:- NIL
Even divisors for 2:- 2
Even divisors for 3:- NIL
Even divisors for 4:- 2, 4
Even divisors for 5:- NIL
Even divisors for 6:- 6
Even divisors for 7:- NIL
Even divisors for 8:- 2, 4, 8
Even divisors for 9:- NIL
Even divisors for 10:- 10
Total :- 2+2+4+6+2+4+8+10 = 38

Sample Input:-
1 20

Sample Output:-
148
 */

import java.util.Scanner;

public class SumUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long sum = 0;
        for (int i = a; i <= b; ++i) {
            int temp = i;
            while (temp % 2 == 0) {
                sum += temp;
                temp /= 2;
            }
        }
        System.out.print(sum);
    }
}

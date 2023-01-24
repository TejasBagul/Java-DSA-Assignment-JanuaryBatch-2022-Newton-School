package Assignments.Contest;

/*
Passcode
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Sara is trying to open a lock for that she needs a passcode. Sara knows that the passcode contains N digits in it and the digits at even indices(0- indexing) are even and the digits at odd indices are {2, 3, 5, 7}.
Now Sara wants to know how many different passcodes are possible so that she can open her lock.
Input
The input contains a single integer N.

Constraints:-
1 <= N <= 10^15
Output
Print the number of possible passcodes.

Note:-
Since the answer can be quite large so print your ans modulo 10^9+7.
Example
Sample Input:-
1

Sample Output:-
5

Explanation:-
Possible answer:- 0,2,4,6,8

Sample Input:-
4

Sample Output:-
400
 */

import java.util.Scanner;

public class Passcode {
    static long pow(long a, long b, long mod) {
        if (b == 1) {
            return a;
        }
        long ans = pow(a, b / 2, mod);
        if (b % 2 == 0) {
            return (ans * ans) % mod;
        } else {
            return (((a * ans) % mod) * ans) % mod;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long mod = 1000000007;
        long ans;
        if (N == 1) {
            ans = 5;
        } else if (N % 2 == 0) {
            ans = (pow(5, N / 2, mod) * pow(4, N / 2, mod)) % mod;
        } else {
            ans = (pow(5, (N / 2) + 1, mod) * pow(4, N / 2, mod)) % mod;
        }
        System.out.println(ans);
    }
}

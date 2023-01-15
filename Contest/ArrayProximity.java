package Assignments.Contest;

import java.util.Scanner;

/*
Array Proximity (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given an array A of size N. Over all pairs of (l, r) (1 <= l < r <= n), find the maximum value of max(Al, Al+1,... , Ar) * min(Al, Al+1,... , Ar).
Input
The first line of the input contains a single integer N.
The second line of the input contains N space seperated integers.

Constraints:
1 <= N <= 105
1 <= Ai <= 109
Output
Over all pairs of (l, r) (1 <= l < r <= n), print the maximum value of max(Al, Al+1,. , Ar) * min(Al, Al+1,. , Ar).
Example
Sample Input:
4
2 3 2 1

Sample Output:
6

Explaination:
Let l = 1, r = 3
max = 3, min = 2
value = 3*2 = 6.
It can be verified that this is the maximum such value possible.
 */

public class ArrayProximity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        long mul = 0;
        for (int i = 1; i < N; i++) {
            mul = Math.max(mul, arr[i] * arr[i - 1]);
        }
        System.out.println(mul);

    }
}

/*
int main() {
	int n = 0;
    cin>>n;
    long long a[n];
    for (int i = 0; i < n; i++) {
        cin>>a[i];
    }

    long long mul = 0;
    for (int i = 1; i < n; i++) {
        mul = max(mul, a[i] * a[i - 1]);
    }
    cout<<mul;
    return 0;
}
 */

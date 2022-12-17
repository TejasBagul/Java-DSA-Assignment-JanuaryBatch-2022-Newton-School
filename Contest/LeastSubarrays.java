package Assignments.Contest;

/*
Least Subarrays
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Find the least subarray size K required from two arrays A and B (their positions don't matter) ,so that the product of sum of those two subarrays is atleast S. If no answer exists, print -1.
Input
First line contains the integer T(the number of test cases).
Each test case contain 4 lines-
First line contains 2 integers N and M (the respective sizes of array)
Next line contains N integers (elements of first array)
Next line contains M integers (elements of second array)
Next line contain the integer S

Constraints:
1 <= T <= 10
1 <= N, M <= 105
1 <= Ai <= 10^4
1 <= Bi <= 10^4
1 <= S <= 1016
Output
Print the required minimum size K if a solution exists else print -1.
Print answers for each test case in a new line.
Example
Sample Input:
1
5 6
1 2 3 4 6
2 4 5 4 9 3
120

Sample Output:
2

Explanation:
We can choose a subarray [4, 6] of size 2 from A.
We can choose a subarray [4, 9] of size 2 from B.
Now sum from array A = 4+6 = 10
Sun from array B = 4+9 = 13
Product = 10 * 13 = 130 (which is greater than S)
It can be shown that jo subarray of size 1 can give appropriately results.
 */

public class LeastSubarrays {
}

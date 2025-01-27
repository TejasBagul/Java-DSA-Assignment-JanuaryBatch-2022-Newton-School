package Assignments.Contest;

/*
Optimal Goodies (Contest)
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Tono loves to go shopping. Today, she went to the market where there are N different types of products. She wants to buy exactly K of them at the minimum cost. Although she is super smart, she wants to check your smartness as well. Can you tell her the minimum cost required to buy exactly K products if she has already decided to buy product J?

Note: Tono does not buy the same product twice, and Tono will definitely buy product J (J is the index of the item).
Input
The first line of the input contains three integers, N, K, and J, denoting the number of products in the market, the number of products Tono needs to buy, and the product that Tono will definitely buy.
The next line contains N singly spaced integers, the cost of the N products C[1], C[2], ..., C[N].

Constraints
1 <= N <= 200000
1 <= K <= N
1 <= J <= N
1 <= C[i] <= 1000

Output
Output a single integer, the minimum amount Tono needs to pay.
Example
Sample Input 1
5 3 4
1 2 3 4 5

Sample Output 1
7

Explanation: Tono needs to buy exactly 3 products, and she will definitely buy the 4th product. Thus, she will buy the 1st, 2nd, and the 4th product. The total cost she pays is 1+2+4=7.

Sample Input 2
5 1 3
2 4 3 1 1

Sample Output 2
3
 */


import java.util.Arrays;
import java.util.Scanner;

public class OptimalGoodiesContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int J = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int cost = arr[J - 1];
        arr[J - 1] = -1;
        Arrays.sort(arr);
        if (K > 1) {
            for (int i = 1; i < K; i++) {
                cost += arr[i];
            }
        }
        System.out.println(cost);
    }
}

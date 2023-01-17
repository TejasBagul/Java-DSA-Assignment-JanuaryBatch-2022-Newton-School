package Assignments.Contest;

import java.util.Scanner;

/*
Setwet's Fish Pond
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Setwet owns a very long fish pond. He plans to breed different types of carps in the upcoming breeding season. The area, however, is full of seagulls and Setwet fears that they might prey on most of the carps. For this reason, he has decided to place some seagulls- killing sharks (sharks hate carps' flavour and won't ever eat them) at different locations of the fish pond.
The fish pond can be modelled as a 1 x N grid. Some parts of the fish pond are dried out and that means you cannot breed any carps on them. A sharks, when placed on a spot, covers the cell to its immediate left and right along with the cell it is on.
Given the description of the fish pond, what is the minimum number of sharks that needs to be placed so that all the useful section of the fish pond is covered? Useful section refers to cells where carps can be bred.
Input
Input starts with an integer T, denoting the number of test cases.
Each case starts with a line containing an integer N. The next line contains N characters that describe the pond. A dot (. ) indicates a carp- breeding spot and a hash (#) indicates a dried out region.

Constraints:-
1 < T ≤ 50
1 ≤ N < 10^9
Output
For each case, print the number of sharks that need to be placed.
Example
Sample Input:-
3
3
. #.
11
. ##. ##
2
##

Sample Output:-
1
3
0
 */


// Incomplete
public class SetwetsFishPond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            String pond = sc.nextLine();
            char[] arr = pond.toCharArray();
            long sharks = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == '.'){
                    sharks++;
                    if(i+1<n)   arr[i+1] = 's';
                    arr[i] = '#';
                    if(i+2<n) arr[i+2] = '#';
                }
            }

            System.out.println(sharks);
        }
    }
}

package Assignments.Contest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/*
Maximum Team strength (Contest)
medium
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
There is an NXM field. The field is divided into cells. The cell at ith row and jth column is denoted by (i, j) where 1 ≤ i ≤ N and 1 ≤ j ≤ M. There is a player in each cell of the field. Each player has some strength denoted by strength[i][j].

The players are divided into K groups numbered from 0 to (K-1). The player at cell (i, j) belongs to team (i+j)%K.

Strength of a team is defined as sum of strengths of all team members. Print the maximum strength of any team.
Input
First line contains N , M and K.
Next N lines contains M integers each.


Constraints
1 ≤ N, M ≤ 1000
1 ≤ K ≤ NXM
0 ≤ strength[i][] ≤ 109
Output
Print a single integer denoting the maximum strength of any team.
Example
Input:
3 4 2
4 1 2 6
3 1 5 2
7 9 3 1


Output:
25

Explanation:
Team 0 => (1,1) , (1,3) , (2,2) , (2,4) , (3,1) , (3,3) => 4 + 2 + 1 + 2 + 7 + 3 => 19
Team 1 => (1,2) , (1,4) , (2,1) , (2,3) , (3,2) , (3,4) => 1 + 6 + 3 + 5 + 9 + 1 => 25
 */

public class MaximumTeamStrength {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        int N = Integer.parseInt(nums[0]);
        int M = Integer.parseInt(nums[1]);
        long K = Long.parseLong(nums[2]);
        long[][] arr = new long[N][M];
        for (int i = 0; i < N; i++) {
            nums = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Long.parseLong(nums[j]);
            }
        }

        HashMap<Long, Long> hm = new HashMap<>();
        long max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                long val = hm.getOrDefault((i + j) % K, 0L) + arr[i][j];
                hm.put((i + j) % K, val);
                max = Math.max(max, val);
            }
        }
        System.out.println(max);
    }
}

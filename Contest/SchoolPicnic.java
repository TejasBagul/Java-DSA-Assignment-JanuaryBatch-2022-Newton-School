package Assignments.Contest;

import java.util.Scanner;

/*
School Picnic
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
A school group is taken for a picnic in a big amusement park. They are allowed to use buses and scooters as a mode of transport to travel within the park. In the park, there are n buses and m scooters. The buses are numbered using integers from 1 to n and same with scooters from 1 to m. public transport within the park is not free. There are 4 types of tickets available.
A ticket for one ride on any one bus or scooter costs c1 rupees.
A ticket for an unlimited no of rides on any one bus or on any one scooter costs c2 rupees.
A ticket for an unlimited no of rides on all buses or on all scooters costs c3 rupees.
A ticket for an unlimited no of rides on all buses and on all scooters costs c4 rupees.
The group knows for sure the no of rides they are going to make and the transport they are going to use. They have asked you to help them to find the minimum sum of rupees they will have to spend.
Input
First line contain four integer c1, c2. c3. c4- the cost of the tickets.
The second line contain two integer n and m – the no of buses and scooters the group is going to use.
The third line contain the n integers ai- the no of times the group is going to use that bus no i.
The fourth line contains m integer bi- the no of times the group is going to use the scooter no I.

Constraints:
1<=cost of tickets<=100
1<=number of buses, scooters group is going to use<=1000
1<=number of times the group is going to use a particular bus, scooter<=1000
Output
Print a single integer – the minimum sum of rupees the school will have to spend on the tickets for transportation.
Example
Sample Input
1 3 7 19
2 3
2 5
4 4 4

Sample Output
12
 */
public class SchoolPicnic {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        int busCost = 0;
        for (int i = 0; i < n; i++) {
            busCost += Math.min(a[i] * c1, c2);
        }
        busCost = Math.min(busCost, c3);

        int scooterCost = 0;
        for (int i = 0; i < m; i++) {
            scooterCost += Math.min(b[i] * c1, c2);
        }
        scooterCost = Math.min(scooterCost, c3);

        int ans = Math.min(scooterCost + busCost, c4);
        System.out.println(ans);

    }
}

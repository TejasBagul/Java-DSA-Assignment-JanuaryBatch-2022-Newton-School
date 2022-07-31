package Assignments;

import java.util.Scanner;

public class TowersOfHanoiSolver {
    private static long MOVES = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int disks = scanner.nextInt();

        hanoi(disks, 'A', 'B', 'C');

        scanner.close();
    }

    /*
     * todo what is the connection between Tower of Hanoi and binary counting.
     *
     * @param disks - Total number of disks.
     * @param a     - The source pole.
     * @param b     - The auxiliary pole.
     * @param c     - The destination pole.
     */
    private static void hanoi(int disks, char a, char b, char c) {
        if (disks == 1) {
            System.out.printf("%d:%c->%c\n", ++MOVES, a, c);
            return;
        }

        hanoi(disks - 1, a, c, b);
        System.out.printf("%d:%c->%c\n", ++MOVES, a, c);
        hanoi(disks - 1, b, a, c);
    }
}

package Assignments;

import java.util.Scanner;

public class Tower {
    public static int[][] towers;
    public static int poles = 3;
    public static int discs;
    public static int moves = 0;

    public static void main(String[] args) {
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);

        discs = scanner.nextInt();
        towers = new int[discs][poles];

        // place the discs on the left-most pole (column)
        for (int disc = 0; disc < discs; disc++) {
            towers[disc][0] = (disc * 2) + 1;
        }

        printTowers();
        solveTowers();
        scanner.close();
        System.out.println("Number of moves: " + moves);
    }

    /**
     * Complete this recursive method to solve the Towers of Hanoi
     *
     */
    public static void solveTowers() {

    }

    /**
     * Moves a disc from one pole the another pole
     *
     * @param fromPole - pole to move the disc from
     * @param toPole   - pole to move the disc to
     */
    public static void moveDisc(int fromPole, int toPole) {
        moves++;
        int disc = 0;
        while (disc < discs && towers[disc][fromPole] == 0) {
            disc++;
        }

        int temp = towers[disc][fromPole];
        towers[disc][fromPole] = 0;

        int newDisc = 0;
        while (newDisc < discs && towers[newDisc][toPole] == 0) {
            newDisc++;
        }
        towers[--newDisc][toPole] = temp;
        printTowers();
    }

    /**
     * Prints the towers
     */
    public static void printTowers() {
        System.out.println();
        for (int disc = 0; disc < discs; disc++) {
            for (int pole = 0; pole < poles; pole++) {
                System.out.print(pad(towers[disc][pole]));
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Pads the width of the disc for printing
     *
     * @param disc - the disc number (1 to 4 if there are 4 discs)
     * @return - padded string for pretty printing
     */
    public static String pad(int disc) {
        // pad string with spaces
        int columnWidth = (discs * 2) + 2;


        StringBuilder output = new StringBuilder();
        if (disc == 0) {
            output = new StringBuilder("|");
        } else output.append("*".repeat(Math.max(0, disc)));

        // if length is odd pad end to even length
        if (output.length() % 2 == 1) {
            output.append(" ");
        }
        // justify pad to center in cell
        while (output.length() < columnWidth) {
            output = new StringBuilder(" " + output + " ");
        }
        return output.toString();
    }
}

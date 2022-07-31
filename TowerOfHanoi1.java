package Assignments;

import java.util.Scanner;

public class TowerOfHanoi1 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter how many disks you would like to play with: ");
        int numberOfDisks = userInput.nextInt();
        towerOfHanoi(numberOfDisks, 'A', 'B', 'C');

    }

    static void move(char firstLocation, char targetLocation){
        System.out.printf("1:%c->%c\n", firstLocation, targetLocation);
    }
    static void towerOfHanoi(int numberOfDisks, char firstLocation, char helpingLocation, char targetLocation){
        if(numberOfDisks == 0)
            return;
        else {
            towerOfHanoi(numberOfDisks - 1, firstLocation, targetLocation, helpingLocation);
            move(firstLocation, targetLocation);
            towerOfHanoi(numberOfDisks - 1, helpingLocation, firstLocation, targetLocation);

        }
    }
}

package Assignments;


import java.util.Scanner;

public class CountDuplicates {
    static void displayOutput(int[] array, int n) {
        int i, j, frequency;
        for (i = 0; i < array.length; i++) {
            frequency = 1;
            for (j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    frequency++;
                } else {
                    break;
                }
            }
            i = j - 1;
            if (frequency > 1) {
                System.out.println(array[i] + " " + frequency);
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        displayOutput(arr, n);
    }
}

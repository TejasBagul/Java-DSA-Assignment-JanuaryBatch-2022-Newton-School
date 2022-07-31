package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class EasySorting {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        //int n=sc.nextInt();
        String[] arr = new String[5];

        for (int i = 0; i < 5; i++) arr[i] = sc.next();
        String[] sortedArray = sort_sub(arr, arr.length);
        for (String s : sortedArray) {
            System.out.print(s + " ");
        }
    }

    public static String[] sort_sub(String[] array, int f) {
        String temp;
        for (int i = 0; i < f; i++) {
            for (int j = i + 1; j < f; j++) {
                if (array[i].compareToIgnoreCase(array[j]) > 0) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}

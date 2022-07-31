package Assignments;

import java.util.Scanner;

public class HipHipArray {
    private static int[] getInputData(){ // function
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int []arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close(); // to close the scanner connection
        return arr;
    }

    //[1, 2, 3, 4, 5, 6]
    private static void reverse(int []arr) {
        int i = 0, j = arr.length-1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    private static int sumAtEvenIndexes(int []arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = i % 2 != 0 ? sum + arr[i] : sum; //ternary operator.
        }
        return sum;
    }

    private static int productAtOddIndexes(int []arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = i % 2 != 0 ? product : product * arr[i];
        }
        return product;
    }

    public static void main(String[] args) {
        int []input = getInputData();
        reverse(input);
        int sum = sumAtEvenIndexes(input);
        int product = productAtOddIndexes(input);
        System.out.println(sum + " " + product);
    }
}

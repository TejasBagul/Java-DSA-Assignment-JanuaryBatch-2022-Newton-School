package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class modSquare {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int result = 0;

        for(int i=n-1;i>=1;i--) {
            if(arr[i]!=arr[i-1]) {
                result=arr[i-1];
                break;
            }
        }
        System.out.println(result);
    }
}

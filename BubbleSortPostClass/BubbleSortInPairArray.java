//package Assignments.BubbleSortPostClass;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class BubbleSortInPairArray {
//    int x;
//    int y;
//
//    // Constructor
//    public BubbleSortInPairArray(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println(Arrays.toString(SortPair(arr,N)));
//    }
//
//    static int[] SortPair(int[] arr, int n) {
//        for (int i = 0; i < n - 1; i++) {
//            for (int j = 0; j < n - 1; j++) {
//                if (arr[j].x < arr[j + 1].x) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//                if (arr[j].x == arr[j + 1].x) {
//                    if (arr[j].y < arr[j + 1].y) {
//                        int temp = arr[j];
//                        arr[j] = arr[j + 1];
//                        arr[j + 1] = temp;
//                    }
//                }
//            }
//        }
//        return arr;
//    }
//}

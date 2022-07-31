package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class MergeArray {
    public static void mergeArrays(int[] arr1, int[] arr2, int n1,
                                   int n2, int[] arr3) {
        int i = 0, j = 0, k = 0;

        // Traverse both array
        while (i < n1 && j < n2) {
            // Check if current element of first
            // array is smaller than current element
            // of second array. If yes, store first
            // array element and increment first array
            // index. Otherwise do same with second array
            if (arr1[i] < arr2[j])
                arr3[k++] = arr1[i++];
            else
                arr3[k++] = arr2[j++];
        }

        // Store remaining elements of first array
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr1 = new int[N];
        int n1 = arr1.length;
        int[] arr2 = new int[M];
        int n2 = arr2.length;
        for (i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (j = 0; j < n2; j++) {
            arr2[j] = sc.nextInt();
        }
        int[] arr3 = new int[n1 + n2];
        mergeArrays(arr1, arr2, n1, n2, arr3);

        for (i = 0; i < n1 + n2; i++) {
            System.out.print(arr3[i] + " ");
        }

//        int[] merged = new int[200];
//        i = j = k = 0;
//        while (i < N && j < M) {
//            if (arr1[i] <= arr2[j]) {
//                merged[k++] = arr1[i++];
//            } else {
//                merged[k++] = arr2[j++];
//            }
//        }
//
//        if (i == N) {
//            while (j < M) {
//                merged[k++] = arr2[j++];
//            }
//        }
//        if (j == M) {
//            while (j < N) {
//                merged[k++] = arr1[i++];
//            }
//        }
//        int result = Arrays.sort(merged);
//        for (i = 0; i < k; i++) {
//            System.out.print(merged[i] + " ");
//        }
    }

}

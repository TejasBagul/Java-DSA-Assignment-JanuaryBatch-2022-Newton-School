package Assignments.Contest;

import java.util.HashMap;
import java.util.Scanner;

public class ArrayFrequencyParadigm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> li = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (li.containsKey(arr[i])) {
                li.put(arr[i], li.get(arr[i]) + 1);
            } else {
                li.put(arr[i], 1);
            }
        }
        for (int i = 0; i < n; i++) {
            boolean temp = true;
            for (int j = i + 1; j < n; j++) {
                if (li.get(arr[i]) <= li.get(arr[j])) {
                    System.out.print((j + 1) + " ");
                    temp = false;
                    break;
                }
            }
            if (temp) {
                System.out.print(-1 + " ");
            }
        }
    }
}

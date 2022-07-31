package Assignments.Hashing_PostClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class GroupOfNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] str1 = str.split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(str1[i]);
        }
        frequencySort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                System.out.print(arr[i] + " ");

            }
        }
        if (n - 3 >= 0 && arr[n - 3] != arr[n - 1]) {
            System.out.print(arr[n - 1] + " ");
        }
    }

    static Map<Integer, Integer> map;

    public static void frequencySort(int[] num) {
        map = new HashMap<>();
        for (int i : num) {
            if (map.containsKey(i)) {
                map.put(i, 1 + map.get(i));
            } else {
                map.put(i, 1);
            }
        }
        Integer[] arr = new Integer[num.length];
        int k = 0;
        for (int i : num) {
            arr[k++] = i;

        }
        Arrays.sort(arr, new Comp());
        k = 0;
        for (int i : arr) {
            num[k++] = i;
        }
    }
}

class Comp implements Comparator<Integer> {
    Map<Integer, Integer> map = GroupOfNumbers.map;

    public int compare(Integer a, Integer b) {
        if (map.get(a) > map.get(b)) return -1;
        else if (map.get(b) > map.get(a)) return 1;
        else {
            if (a > b) return -1;
            else if (a < b) return 1;
            return 0;
        }
    }
}

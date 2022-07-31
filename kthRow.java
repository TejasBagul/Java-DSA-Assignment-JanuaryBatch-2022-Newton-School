package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class kthRow {
        public static ArrayList<Integer> getRow(int A) {
            ArrayList<Integer> prev = new ArrayList<Integer>();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i <= A; i++) {
                ArrayList<Integer> temp = new ArrayList<Integer>();
                prev = list;
                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        temp.add(1);
                    } else {
                        temp.add(prev.get(j - 1) + prev.get(j));
                    }
                }
                list = temp;
            }
            return list;
        }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        ArrayList<Integer> arr = getRow(k);
        for (int i = 0; i < arr.size(); i++) {
            if (i == arr.size() - 1)
                System.out.print(arr.get(i));
            else
                System.out.print(arr.get(i) + " ");
        }
    }
}

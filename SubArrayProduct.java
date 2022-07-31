package Assignments;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class SubArrayProduct {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.print(printMax(arr, n, w));
    }

    static long printMax(long[] arr, int n, int k) {
        Deque<Integer> dList = new LinkedList<Integer>();
        int i;
        long product = 1;
        int modulo = 1000000007;
        for (i = 0; i < k; ++i) {
            while (!dList.isEmpty() && arr[i] >= arr[dList.peekLast()])
                dList.removeLast();

            dList.addLast(i);
        }

        for (; i < n; ++i) {
            product = (product * (arr[dList.peek()] % modulo)) % modulo;

            while ((!dList.isEmpty()) && dList.peek() <= i - k)
                dList.removeFirst();


            while ((!dList.isEmpty()) && arr[i] >=
                    arr[dList.peekLast()])
                dList.removeLast();

            dList.addLast(i);
        }
        product = (product * (arr[dList.peek()] % modulo)) % modulo;
        return product;
    }
}

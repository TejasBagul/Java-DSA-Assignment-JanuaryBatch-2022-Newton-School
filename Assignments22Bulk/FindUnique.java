package Assignments.Assignments22Bulk;

import java.util.Scanner;

public class FindUnique {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A[] = new int[N];
        int Unique = 0;
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
            Unique = Unique ^ A[i];
        }
        System.out.println(Unique);
    }
}

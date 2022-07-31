package Assignments.FunctionsDSAInClass;

import java.util.Scanner;

public class AppleAndOranges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Storing the captured value in a variable
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int result = LikesBoth(N, A, B);
        System.out.println(result);
    }

    static int LikesBoth(int N, int A, int B) {
        //Enter your code here
        return (A + B - N);

    }
}

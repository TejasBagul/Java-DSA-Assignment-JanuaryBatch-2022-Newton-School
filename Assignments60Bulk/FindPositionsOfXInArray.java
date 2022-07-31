package Assignments.Assignments60Bulk;

import java.util.Scanner;

public class FindPositionsOfXInArray {
	public static void main(String[] args) {
		// Your code here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T >= 1) {
			int N = sc.nextInt();
			int X = sc.nextInt();
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			boolean isPresent = false;
			for (int i = 0; i < N; i++) {
				if (arr[i] == X) {
					System.out.println(i + " ");
					isPresent = true;
				}
			}
			if (!isPresent) {
				System.out.println("Not found");
			}
			System.out.println("");
			T--;
		}
	}
}

package Assignments.InputOutputDatatypesAndVariablesInClass;

import java.util.Scanner;

public class DataTypes {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Long l = sc.nextLong();
        float f = sc.nextFloat();
        double d = sc.nextDouble();
        char c = sc.next().charAt(0);

        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);


    }
}

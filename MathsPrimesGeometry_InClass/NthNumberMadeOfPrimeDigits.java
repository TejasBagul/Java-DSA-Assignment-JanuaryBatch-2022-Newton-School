package Assignments.MathsPrimesGeometry_InClass;

import java.util.ArrayList;
import java.util.Scanner;

public class NthNumberMadeOfPrimeDigits {
    static String nthPrimeDigitsNumber(int number) {
        int rem;
        String num = "";
        while (number > 0) {
            // remainder for check element position
            rem = number % 4;
            switch (rem) {

                // if number is 1st position in tree
                case 1:
                    num += '2';
                    break;

                // if number is 2nd position in tree
                case 2:
                    num += '3';
                    break;

                // if number is 3rd position in tree
                case 3:
                    num += '5';
                    break;

                // if number is 4th position in tree
                case 0:
                    num += '7';
                    break;
            }

            number = number / 4;
        }

        return new StringBuilder(num).reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            System.out.println(nthPrimeDigitsNumber(N));
//            System.out.println(nthPrimeDigitsNumber(secondDigit));
        }

    }

    public static void printSub(String str, String curr, int index, int stop, ArrayList<String> ts){

        if(index == stop+1){
            ts.add(curr);
            return;
        }

        for(int i=0;i<str.length();i++){
            printSub(str,curr+str.charAt(i),index+1,stop,ts);
        }

    }
}

package Assignments.Contest;

/*
Sort Words
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given a sentence, your task is to print the sentence with its words present in a sorted manner.
For eg:- The sentence:- "i am a rockstar developer" will be printed as "a am developer i rockstar"
Input
The Input contains only a sentence.

Constraints:-
Total characters present in the sentence will be less than equal to 1000

Note:- The sentence will contain only lowercase English letters.
Output
Print the given sentence with the words present in the sorted order.
Example
Sample Input:-
i am a rockstar developer

Sample Output:-
a am developer i rockstar
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class SortWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder ans = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); ++i) {
            ans.append(str.charAt(i));
            if (str.charAt(i) == ' ') {
                ans = new StringBuilder(ans.substring(0, ans.length() - 1));
                list.add(ans.toString());
                ans = new StringBuilder();
            }

        }
        list.add(ans.toString());
        Collections.sort(list);
        for (String i : list) System.out.print(i + " ");
    }
}

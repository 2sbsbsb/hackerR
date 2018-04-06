package thirty_days_code.day6;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 
 * Solution to https://www.hackerrank.com/challenges/30-review-loop/problem
 *
 */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
        for(int i=1; i<=n; i++) {
            String question = in.nextLine();
            evenOddSeperate(question);
        }
        in.close();
    }
    
    public static void evenOddSeperate(String val) {
        int length = val.length();
        StringBuilder evenBuilder = new StringBuilder();
        StringBuilder oddBuilder = new StringBuilder();
        for(int i=0; i<length; i++) {
            if(i%2 == 0) {
                char x = val.charAt(i);
                evenBuilder.append(val.charAt(i));
            } else {
                oddBuilder.append(val.charAt(i));
            }
        }
        System.out.println(evenBuilder.toString() + " " + oddBuilder.toString());
    }
    
}
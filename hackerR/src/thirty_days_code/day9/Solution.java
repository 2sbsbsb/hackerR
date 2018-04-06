package thirty_days_code.day9;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 
 * https://www.hackerrank.com/challenges/30-binary-numbers/problem
 */
public class Solution {

    static int factorial(int n) {
        // Complete this function
        return (n <= 1) ? 1 : (n * factorial(n-1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = factorial(n);
        System.out.println(result);
    }
}

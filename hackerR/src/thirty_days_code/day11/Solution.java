package thirty_days_code.day11;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * 
 * https://www.hackerrank.com/challenges/30-2d-arrays/problem
 */
public class Solution {
    
    /*
     * Complete the array2D function below.
     */
    static int array2D(int[][] arr) {
    	int max = Integer.MIN_VALUE;
    	int rows = arr.length -2;
    	int cols = arr[0].length -2;
    	for(int i=0; i<rows;i++) {
    		int[] firstRow = arr[i];
    		int[] secondRow = arr[i+1];
    		int[] thirdtRow = arr[i+2];
    		for (int j=0; j< cols; j++) {
    			int firstRowSum = firstRow[j] + firstRow[j+1] + firstRow[j+2];
    			int secondRowSum = secondRow[j+1];
    			int thirdRowSum = thirdtRow[j] + thirdtRow[j+1] + thirdtRow[j+2];
    			int total = firstRowSum + secondRowSum + thirdRowSum;
    			if(total>max) {
    				max = total;
    			}
    		}
    	}
    	return max;
    }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(array2D(arr));
    }
}

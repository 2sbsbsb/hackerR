package ds.arrays.twoDArrayDs;

import java.io.*;
import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * 
 * https://www.hackerrank.com/challenges/2d-array/problem
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

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int arrRowItr = 0; arrRowItr < 6; arrRowItr++) {
            String[] arrRowItems = scanner.nextLine().split(" ");

            for (int arrColumnItr = 0; arrColumnItr < 6; arrColumnItr++) {
                int arrItem = Integer.parseInt(arrRowItems[arrColumnItr].trim());
                arr[arrRowItr][arrColumnItr] = arrItem;
            }
        }

        int result = array2D(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}


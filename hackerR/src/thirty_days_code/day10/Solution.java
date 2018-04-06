package thirty_days_code.day10;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = binaryCSum(n);
		System.out.println(result);
	}

	/**
	 * @param n
	 * @return
	 */
	private static int binaryCSum(int n) {
		int max = 0;
		int sum = 0;
		StringBuilder sb = new StringBuilder();
		int k = n;
		while (!(k / 2 == 0 || k / 2 == 1)) {
			int remainder = k % 2;
			if (remainder == 1) {
				sum++;
			} else {
				sum = 0;
			}
			sb.insert(0, remainder);
			k = k / 2;
			if (sum > max) {
				max = sum;
			}
		}
		int lRemainder = k % 2;
		int quotient = k / 2;
		sb.insert(0, lRemainder);
		sb.insert(0, quotient);
		if (lRemainder == 1) {
			sum++;
		} else {
			sum = 0;
		}
		if (sum > max) {
			max = sum;
		}
		if (quotient == 1) {
			sum++;
		} else {
			sum = 0;
		}
		if (sum > max) {
			max = sum;
		}
		return max;
	}
}

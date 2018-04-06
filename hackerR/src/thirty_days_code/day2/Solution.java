package thirty_days_code.day2;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        in.close();
        double total_cost = meal_cost + (meal_cost * tip_percent/100) + (meal_cost *  tax_percent/100);
        int rounded_total_cost = (int) Math.round(total_cost);
        System.out.println("The total meal cost is " + rounded_total_cost + " dollars.");
    }
}
package thirty_days_code.day8;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

/**
 * 
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 */
class Solution{
   
     public static void main(String []argh) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      //
      Map<String,Integer> map = new HashMap<>();
      for(int i = 0; i < n; i++) {
          String name = in.next();
          int phone = in.nextInt();
          map.put(name,phone);
      }
      //
      while(in.hasNext()){
          String s = in.next();
          Integer phone = map.get(s); 
          if (phone == null) {
        	  System.out.println("Not found");
          } else {
        	  System.out.println(s + "=" + phone);
          }
      }
      in.close();
  }
    
}

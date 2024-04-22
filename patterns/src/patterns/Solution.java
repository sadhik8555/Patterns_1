package patterns;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

	 public static int saveThePrisoner(int n, int m, int s) {
		 m--;
		 while(m!=0) {
			 s=s+1;
			 if(s>n) {
				 s=1;
			 }
			
			 System.out.print(s+"   ");
			 m--;
		 }
		 
		 
		return s;
		    // Write your code here

		    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
    	Result res =new Result();
    	
    System.out.print( res.saveThePrisoner(7,19,2));
    }
}
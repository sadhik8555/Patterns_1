package patterns;
// Java Program to print pattern
// Reverse Right Half Pyramid
import java.util.*;

public class GeeksForGeeks {
	// Function to demonstrate pattern
	public static void printPattern(int n)
	{
		int i, j;

		// outer loop to handle rows
		for (i = n; i >= 1; i--) {

			// inner loop to handle columns
			for (j = 1; j <= i; j++) {
				System.out.print(j+"  ");
			}

			// printing new line for each row
			System.out.println();
		}
	}
	
	 public static void solve(double meal_cost, int tip_percent, int tax_percent) {
	     
	    	meal_cost=meal_cost+(meal_cost*tip_percent*0.01)+(meal_cost*tax_percent*0.01);
	    	
	    	
	    	
	    	System.out.print(Math.round(meal_cost));

	    }

	// Driver Function
	public static void main(String args[])
	{
		solve(12.00,20,8);
	}
}

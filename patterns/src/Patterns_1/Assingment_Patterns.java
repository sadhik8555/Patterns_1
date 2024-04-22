package Patterns_1;

public class Assingment_Patterns {
	
	
	/*
	 * 
 Pattern_1
	 
1 3 5 7 9 
  3 5 7 9 
    5 7 9 
      7 9 
        9 
	 
	 */
	
	private static void Pattern_No1(int n) {
		
		
		for(int i=1,m=1;i<n;m=m+2,i++) {
			for(int k=1;k<i;k++) {
				System.out.print("  ");
			}
			for(int j=i,l=m;j<n;l=l+2,j++) {
				System.out.print(l+" ");
			}
			System.out.println();
		}
		
		
	}
	
	
	/************
	A 
	A 0 
	A 0 C 
	A 0 C 0 
	A 0 C 0 E 
**** */

	private static void Pattern_No2(int n) {

		int l;
		int j;
		
		for(int i=1,m=1;i<n;m=m+2,i++) {
//			
			for(j=1,l=65;j<=i;l++,j++) {
//				System.out.print((char)l);
				if(j%2==0) {
					System.out.print(0+" ");
				}
				else {
					System.out.print((char)l+" ");
				}
				
			}
			System.out.println();
		}
		
		
	}
	
	/*
	* * * * * * 
	1 3 5 7 9 
	* * * * 
	1 3 5 
	* * 
	1 
	 */

	private static void Pattern_No3(int n) {
		for(int i=1;i<n;i++) {
			
			for(int j=i,l=1;j<n;l=l+2,j++) {
				if(i%2==0) {
					System.out.print(l+" ");
				}
				else {
					System.out.print("*"+" ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	/*
	A 1 B 2 C 3 
	A 1 B 2 C 
	A 1 B 2 
	A 1 B 
	A 1 
	A
	 */
	
	private static void Pattern_NO4(int n) {
		
		int j,m,k;
		char l;
		

		for(int i=1;i<n;i++) {
			
			for( j=i,k=1,l=65,m=1;j<n;k++,j++) {
				if(k%2==0) {
					System.out.print(m+" ");
					m++;
				}
				else {
					
					System.out.print((char)l+" ");
					l++;
				}
				
			}
			System.out.println();
		}
		
	}
	
	
	/*
	
	    5 
		* * 
		5 4 3 
		* * * * 
		5 4 3 2 1
	 */
	private static void Pattern_NO5(int n) {
		
		for(int i=1;i<n;i++) {
			
			for(int j=1,l=n-1;j<=i;l--,j++) {
				if(i%2==0) {
					System.out.print("*"+" ");
				}
				else
				{
					
					System.out.print(l+" ");
				}
				
			}
			System.out.println();
		}
		
	}
	
	/*
	      E 
        1 2 
      C D E 
    1 2 3 4 
  A B C D E  
	  
	 */
	
	private static void Pattern_NO6(int n) {
		int i;
		int k;
		
		for( i=1;i<n;i++) {
			for( k=i;k<n;k++) {
				System.out.print("  ");
			}
			for(int j=1,p=1,m=70-i;j<=i;m++,p++,j++) {
				if(i%2==0) {
					System.out.print(p+" ");
				}
				else
				{
					System.out.print((char)m+" ");
				}
			}
			System.out.println();
		}
		
	}
	
	/*
	      # 
        A B 
      # # # 
    A B C D 
  # # # # # 
  
	 */
	
	private static void Pattern_NO7(int n) {
		int i;
		int k;
		
		for( i=1;i<n;i++) {
			for( k=i;k<n;k++) {
				System.out.print("  ");
			}
			for(int j=1,m=65;j<=i;m++,j++) {
				if(i%2==0) {
					System.out.print((char)m+" ");
					
				}
				else
				{
					
					
					System.out.print("#"+" ");
			
				}
			}
			System.out.println();
		}
		
	}
	
	
	/*
	1 2 3 4 * 
	1 2 3 * 5 
	1 2 * 4 5 
	1 * 3 4 5 
	* 2 3 4 5 

	 */
	private static void Pattern_NO8(int n) {
           for(int i=1;i<n;i++) {
			
			for(int j=1;j<n;j++) {
				
				if(i+j==6) {
					System.out.print("*"+" ");
				}
				else
				{
					
					System.out.print(j+" ");
				}
				
			}
			System.out.println();
		}
		
	}

	
	/*
	E D C B A 
	* D C B A 
	* * C B A 
	* * * B A 
	* * * * A 
	 */
	
	private static void Pattern_NO9(int n) {
		
		for( int i=1;i<n;i++) {
			for( int k=1;k<i;k++) {
				System.out.print("*"+" ");
			}
			for(int j=i,m=70-i;j<n;m--,j++) {
				
					System.out.print((char)m+" ");
					
				}
			
			System.out.println();
		}
		
	}
	

	private static void Pattern_NO23(int n) {


		for(int i=1;i<n;i++) {
			
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			
			int k,m;
			
			for(  k=1,m=i;k<i;m++,k++) {
				System.out.print(m+" ");
			}
//			System.out.print(k);
			
			for(int l=m-2;m>=i;m--) {
				System.out.print(m+" ");
			}
			
			System.out.println();
		}
		
	}
	
	/*
	 
	              A   

              C   B   A   

          E   D   C   B   A   

      G   F   E   D   C   B   A   

  I   H   G   F   E   D   C   B   A   


	 
	 */
	
	private static void Pattern_NO24(int n) {

		for(int i=1;i<n;i=i+2) {
			for(int j=i;j<n;j++) {
				System.out.print("  ");
			}
			for(int k=1,c=64+i;k<=i;c--,k++) {
				System.out.print((char)c+"   ");
			}
			System.out.println();
			
			System.out.println();

		}
		
	}
	
	/*
	    *******
		*     *
		*     *
		*     *
		*     *
		*     *
		*******

	 */
	
	private static void Pattern_NO25(int n) {
		
		
		for(int i=1;i<n;i++) {
			
			for(int j=1;j<n;j++) {
				
				if(i==1||j==1||i==n-1||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
	}
	
	/*
	       * 
	     * * * 
	   * * * * * 
	 * * * * * * * 

	 */

	private static void Pattern_NO26(int n) {
		
        for(int i=1;i<n;i=i+2) {
			
			for(int j=i;j<n;j++) {
				
				
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++){
					System.out.print("* ");
				}
				System.out.println();
			}
			
			
		}
		
	


	public static void main(String[] args) {
		
		
		
		Pattern_NO26(8);
	}


	


	

	




	

	

	


	

	


	




	

	
	

}

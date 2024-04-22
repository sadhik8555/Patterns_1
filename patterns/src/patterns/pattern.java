package patterns;

public class pattern {

	public static void main(String[] args) {
//		for(int i=1;i<6;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+"  ");
//			}
//			for(int k=i+1;k<6;k++) {
//				System.out.print(0+"  ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		System.out.println();
//		
//		for(int i=1;i<6;i++) {
//			int k=1;
//			for(int j=i;j<6;j++) {
//				System.out.print("  ");
//				k++;
//			}
//			for(int l=1;l<=i;l++) {
//				System.out.print(l+" ");
//				k++;
//			}
//			
//			System.out.println();
//
//	}
//		
//		System.out.println();
//		
//		System.out.println();
//		
//		for(int i=1;i<6;i++) {
//			for(int k=i;k<6;k++) {
//				System.out.print("  ");
//			}
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		
//		for(int i=1;i<6;i++) {
//			
//		
//		for(int j=i;j<=5;j++) {
//			System.out.print(j+" ");
//		}
//		for(int k=1;k<=i;k++) {
//			System.out.print(k+" ");
////		}
//		System.out.println();
//	}
		
		
//		char s='a';
//		boolean ace=true;
//		for(int i=1;i<6;i++) {
//			for(int j=1;j<=i;j++) {
//				
//				if(ace) {
//					s=(char) (s-' ');
//				}
//				else {
//					s=(char) (s+' ');
//				}
//				ace=
//				System.out.print(s++);
//				
//				
//				
//			}
//			System.out.println();	
//		}
		
		

//		for(int i=1,m=1;i<6;m=m+2,i++) {
//			for(int k=1;k<i;k++) {
//				System.out.print("  ");
//			}
//			for(int j=i,l=m;j<6;l=l+2,j++) {
//				System.out.print(l+" ");
//			}
//			System.out.println();
//		}
//		
//		int l;
//		int j;
//		
//		for(int i=1,m=1;i<6;m=m+2,i++) {
////			for(int k=1;k<i;k++) {
//				System.out.print("  ");
//			}
//			for(j=1,l=65;j<=i;l++,j++) {
////				System.out.print((char)l);
////			
//				
//				if(j%2==0) {
//					System.out.print(0+" ");
//				}
//				else {
//					System.out.print((char)l+" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		int rows =8;
		for(int i=1;i<rows;i++) {
			
			if(i>rows) {
				
			}
			
			for(int j=1;j<rows-i;j++) {
				System.out.print(" ");
			}
			int k,m;
			for(  k=1,m=65;k<=i;m++,k++) {
				System.out.print((char)m+" ");
			}

			
			System.out.println();
		}
		
//		for(int i=1;i<6;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(" ");
//			}
//			int k,m;
//			for(  k=i,m=65;k<6;m++,k++) {
//				System.out.print((char)m+" ");
//			}
//
//			
//			System.out.println();
//		}
		
		

}
	
}

package PatternPrograms;

public class Number1 {

	public static void main(String[] args) {
int k=0;	
		
		for (int i=0;i<4;i++) {
			
			for(int j=0;j<=i;j++) {
				
				System.out.print(k);
				System.out.print("\t");
				
				k++;
			}
			
			System.out.println(" ");
			
		}

	}

}


/*
 
0	 
1	2	 
3	4	5	 
6	7	8	9	


*/
package ArrayProgram;

public class SumofArrayPairs {

	public static void main(String[] args) {
		int a[]= {3,7,8,2,0,10,0};
		int n=10;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
			if(a[i]+a[j]==n) {
			System.out.println(a[i]+ " + "+a[j]+ " = " +n);	
			}
		}}

			}}

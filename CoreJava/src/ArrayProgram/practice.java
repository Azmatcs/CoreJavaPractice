package ArrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class practice {

	public static void main(String[] args) {
		int a[]= {2,7,4,6,8,9};
		int j=a.length-1;
		for(int i=0;i<j;) {
			if(a[i]%2!=0) {
				i++;
			}
			else if(a[j]%2==0) {
				j--;
			}
			else {
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
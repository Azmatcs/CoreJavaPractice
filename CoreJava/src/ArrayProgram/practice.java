package ArrayProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class practice {

	public static void main(String[] args) {
int a[]= {4,4,2,2,3};
int uni=a[0];
for(int i=1;i<a.length;i++) {
	uni=uni^a[i];
}
System.out.println(uni);
	}
}

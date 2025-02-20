package StringProgram;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;

public class Practice {
	public static void main(String[] args) {
String s="Azmat Ali";
char c[]=s.toCharArray();
char re[]=new char[s.length()];

int j=s.length()-1;
for(int i=0;i<s.length();i++) {
	if(c[i]==' ') {
		re[i]=' ';
	}
}
for(int i=0;i<s.length();i++) {
	if(c[i]!=' ') {
		if(re[j]==' ') {
			j--;
		}
		re[j]=c[i];
		j--;
	}
}
System.out.println(re);
	}
}

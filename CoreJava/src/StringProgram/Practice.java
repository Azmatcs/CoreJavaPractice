package StringProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		System.out.print(non("AzmAzT"));
	}

	public static Character non(String s) {
		char c[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			boolean match = false;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && c[i] == c[j]) {
					match = true;
					break;
				}
			}
			if (match == false) {
				return c[i];
			}
		}
		return '$';

	}
}
package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterCountUsingMap {

	public static void main(String[] args) {
		String s="AAzmmmaatttt";
		char c[]=s.toCharArray();
		Map<Character,Integer> map=new HashMap();
		for(Character ch:c) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.print(entry.getKey() + ""+entry.getValue());
			}
		}

	}

}


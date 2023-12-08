package college;

import java.util.*;
import java.util.Map.Entry;

public class Books {
	public static void main (String[]args) {
		Map<String,Integer> mp= new TreeMap<>();
		mp.put ("English",299);
		mp.put ("Accountancy",356);
		mp.put ("Income Tax",390);
		mp.put  ("Business Studies",456);
		
		System.out.println(mp);
		
		Set<String>keySet=mp.keySet();
		System.out.println(keySet);
		
		Collection<Integer> values=mp.values();
		System.out.println(values);
		
		Set<Entry<String ,Integer>> entrySet=mp.entrySet();
		for(Entry<String,Integer> entry:entrySet) {
			System.out.println(entry);
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			
			
		}
		
		
	}

}

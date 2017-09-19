
/*
* Author Richmond
* Generating  a basic Key using foldshifting algorithm
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class FoldShifting {
	
	public static void getEncoding(String key)
	{		
		int pseudokey = 0;
		int cn = 0;
		int n = 1;
		int grouping = 0;
		char c[] = key.toCharArray();
		while(cn < key.length()){
			grouping = grouping << 8;
			grouping = grouping + c[cn];
			//System.out.println(c[cn]);
			cn = cn + 1;
			System.out.println(Integer.toBinaryString(grouping));	
			if(n == 4 || cn == key.length()){
				pseudokey = pseudokey + grouping;
				n = 0;
				grouping = 0;
			}
			n++;
		}
		System.out.println(Integer.toBinaryString(pseudokey));
		System.out.println(Integer.toHexString(pseudokey));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String , Integer> m = new HashMap<String , Integer>();
		m.put("Richmond", 1);
		m.put("Frimpong", 800);
		System.out.println("---------------------------------------");
		System.out.println(m);
		Set<String> s = m.keySet();
		Iterator<String> it = s.iterator();
		while(it.hasNext()){
			String temp = it.next();
			Foldshifting.getEncoding(temp);
			int k = temp.getBytes().hashCode();
			System.out.println("HashCodes :-> " + Integer.toHexString(k));
		}
	}

}

package MyJavaPractise;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable H= new Hashtable();
		
		H.put(1,100);
		H.put(2, 200);
		H.put(3, 300);
		
		System.out.println(H.size());
		
		H.put("A","Hello");
		H.put("B","Kite");
		
		System.out.println(H.size());
		
		System.out.println(H.get("A"));
		System.out.println(H.get(2));
		
		

	}

}

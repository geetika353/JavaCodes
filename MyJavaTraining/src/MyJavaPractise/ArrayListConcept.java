package MyJavaPractise;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList A= new ArrayList();
		
		A.add(100);
	    A.add(200);
	    A.add(300);
	    A.add(400);
	    
	    System.out.println(A.size());
	    
	    A.add("Alpha");
	    A.add('h');
	    A.add(9.88);
	    
	    System.out.println(A.size());
	    
	    System.out.println(A.get(4));
	    System.out.println(A.get(5));
	    //System.out.println(A.get(9));
	    
	    //to print all the values we need for loop
	    for (int i=0; i<A.size(); i++) {
	    	System.out.println(A.get(i));
	    }
	    
		ArrayList<Integer> A1= new ArrayList<Integer>();
		A1.add(542);
		System.out.println(A1.get(0));
		ArrayList<String> A2= new ArrayList<String>();
		A2.add("Nature");
		System.out.println(A2.get(0));
		
		
		

	}

}

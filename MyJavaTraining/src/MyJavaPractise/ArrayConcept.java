package MyJavaPractise;

public class ArrayConcept {

	public static void main(String[] args) {
		//integer array
		int i[]= new int[4];
		i[0]= 10;
		i[1]= 20;
		i[2]= 30;
		i[3]= 40;
		System.out.println(i.length); // to print the length of array
		
		// to print the values of array, we will use for loop
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		//double array
		double d[]= new double[3];
	    d[0]=12.33;
		d[1]= 2.89;
		d[2]= 5;


		
		// char array
		char c[]= new char[3];
		c[0]= 'g';
		c[1]= '&';
		c[2]= 3;
		
		// boolean array
		boolean b[]= new boolean[2];
		b[0]= true;
		b[1]= false;
	
		//string array
		String s[]= new String[3];
		s[0]="test";
		s[1]="Hello";
		s[2]="World";
		
		System.out.println(i.length);
		System.out.println(s[2]);
		System.out.println(b[0]);
        System.out.println(c[1]);
        System.out.println(d[2]);
	}

}

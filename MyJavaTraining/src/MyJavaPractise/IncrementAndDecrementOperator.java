package MyJavaPractise;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		
		int i=1;
		int j =i++; //post increment
		
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("********");
		
		int a=1;
		int b= ++a;// pre-increment
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("********");
		
		int x= 2;
		int y=x--;// post decrement
		System.out.println(x);
		System.out.println(y);
 
		System.out.println("********"); 
		
		int p= 1;
		int q= --p;// pre decrement
		System.out.println(p);
		System.out.println(q);
	}

}

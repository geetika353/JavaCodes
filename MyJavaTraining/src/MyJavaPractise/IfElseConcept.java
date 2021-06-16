package MyJavaPractise;

public class IfElseConcept {

	public static void main(String[] args) {
		int x=80;
		int y=90;
		if (x>y) {
			System.out.println("x is greater than y");
		}
		else {
			System.out.println("y is greater than x");
		}
		
         int a= 40;
         int b=50;
         
         if(a==b) {
        	 System.out.println("a is equal to b");
         }
         
         else {
        	 System.out.println("a is not equal to b");
         }
         
         // to find out the lreatset number
         int m= 100;
         int n= 200;
         int p= 300;
         
         if(m>n & m>p) {
        	 System.out.println("m is greatest");
         }
         else if(n>m & n>p){
        	 System.out.println("n is greatest ");
         }
         else {
        	 System.out.println("p is greatest");
         }
	}

}

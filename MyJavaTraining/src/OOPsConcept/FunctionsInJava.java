package OOPsConcept;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava obj= new FunctionsInJava();
		
		obj.Test();
		
		int A= obj.Sum();
		System.out.println(A);
		
		String S1= obj.QA();
		System.out.println(S1);
		
		int D= obj.Division(20, 4);
		System.out.println(D);

	}
	
	public void Test() {
		System.out.println("Test Method");
	}
	

	public int Sum() {
		System.out.println("Sum Method");
		int a=10;
		int b=1;
		int c=a+b;
		
		return c;
	}
	
	public String QA() {
		System.out.println("QA Method");
		String S= "Selenium";
		
		return S;
		
	}
	
	public int Division(int p, int q) {
		System.out.println("Division Method");
		
		int d= p/q;
		 return d;
		
	}
}

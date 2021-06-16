package OOPsConcept;

public class GlobalLocalVariables {
	int i=10;
	int j=20;
	String Name= "Fam";

	public static void main(String[] args) {
		int i=15;
		System.out.println(i);
		
		GlobalLocalVariables v= new GlobalLocalVariables();
		
		System.out.println("Global Variables");
		System.out.println(v.i);
		System.out.println(v.j);
		System.out.println(v.Name);
		
		System.out.println("Test Method");
		v.Test();
		
		
	}

	
	public void Test() {
		int i=20;
		int j=30;
		System.out.println("Local Variables for Test Method");
		System.out.println(i+"   "+j);
	}
}

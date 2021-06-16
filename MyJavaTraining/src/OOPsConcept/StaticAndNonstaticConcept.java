package OOPsConcept;

public class StaticAndNonstaticConcept {
	
	String Name= "Hema";
	static int age=25;

	public static void main(String[] args) {
		Test1();
		StaticAndNonstaticConcept.Test1();
		
		System.out.println(age);
		System.out.println(StaticAndNonstaticConcept.age);
		
		StaticAndNonstaticConcept obj= new StaticAndNonstaticConcept();
		System.out.println(obj.Name);
		obj.Test();
		

	}
	public void Test() {
		System.out.println("Test method");
	}
	
	public static void Test1() {
		System.out.println("Test1 Method");
	}

}

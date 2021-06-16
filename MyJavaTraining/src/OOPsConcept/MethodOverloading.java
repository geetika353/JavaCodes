package OOPsConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		
		m.Sum();
		m.Sum(10);
		m.Sum(20);
		m.Sum(90,20);
		m.Sum(1.9);
		

	}
	
	public void Sum() {// 0 input param
		System.out.println("Sum Method---0 Param");
	}

	public void Sum(int i) {
		System.out.println("Sum Method---1 input Param");
		System.out.println(i);
		
	}
	
	public void Sum(int i, int j) {
		System.out.println("Sum Method---2 inputs Param");
		System.out.println(i+j);
		
	}
	
	public void Sum(double d) {
		System.out.println("Sum Method---1 input Param but different Data Type");
		System.out.println(d);
	}
}

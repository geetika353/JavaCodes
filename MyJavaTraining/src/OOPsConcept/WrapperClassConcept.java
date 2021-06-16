package OOPsConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String x="100";
		System.out.println(x+100);
		
		int i= Integer.parseInt(x);
		System.out.println(i+100);// String converted into Integer
		
		String y="12.33";
		System.out.println(y+10.1);
		
		double d= Double.parseDouble(y);
		System.out.println(d+10.1);// String converted into Double
		
		
		String z="True";
		System.out.println(z);
		
		Boolean B= Boolean.parseBoolean(z);
		System.out.println(B);// String converted into Boolean
		
		int j=200;
		System.out.println(j+20);
		
		String s= String.valueOf(j);
		System.out.println(s+20);// integer converted into String
		
		

	}

}

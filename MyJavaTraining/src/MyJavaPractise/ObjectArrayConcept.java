package MyJavaPractise;

public class ObjectArrayConcept {

	public static void main(String[] args) {
		Object ob[]= new Object[6];
		ob[0]= "Tom";
		ob[1]= "London";
		ob[2]= 12.33;
		ob[3]= "1/1/1991";
		ob[4]= "A";
		ob[5]= 500;
		
		System.out.println(ob[3]);
		System.out.println(ob.length);
		System.out.println("+++++++");
		
		//To print all the values using the for Loop
		for(int i=0; i<ob.length;i++) {
			System.out.println(ob[i]);
		}
	}

}

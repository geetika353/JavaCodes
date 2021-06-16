package OOPsConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		BMW B= new BMW();
		
		B.start();
		B.stop();
		B.refuel();
		B.theftsafety();
		
		System.out.println("========");
		Car C=new BMW();
		
		C.start();// Method Overidding
		C.stop();
		C.refuel();
		

	}

}

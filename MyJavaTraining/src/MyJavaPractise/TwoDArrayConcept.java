package MyJavaPractise;

public class TwoDArrayConcept {

	public static void main(String[] args) {
		String x[][]= new String[3][5];
		
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		// First Row
		x[0][0]= "A";
		x[0][1]= "B";
		x[0][2]= "C";
		x[0][3]= "D";
		x[0][4]= "E";
		
		//Second Row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		
		//Third Row
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";
		
		System.out.println(x[1][3]);
		System.out.println(x[2][4]);
		
		//To print all the values of array
		
		for(int r=0; r<x.length; r++) {
			for(int c=0;c<x[0].length; c++) {
				System.out.println(x[r][c]);
			}
		}
		
		
		
	

	}

}

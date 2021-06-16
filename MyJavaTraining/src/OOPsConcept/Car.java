package OOPsConcept;

public class Car {
	int Mod;
	String ModName;

	public static void main(String[] args) {
		Car a= new Car();
		Car b= new Car();
		Car c= new Car();
		
		a.Mod=2010;
		a.ModName="BMW";
		
		b.Mod=2011;
		b.ModName="Audi";
		
		c.Mod=2006;
		c.ModName= "Skoda";
		
		System.out.println(a.Mod+"   "+a.ModName);
		System.out.println(b.Mod+"   "+b.ModName);
		System.out.println(c.Mod+"   "+c.ModName);
		
		//Changing the Reference Variable
		a=b; b=c;c=a;
		
		a.Mod=2013;
		System.out.println(a.Mod);
		
		c.ModName="Tata";
		System.out.println(a.ModName);
		a.ModName= "Chev";
		System.out.println(a.ModName);
		
		b.Mod=2000;
				b.ModName= "Datsun";
		
		System.out.println(b.Mod+"  "+b.ModName);
		

	}

}

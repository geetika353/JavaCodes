package OOPsConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank H= new HSBCBank();
		
		H.Credit();

		H.Debit();
		
		H.EduLoan();
		
		H.Loan();
		
		H.SIP();
		
		H.MutualFund();
		
		System.out.println(USBank.min_Bal);
		
		System.out.println("===========");
		
		USBank U= new HSBCBank();
		
		U.Credit();
		
		U.Debit();
		
		U.Loan();
		
		
		
	}

}

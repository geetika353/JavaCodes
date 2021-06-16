package OOPsConceptPart2;

public class HSBCBank implements USBank, BrazilBank {

	
		public void Debit() {
			System.out.println("HSBC-- Debit");
		}
		
		public void Credit() {
			System.out.println("HSBC-- Credit");
		}
		
		
		public void Loan() {
			System.out.println("HSBC--Loan");
			
		}
		
		public void EduLoan() {
			System.out.println("HSBC--EduLoan");
		}
		
		public void MutualFund() {
			System.out.println("HSBC--MutualFund");
		}
		
		public void SIP() {
			System.out.println("HSBC--SIP");
		}

	

}

class Account{
	int accountBalance;
	int withdrawAmt;
	int depositAmt;

	public Account(){
		accountBalance=1000;
		withdrawAmt=0;
		depositAmt=0;
	}

	public int withdrawAmount(int withdrawAmt){
		return this.accountBalance=this.accountBalance-withdrawAmt;
	}

		public int depositAmount(int depositAmt){
		return this.accountBalance=this.accountBalance+depositAmt;
	}
}

public class AccountTest{
	public static void main(String args[]){
		Account a= new Account();
		int amtAfterWithdraw=a.withdrawAmount(400);
		System.out.println("Balance after withdrawing: "+amtAfterWithdraw);
		int amtAfterDeposit=a.depositAmount(500);
		System.out.println("Balance after depositing: "+amtAfterDeposit);

	}


}
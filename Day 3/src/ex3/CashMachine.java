package families.behavioral.demo8_chain_of_responsibility.ex2;

public class CashMachine {

	private MoneyProcessor startOfChain;

	public CashMachine(){
		startOfChain=new BillsProcessor200(
					 new BillsProcessor100(
					 new BillsProcessor50(
					 new BillsProcessor20(
					 (null)))));
	}

	public void withdraw(int amount){
		if(amount>0){
			startOfChain.processWithdrawRequest(amount);
		}
	}


	public static void main(String[] args) {
		CashMachine machine=new CashMachine();
		machine.withdraw(3492);
		//machine.withdraw(3860);

	}

}

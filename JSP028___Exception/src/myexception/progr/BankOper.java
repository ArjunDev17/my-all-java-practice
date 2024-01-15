package myexception.progr;


class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(String description) {
		super(description);
	}
}

class Account {
	String account_Number;
	String account_Holder;
	String accoun_Type;
	int balance;

	public Account(String account_Number, String account_Holder, String accoun_tType, int balance) {
		this.account_Number = account_Number;
		this.account_Holder = account_Holder;
		this.accoun_Type = accoun_tType;
		this.balance = balance;
	}

}

class Transection {
	public void withdraw(Account account, int withdraw_ammount) {
		try {
			System.out.println("Transection Details");
			System.out.println("********************");
			System.out.println("Account HOlder Name :" + account.account_Holder);
			System.out.println("Account Number :" + account.account_Number);
			System.out.println("Account Type :" + account.accoun_Type);
			System.out.println("Account Balance :" + account.balance);

			if (account.balance > withdraw_ammount) {
				account.balance = account.balance - withdraw_ammount;
				System.out.println("Total amount is  :" + account.balance);
				System.out.println("Transection Succesfully");
			} else {
				System.out.println("YOur current balance is :" + account.balance);
				System.out.println("Faild");
				throw new InsufficientBalanceException("Reason Low Balance");
			}

		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Thank you  visit again");
		}

	}
} 

public class BankOper {
	public static void main(String[] args) {
		Account acc = new Account("1102", "Kabbu", "Saving", 100);
		Transection t1 = new Transection();
		t1.withdraw(acc,400);
	}
}

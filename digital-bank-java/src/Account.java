
public abstract class Account implements InterfaceAccount {
	private static final int DEFAULT_AGENCY = 1;
	private static int SEQUENTIAL = 1;
	
	protected Client client;
	protected int agency;
	protected int number;
	protected double balance;
	
	public Account(Client client) {
		this.client = client;
		this.agency = Account.DEFAULT_AGENCY;
		this.number = SEQUENTIAL++;
	}
	
	int getAgency() {
		return agency;
	}
	
	int getNumber() {
		return number;
	}
	
	double getBalance() {
		return balance;
	}

	@Override
	public void withdraw(double value) {
		balance -= value;
	}

	@Override
	public void deposit(double value) {
		balance += value;
	}

	@Override
	public void transfer(double value, Account destinationAccount) {
		this.withdraw(value);
		destinationAccount.deposit(value);
	}
	
	protected void printValues() {
		System.out.println(String.format("Agencia: %d", this.agency));
		System.out.println(String.format("Número: %d", this.number));
		System.out.println(String.format("Saldo: %.2f", this.balance));
	}
}

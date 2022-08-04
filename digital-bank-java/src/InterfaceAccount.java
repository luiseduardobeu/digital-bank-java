
public interface InterfaceAccount {
	void withdraw(double value);
	void deposit(double value);
	void transfer(double value, Account destinationAccount);
}

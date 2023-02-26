import java.util.Date;

class Transaction{
	private Date date;
	private char type;
	private double amount;
	private double balance;
	private String discription;

	public Transaction(char type,double amount,double balance,String discription){
		this.date = new Date();
		this.type = type;
		this.amount = amount;
		this.balance = balance;
		this.discription = discription;
	}

	public void withdraw(double withdraw){
		balance -= withdraw;
	}

	public void deposit(double deposit){
		balance += deposit;
	}

	public Date getDate(){
		return date;
	}

	public char getType(){
		return type;
	}

	public double getAmount(){
		return amount;
	}

	public double getBalance(){
		return balance;
	}

	public String discription(){
		return discription;
	}
}

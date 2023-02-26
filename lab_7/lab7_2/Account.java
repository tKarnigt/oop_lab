import java.util.Date;
import java.util.ArrayList;

class Account {
    private String name;
    private String id;
    private double balance;
    private double annualInterestRate;
    ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    
    public Account(String name,String id,double balance,double annualInterestRate){
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String setName(){
        return name;
    }

    public String setId(){
        return id;
    }

    public double setBalance(){
        return balance;
    }

    public void withdraw(double withdraw){
        if(withdraw>0){
            balance -= withdraw;
            if(balance>=0){
                this.transactions.add(new Transaction('W',withdraw,balance,""));
            }
            else{
                balance+=withdraw;
            }
        }
        
    }

    public void deposit(double deposit){
       if(deposit>0){
            balance += deposit;
            this.transactions.add(new Transaction('D',deposit,balance,""));
       }
    }

    public void getName(String name){
        this.name = name;
    }

    public void getId(String id){
        this.id = id;
    }

    public void getBalance(double balance){
        this.balance = balance;
    }

    public void showTransactions(){
        System.out.println("Name: "+name);
        System.out.println("Account ID: "+id);
        System.out.println("Annual interest rate: " + annualInterestRate);
        System.out.printf("Balance: %.2f\n",balance);
        System.out.println("Date\t\t\t\tType\t\tAmount\t\tBalance");
        for(int i=0;i<transactions.size();i++){
            Transaction ts = transactions.get(i);
            System.out.println(ts.getDate() + "\t" +
                ts.getType() +  "\t\t" +
                ts.getAmount() +  "\t\t" +
                ts.getBalance());
        }
    }
}

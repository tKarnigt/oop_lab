public class App {
    public static void main(String[] args) throws Exception {
        Account account = new Account("George", "1122", 1000,1.65);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);
        account.showTransactions();
    }
}

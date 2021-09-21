package Gun48.Soru2;

public class Account {

    private int accountNumber;
    private double balance;

    public Account(int accountNumber, int balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double  Deposit(double deposit){
        balance+=deposit;
        return balance;
    }

    public double  WithDraw(double amount) throws Exception {
        if (amount >5000)
            throw new Exception("Gunluk limiti astiniz");
        else
            balance-= amount;

        return balance;
    }
}

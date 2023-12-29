package bookProgEX.EX05.ProgEx01;

public class BankAccount {
    int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void transfer(int amount, BankAccount otherAccount){
        balance = balance - amount;
        otherAccount.balance = amount;
    }
    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}

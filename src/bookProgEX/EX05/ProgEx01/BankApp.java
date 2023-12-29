package bookProgEX.EX05.ProgEx01;

public class BankApp {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount(10000);
        BankAccount a2 = new BankAccount(0);
        System.out.println("a1: "+a1);
        System.out.println("a2: "+a2+"\n");

        a1.transfer(1000,a2);
        System.out.println("a1: "+a1);
        System.out.println("a2: "+a2);
    }
}

package ex04.example;

import ex04.example.model.Account;
import ex04.example.model.User;

// 트랜잭션 관리
public class BankService {

    public static void withdrawCheck(Account withdrawAccount, long amount) {
        if (amount <= 0) {
            System.out.println("0원 이하 금액을 출금할 수 없습니다.");
        }
        if (withdrawAccount.lack(amount)) {
            System.out.println("잔액이 부족합니다.");
            return;
        }
        withdrawAccount.withdraw(amount);
    }

    public static void transfer(Account senderAccount, Account receiverAccount, long amount) {
        if (amount <= 0) {
            System.out.println("0원 이하 금액을 이체할 수 없습니다.");
        }

        // 잔액확인
        if (senderAccount.lack(amount)) {
            System.out.println("잔액이 부족합니다.");
            return;

        }
        senderAccount.withdraw(amount);
        receiverAccount.deposit(amount);
    }
}
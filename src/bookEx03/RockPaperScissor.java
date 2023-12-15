package bookEx03;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가위(0), 바위(1), 보(2): ");
        int user = sc.nextInt();

        int computer = (int) (Math.random() * 3);
        if (user == computer) {
            System.out.println("무승부");
        } else if (user == (computer + 1) % 3) {
            System.out.println("인간: " + user + " " + "컴퓨터: " + computer + "   user win");
        }else {
            System.out.println("인간: " + user + " " + "컴퓨터: " + computer + "   computer win");
        }
    }
}
package bookEx02;

import java.util.Scanner;

public class ProgEx05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("시간 간격을 입력하시오: ");
        int sec = sc.nextInt();

        int sound = sec * 340;
        int flash = sec * 300000000;
        int light = flash % sound;

        System.out.print("번개가 발생한 곳까지의 거리: " + light);
    }
}

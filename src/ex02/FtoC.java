package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        double f_temp;
        double c_temp;

        Scanner sc = new Scanner(System.in);

        System.out.print("화씨온도를 입력하시오: ");
        f_temp = sc.nextDouble();
        c_temp = (double) 5 / 9 * (f_temp - 32);
        System.out.println("섭씨온도는 " + c_temp);

    }
}

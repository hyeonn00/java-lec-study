package ex02;

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        double c_temp;
        double f_temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("섭씨온도를 입력하시오: ");
        c_temp = sc.nextDouble();

        f_temp = (double) 9 / 5 * c_temp + 32;
        System.out.print("화씨온도는 " + f_temp);
    }

}

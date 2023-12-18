package ex03;

import java.util.Scanner;

public class ProgEx12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, count = 0;
        double avg = 0;
        while (true){
            count++;
            System.out.print("성적을 입력하세요: ");
            int num = sc.nextInt();
            int[] arr = new int[num];
            sum = sum + arr[count];

            avg = sum / count;
            if (num == -1){
                break;
            }

        }
    }
//        System.out.println("합계: " + sum);
//        System.out.println("평균: " + avg);

}

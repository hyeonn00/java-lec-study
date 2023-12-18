package ex03;

import java.util.Scanner;

public class ProgEx12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg;
        int i = 0;
        int count = 0;
        while (true){
            i++;
            count++;
            System.out.print("성적을 입력하세요: " );
            int [] n = new int [sc.nextInt()];
            sum += n[i];
            avg = (double) sum / count;

        }
        //System.out.println("합계: " );
        //System.out.println("평균: " + avg);
    }
}

package ex03;

    class GugudanUtill {
        static void gugudan(int x) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(x + "*" + i + "=" + (x * i));
            }
        }
    }
public class GugudanEx04 {

    public static void main(String[] args) {
        // 구구단을 출력해주는 메소드
        // GugudanUtill 클래스에 gugudan static 메서드를 호출하시오.
        // Parameter는 int 한개가 필요합니다.

        GugudanUtill.gugudan(8);
    }
}

